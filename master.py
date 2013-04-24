'''
	This is the master host to issue the motion injection
	to the device for certain package.

	To support multiple devices simutaneous execution, a
	threaded master is enabled to handle the request from
	different devices and inject different motion streams.

	Now it works through the WiFi network, the ideal mode
	is through USB directly.
'''
import SocketServer
import threading
import os

class ThreadedMasterTcpHandler(SocketServer.BaseRequestHandler):
	
	def handle(self):
		data = self.request.recv(1024).strip()
		print data
		print data.decode().encode("utf-8")
		packageName = data.split(":")[1]
		deviceSerialNumber = data.split(":")[2]
		# return the SUCCESS signal
		self.request.sendall("0")
		# issue motion injections.
		os.system("adb -s "+ deviceSerialNumber 
			+ " shell monkey -p " + packageName + " -v 200")

class ThreadedMasterTcpServer(SocketServer.ThreadingMixIn, 
							SocketServer.TCPServer):
	pass

if __name__ == "__main__":
	HOST, PORT = "192.168.10.144", 15100
	server = ThreadedMasterTcpServer((HOST, PORT), 
		ThreadedMasterTcpHandler)
	server_thread = threading.Thread(target=server.serve_forever)
	#server_thread.daemon = True
	server_thread.start()
