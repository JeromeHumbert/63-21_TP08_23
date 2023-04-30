public class AnalyseVirale extends Analyse
{
    private String nomVirus;
    private boolean valeurAnalyse;

    public AnalyseVirale(int analyseID, int patientID, String nomVirus, boolean valeurAnalyse)
    {
        super(analyseID, patientID);
        this.nomVirus = nomVirus;
        this.valeurAnalyse = valeurAnalyse;
    }

	//A compléter
}
