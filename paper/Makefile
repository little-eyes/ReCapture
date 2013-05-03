LATEX = pdflatex
BIBTEX = bibtex

all: ieee

ieee: main.tex
	$(LATEX) main.tex
	$(BIBTEX) main.aux
	$(LATEX) main.tex

clean:
	rm *.aux *.log *.pdf *.bbl *.blg
