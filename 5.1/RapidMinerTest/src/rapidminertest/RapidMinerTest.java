
package rapidminertest;

import com.rapidminer.tools.OperatorService;
import com.rapidminer.RapidMiner;
import com.rapidminer.example.ExampleSet;
import com.rapidminer.Process;
import com.rapidminer.gui.tools.dialogs.wizards.dataimport.csv.CSVFileReader;
import com.rapidminer.operator.IOContainer;
import com.rapidminer.operator.Operator;
import com.rapidminer.operator.OperatorCreationException;
import com.rapidminer.operator.OperatorException;
import com.rapidminer.operator.Value;
import com.rapidminer.operator.io.CSVExampleSetWriter;
import com.rapidminer.operator.io.ModelWriter;
import com.rapidminer.operator.io.RepositorySource;
import com.rapidminer.operator.learner.bayes.NaiveBayes;
import com.rapidminer.operator.nio.CSVExampleSource;
import com.rapidminer.operator.ports.InputPort;
import com.rapidminer.operator.ports.InputPorts;
import com.rapidminer.operator.ports.OutputPort;
import com.rapidminer.operator.ports.OutputPorts;
import com.rapidminer.operator.preprocessing.transformation.aggregation.AggregationOperator;
import com.rapidminer.parameter.Parameters;
import com.rapidminer.tools.XMLException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author zmatlja1
 */
public class RapidMinerTest {
    
    static final String projectPWD = "C:\\Users\\Zis\\Desktop\\FEL\\Diplomka\\RapidMiner\\RapidMinerTestAPI\\5.1\\RapidMinerTest\\";
        /**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, XMLException {
//		String rapidMinerHome = "/usr/local/rapidminer";
//		System.setProperty("rapidminer.home", rapidMinerHome);
		RapidMiner.setExecutionMode(RapidMiner.ExecutionMode.COMMAND_LINE);
		RapidMiner.init();
		
		try {
			/* Reading Data */
//			Operator trainingDataReader = OperatorService.createOperator(CSVExampleSource.class);
//			trainingDataReader.setParameter("csv_file", RapidMinerTest.projectPWD + "report1.csv"); 
//                        trainingDataReader.setParameter("column_separators", ";");
//                        
//                        //IOContainer c = trainingDataReader.app
//			
//			/* Classifier */
//			Operator aggregation = OperatorService.createOperator(AggregationOperator.class);
//                        //aggregation.setParameter("keep_example_set", "true");
//                        //aggregation.setParameter("aggregation_attributes", "sum");
//                        aggregation.setParameter("aggregation_function", "sum");
//                        aggregation.setParameter("aggregation_name", "number");
//                        
//                        //aggregation.execute();
//                        
//                        
//                        Parameters par = aggregation.getParameters();
//                        
//                        for(String p : par.getKeys())
//                            System.out.println("- " + p);
//                        
//                        OutputPorts in = aggregation.getOutputPorts();
//                        for( OutputPort p : in.getAllPorts() )
//                        {
//                            System.out.println(p.getName());
//                        }
                            
			
                        
			/* Save model */
//			Operator modelWriter = OperatorService.createOperator(ModelWriter.class);
//			modelWriter.setParameter("model_file", "t.txt");
                        
//                        Operator csvWriter = OperatorService.createOperator(CSVExampleSetWriter.class);  
//                        csvWriter.setParameter("csv_file", RapidMinerTest.projectPWD + "report_OUT.csv");  
//                        csvWriter.setParameter("column_separator", ";");
			
                        
			Process process = new Process(new File(RapidMinerTest.projectPWD + "aggregation.xml"));
                        
			
			/*process.getRootOperator().getSubprocess(0).addOperator(trainingDataReader);
			process.getRootOperator().getSubprocess(0).addOperator(aggregation);
			process.getRootOperator().getSubprocess(0).addOperator(csvWriter);
                      
                       trainingDataReader.getOutputPorts().getPortByName("output").connectTo(aggregation.getInputPorts().getPortByName("example set input"));
                       aggregation.getOutputPorts().getPortByName("original").connectTo(csvWriter.getInputPorts().getPortByName("input"));

			
			/**/
			
                        System.out.println(process.getRootOperator().createProcessTree(0));
			
			process.run();
			

			
			
		}
//                catch (OperatorCreationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
                catch (OperatorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
    
//    public static void main(String[] argv) throws Exception
//    {
//    
//        RapidMiner.init();
//        CSVFileReader r = new CSVFileReader(new File("report.csv"), true, null, null);
//
//        while(r != null && r.getDataReader().hasNext())
//                    System.out.println(r.getDataReader().next() + "-");
//        
//        System.out.println("END");
//    }
}
