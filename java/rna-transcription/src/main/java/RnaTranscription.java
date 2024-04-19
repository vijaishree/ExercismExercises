class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = new String();


        for(int strand =0 ; strand<dnaStrand.length();strand++) {

            if (dnaStrand.charAt(strand) == 'C') {rnaStrand = rnaStrand.concat("G");}
            if (dnaStrand.charAt(strand) == 'G') {rnaStrand = rnaStrand.concat("C");}
            if (dnaStrand.charAt(strand) == 'T') {rnaStrand = rnaStrand.concat("A");}
            if (dnaStrand.charAt(strand) == 'A') {rnaStrand = rnaStrand.concat("U");}
        }


        return rnaStrand;

    }
}
