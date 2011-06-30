###################################################
#                                                 #
# Makefile - builds the document                  #
#                                                 #
###################################################


MAIN_MODULE = migdb-mapping.pdf

################# No changes beyond this line #####
# Check if this has been invoked from submake (TOPDIR has been set)
# if not, set the TOPDIR to point where the source code start directory
ifeq ($(strip $(TOPDIR)),)
    TOPDIR = $(shell /bin/pwd)/..
endif

# latex tools
LATEX = latex
PDFLATEX = pdflatex
BIBTEX = bibtex
INDEX = makeindex

# source file generated from xml
STYLEFILE = book.sty


FILES = $(wildcard *.tex) \
	$(STYLEFILE) \
	makra.sty \
	$(wildcard ../graphics/*.jpg) \
	$(wildcard ../graphics/*.png)


.phony: all
all: $(MAIN_MODULE)

%.pdf: %.eps

clean:
	rm -f *~ *log *lof *toc *aux *bbl *blg *out *pdf  *lot

$(MAIN_MODULE): $(FILES)


#	-$(BIBTEX) $(<:.tex=)
%.pdf: %.tex
	$(PDFLATEX) $<
	$(PDFLATEX) $<
	$(PDFLATEX) $<
	cp $@ ../
