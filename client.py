import socket
import time
import sys
import csv
import threading

HOST, PORT = "192.168.10.144", 15100
data = " ".join(sys.argv[1:])

stat = csv.writer(open('stat.csv', 'w'), delimiter=',')

class Box(threading.Thread):

	def run(self):
		# Create a socket (SOCK_STREAM means a TCP socket)
		sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
		try:
			start = time.time()
    		# Connect to server and send data
			sock.connect((HOST, PORT))
			sock.sendall(data + "\n")
			# Receive data from the server and shut down
			received = sock.recv(1024)
			sock.close()
			end = time.time()
			stat.writerow([end - start])
		finally:
			sock.close()
			print "Sent:     {}".format(data)
			print "Received: {}".format(received)

if __name__ == '__main__':
	for i in range(1000000):
		box = Box()
		box.start()
