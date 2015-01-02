import java.applet.*;
import java.awt.*;

public class Calculator extends Applet
{
    // Button Declaration
    TextField output = new TextField ("0");
    public Button one = new Button ("1");
    public Button two = new Button ("2");
    public Button three = new Button ("3");
    public Button four = new Button ("4");
    public Button five = new Button ("5");
    public Button six = new Button ("6");
    public Button seven = new Button ("7");
    public Button eight = new Button ("8");
    public Button nine = new Button ("9");
    public Button zero = new Button ("0");
    public Button add = new Button ("+");
    public Button sub = new Button ("-");
    public Button mul = new Button ("*");
    public Button div = new Button ("/");
    public Button pow = new Button ("x^y");
    public Button fac = new Button ("!");
    public Button sin = new Button ("sin");
    public Button cos = new Button ("cos");
    public Button tan = new Button ("tan");
    public Button deci = new Button (".");
    public Button neg = new Button ("+/-");
    public Button equals = new Button ("=");
    public Button clear = new Button ("C");
    public Button pi = new Button ("\u03c0");
    public Button sq = new Button ("\u221A");
    public Button csc = new Button ("csc");
    public Button sec = new Button ("sec");
    public Button cot = new Button ("cot");
    public Button blank = new Button ("");
    public CheckboxGroup degree = new CheckboxGroup ();
    public Checkbox deg = new Checkbox ("deg", degree, true);
    public Checkbox rad = new Checkbox ("rad", degree, false);
    public Button range = new Button ("Range");
    public Button bin = new Button ("Bin");
    public Button del = new Button ("del");
    public Button per = new Button ("nPr");
    public Button comp = new Button ("Vector");
    public Button root = new Button ("Cubic Roots");
    public Button dec = new Button ("Bin-Dec");
    public Button mod = new Button ("Mod");
    public Button slope = new Button ("Slope");
    public Button line = new Button ("Line Length");
    public Button midpoint = new Button ("Midpoint");
    public Button mode = new Button ("Mode");
    public Button mean = new Button ("Mean");
    public Button median = new Button ("Median");
    public Button comma = new Button ("Comma");
    public Button log = new Button ("Log");
    public Button in = new Button ("In");
    public Button arcsin = new Button ("Arcsin");
    public Button arccos = new Button ("Arccos");
    public Button arctan = new Button ("Arctan");

    // Calculator Layout
    public void init ()
    {
	setSize (500, 300);
	setLayout (new BorderLayout ());
	Panel north = new Panel ();
	Panel centre = new Panel ();
	Panel west = new Panel ();
	Panel east = new Panel ();
	west.setLayout (new GridLayout (13, 1));
	north.setLayout (new BorderLayout ());
	centre.setLayout (new GridLayout (13, 3));
	east.setLayout (new GridLayout (7, 0));

	north.add (output);
	west.add (pi);
	west.add (sq);
	west.add (pow);
	west.add (comp);
	west.add (root);

	//setBackground (Color.gray);
	centre.add (deg);
	deg.setBackground (Color.red);
	//centre.add (blank);
	//blank.setVisible (false);
	centre.add (in);
	centre.add (rad);
	rad.setBackground (Color.cyan);
	centre.add (sin);
	centre.add (cos);
	centre.add (tan);
	centre.add (seven);
	seven.setBackground (Color.yellow);
	centre.add (eight);
	eight.setBackground (Color.yellow);
	centre.add (nine);
	nine.setBackground (Color.yellow);
	//centre.add (add);
	centre.add (four);
	four.setBackground (Color.yellow);
	centre.add (five);
	five.setBackground (Color.yellow);
	centre.add (six);
	six.setBackground (Color.yellow);
	//centre.add (sub);
	centre.add (one);
	one.setBackground (Color.yellow);
	centre.add (two);
	two.setBackground (Color.yellow);
	centre.add (three);
	three.setBackground (Color.yellow);
	//centre.add (mul);
	centre.add (zero);
	zero.setBackground (Color.yellow);
	centre.add (deci);
	deci.setBackground (Color.yellow);
	centre.add (neg);
	neg.setBackground (Color.yellow);
	//centre.add (div);
	centre.add (fac);
	//centre.add (equals);
	centre.add (clear);
	centre.add (csc);
	centre.add (sec);
	centre.add (cot);
	centre.add (per);
	centre.add (slope);
	centre.add (line);
	centre.add (midpoint);
	centre.add (comma);
	centre.add (arcsin);
	centre.add (arccos);
	centre.add (arctan);
	centre.add (log);


	west.add (range);
	west.add (bin);
	west.add (dec);
	west.add (mod);
	west.add (mean);
	west.add (mode);
	centre.add (median);


	east.add (del);
	east.add (div);
	east.add (mul);
	east.add (sub);
	east.add (add);
	east.add (equals);


	add (north, BorderLayout.NORTH);
	add (west, BorderLayout.WEST);
	add (centre);
	add (east, BorderLayout.EAST);

    }


    String enter = "";
    double temp = 0;
    double temp1 = 0;
    double answer = 0;
    int operation = 0;
    String velocity = "";
    String angle = "";
    String field = "";
    String n = "";
    String r = "";
    int count = 0;
    int position = 0;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    int count5 = 0;
    int count6 = 0;
    int count7 = 0;
    int count8 = 0;
    int count9 = 0;
    int show = 0;
    int show1 = 0;
    int show2 = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;
    String vec = "";
    String angle1 = "";
    String user = "";
    String list = "";
    double x1 = 0;
    double x2 = 0;
    double y1 = 0;
    double y2 = 0;



    // Calculations
    public boolean action (Event evt, Object o)
    {
	// Program crash preventer
	try
	{
	    // Simple Buttons of Calculator
	    if (evt.target == (one))
	    {
		enter = enter + "1";
		output.setText (enter);
	    }
	    if (evt.target == (two))
	    {
		enter = enter + "2";
		output.setText (enter);
	    }
	    if (evt.target == (three))
	    {
		enter = enter + "3";
		output.setText (enter);
	    }
	    if (evt.target == (four))
	    {
		enter = enter + "4";
		output.setText (enter);
	    }
	    if (evt.target == (five))
	    {
		enter = enter + "5";
		output.setText (enter);
	    }
	    if (evt.target == (six))
	    {
		enter = enter + "6";
		output.setText (enter);
	    }
	    if (evt.target == (seven))
	    {
		enter = enter + "7";
		output.setText (enter);
	    }
	    if (evt.target == (eight))
	    {
		enter = enter + "8";
		output.setText (enter);
	    }
	    if (evt.target == (nine))
	    {
		enter = enter + "9";
		output.setText (enter);
	    }
	    if (evt.target == (zero))
	    {
		enter = enter + "0";
		output.setText (enter);
	    }
	    if (evt.target == (deci))
	    {
		enter = enter + ".";
		output.setText (enter);
	    }

	    if (evt.target == comma)
	    {
		enter = enter + ",";
		output.setText (enter);
	    }

	    // Clear button; clears all memory (variables)
	    if (evt.target == (clear))
	    {
		enter = "";
		operation = 0;
		output.setText ("0");
		count = 0;
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		count5 = 0;
		count6 = 0;
		count7 = 0;
		count8 = 0;
		count9 = 0;
		show = 0;
		show1 = 0;
		show2 = 0;
	    }

	    // Trig calculations
	    if (evt.target == arcsin)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin2 = Math.asin (temp1);
		    output.setText (Double.toString (sin2 * (Math.PI / 180)));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin2 = Math.asin (temp1);
		    output.setText (Double.toString (sin2));
		    enter = "";
		}
	    }
	    if (evt.target == arccos)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double cos2 = Math.acos (temp1);
		    output.setText (Double.toString (cos2 * (Math.PI / 180)));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double cos2 = Math.asin (temp1);
		    output.setText (Double.toString (cos2));
		    enter = "";
		}
	    }
	    if (evt.target == arctan)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double tan2 = Math.acos (temp1);
		    output.setText (Double.toString (tan2 * (Math.PI / 180)));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double tan2 = Math.asin (temp1);
		    output.setText (Double.toString (tan2));
		    enter = "";
		}
	    }
	    if (evt.target == log)
	    {

		temp1 = Double.parseDouble (output.getText ());
		double log1 = Math.log (temp1) / (Math.log (10));
		output.setText (Double.toString (log1));
		enter = "";

	    }
	    if (evt.target == in)
	    {

		temp1 = Double.parseDouble (output.getText ());
		double log1 = Math.log (temp1);
		output.setText (Double.toString (log1));
		enter = "";

	    }

	    // Slope calculation, entries are seperated by commas
	    if (evt.target == slope)
	    {
		if (count5 == 0)
		{
		    enter = "Enter x1: ";
		    output.setText (enter);
		    count5 = 1;
		}
		else if (count5 == 1)
		{
		    x1 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter y1: ";
		    output.setText (enter);
		    count5 = 2;
		}
		else if (count5 == 2)
		{
		    y1 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter x2: ";
		    output.setText (enter);
		    count5 = 3;
		}
		else if (count5 == 3)
		{
		    x2 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter y2: ";
		    output.setText (enter);
		    count5 = 4;
		}

		// Finals slope calculation (y2-y1)/(x2-x1)
		else if (count5 == 4)
		{
		    y2 = Double.parseDouble (output.getText ().substring (10));
		    double slope = (y2 - y1) / (x2 - x1);
		    output.setText ("The slope is: " + Double.toString (slope));
		    count5 = 0;

		}

	    }

	    // Length of line calculation; entries seperated by commas
	    if (evt.target == line)
	    {
		if (count4 == 0)
		{
		    enter = "Enter x1: ";
		    output.setText (enter);
		    count4 = 1;
		}
		else if (count4 == 1)
		{
		    x1 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter y1: ";
		    output.setText (enter);
		    count4 = 2;
		}
		else if (count4 == 2)
		{
		    y1 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter x2: ";
		    output.setText (enter);
		    count4 = 3;
		}
		else if (count4 == 3)
		{
		    x2 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter y2: ";
		    output.setText (enter);
		    count4 = 4;
		}
		// Final calculation ((x2-x1)^2 + (y2-y1) ^2) ^ (1/2)
		else if (count4 == 4)
		{
		    y2 = Double.parseDouble (output.getText ().substring (10));
		    double length = Math.sqrt (Math.pow ((x2 - x1), 2) + Math.pow ((y2 - y1), 2));
		    output.setText ("The length is: " + Double.toString (length));
		    count4 = 0;
		}
	    }

	    // Midpoint of a line calculation
	    if (evt.target == midpoint)
	    {
		if (count6 == 0)
		{
		    enter = "Enter x1: ";
		    output.setText (enter);
		    count6 = 1;
		}
		else if (count6 == 1)
		{
		    x1 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter y1: ";
		    output.setText (enter);
		    count6 = 2;
		}
		else if (count6 == 2)
		{
		    y1 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter x2: ";
		    output.setText (enter);
		    count6 = 3;
		}
		else if (count6 == 3)
		{
		    x2 = Double.parseDouble (output.getText ().substring (10));
		    enter = "Enter y2: ";
		    output.setText (enter);
		    count6 = 4;
		}

		// Final calculation of midpoint, x and y are averaged
		else if (count6 == 4)
		{
		    y2 = Double.parseDouble (output.getText ().substring (10));
		    double midx = (x2 + x1) / 2;
		    double midy = (y1 + y2) / 2;
		    output.setText ("The midpoint is: " + "(" + Double.toString (midx) + "," + Double.toString (midy) + ")");
		    count6 = 0;
		}

	    }

	    // Quadratic root calculation
	    if (evt.target == root)
	    {
		if (count3 == 0)
		{
		    enter = "ax^3 + bx^2 + cx + d, Enter a: ";
		    output.setText (enter);
		    count3 = 1;
		}
		else if (count3 == 1)
		{
		    a = Double.parseDouble (output.getText ().substring (31));
		    enter = "ax^3 + bx^2 + cx + d, Enter b: ";
		    output.setText (enter);
		    count3 = 2;
		}
		else if (count3 == 2)
		{
		    b = Double.parseDouble (output.getText ().substring (31));
		    enter = "ax^3 + bx^2 + cx + d, Enter c: ";
		    output.setText (enter);
		    count3 = 3;
		}
		else if (count3 == 3)
		{
		    c = Double.parseDouble (output.getText ().substring (31));
		    enter = "ax^3 + bx^2 + cx + d, Enter d: ";
		    output.setText (enter);
		    count3 = 4;
		}

		// Root limiter
		else if (count3 == 4)
		{
		    d = Double.parseDouble (output.getText ().substring (31));

		    double r = -1000;
		    int track = 0;
		    while (Math.round (a * Math.pow (r, 3) + b * Math.pow (r, 2) + c * r + d) != 0)
		    {
			r = r + 0.02;
			track++;
			if (track > 1000003)
			{
			    break;
			}
		    }

		    // Calculation for a single root
		    if (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2) == 0 && (b * (-1) - r * a + Math.sqrt (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2))) / (2 * a) != r && track < 1000003)
		    {
			double root1 = (b * (-1) - r * a + Math.sqrt (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2))) / (2 * a);
			output.setText ("aprox. roots = " + ((double) Math.round (r * 1000) / 1000) + ", " + ((double) Math.round (root1 * 1000) / 1000));
		    }

		    // Calculation for a double root
		    else if (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2) > 0 && (b * (-1) - r * a + Math.sqrt (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2))) / (2 * a) != r && (b * (-1) - r * a - Math.sqrt (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2))) / (2 * a) != r && track < 1000003)
		    {
			double root1 = (b * (-1) - r * a + Math.sqrt (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2))) / (2 * a);
			double root2 = (b * (-1) - r * a - Math.sqrt (Math.pow (b, 2) - 4 * a * c - 2 * a * b * r - 3 * Math.pow (a, 2) * Math.pow (r, 2))) / (2 * a);
			output.setText ("aprox. roots = " + ((double) Math.round (r * 1000) / 1000) + ", " + ((double) Math.round (root1 * 1000) / 1000) + ", " + ((double) Math.round (root2 * 1000) / 1000));
		    }

		    // Root limiter if no roots exists
		    else if (track > 1000003)
		    {
			output.setText ("Calculator cannot calculate roots");
		    }
		    else
		    {
			output.setText ("aprox. root = " + ((double) Math.round (r * 1000) / 1000));
		    }
		    count3 = 0;
		}


	    }

	    // n Pick r calculation
	    if (evt.target == per)
	    {
		if (count1 == 0)
		{
		    enter = "Enter a value for n: ";
		    output.setText (enter);
		    count1 = 1;
		}
		else if (count1 == 1)
		{
		    n = output.getText ().substring (20);
		    enter = "Enter a value for r: ";
		    output.setText (enter);
		    count1 = 2;

		}
		else
		{
		    r = output.getText ().substring (20);
		    output.setText (n + r);
		    double n1 = factorial (Double.parseDouble (n));
		    double r1 = factorial (Double.parseDouble (n) - Double.parseDouble (r));
		    output.setText (Double.toString (n1 / r1));
		    count1 = 0;
		}
	    }

	    // Backspace Button on Calculation
	    if (evt.target == del)
	    {
		enter = output.getText ();
		position = enter.length ();
		output.setText (enter.substring (0, position - 1));
		enter = enter.substring (0, position - 1);
	    }

	    // Compenent vector
	    if (evt.target == comp)
	    {
		if (count2 == 0)
		{
		    enter = "Enter magnitude of vector value: ";
		    output.setText (enter);
		    count2 = 1;
		}
		else if (count2 == 1)
		{

		    vec = output.getText ().substring (33);
		    enter = "Enter angle in relation to x-axis: ";
		    output.setText (enter);
		    count2 = 2;
		}
		else
		{
		    angle1 = output.getText ().substring (35);
		    if (deg.getState ())
		    {
			double xcomp = Double.parseDouble (vec) * (Math.cos (Double.parseDouble (angle1) * (Math.PI / 180)));
			double ycomp = Double.parseDouble (vec) * (Math.sin (Double.parseDouble (angle1) * (Math.PI / 180)));
			output.setText ("x-comp = " + xcomp + " y-comp = " + ycomp);
		    }
		    else
		    {
			double xcomp = Double.parseDouble (vec) * (Math.cos (Double.parseDouble (angle1)));
			double ycomp = Double.parseDouble (vec) * (Math.sin (Double.parseDouble (angle1)));
			output.setText ("x-comp = " + xcomp + "the y-comp = " + ycomp);
		    }
		    count2 = 0;


		}
	    }

	    // Range equation
	    if (evt.target == (range))
	    {
		if (count == 0)
		{
		    enter = "Enter Magnitude of intial velocity: ";
		    output.setText (enter);
		    count = 1;
		}
		else if (count == 1)
		{
		    velocity = output.getText ().substring (36);
		    enter = "Enter launch angle: ";
		    output.setText (enter);
		    count = 2;
		}
		else if (count == 2)
		{

		    angle = output.getText ().substring (20);
		    enter = "Enter accleration due to gravitational field (m/s^2): ";
		    output.setText (enter);
		    count = 3;
		}
		else if (count == 3)
		{

		    field = output.getText ().substring (54);
		    if (deg.getState ())
		    {
			double ans = (Math.pow (Double.parseDouble (velocity), 2) * Math.sin (2 * Double.parseDouble (angle) * (Math.PI / 180))) / (Double.parseDouble (field));
			output.setText ("The range is " + ans + " m");
		    }
		    else
		    {
			double ans = (Math.pow (Double.parseDouble (velocity), 2) * Math.sin (2 * Double.parseDouble (angle))) / 9.8049;
			output.setText ("The range is " + ans + " m");
		    }
		    count = 0;
		}
	    }
	    // Decimal to binary convertor
	    if (evt.target == bin)
	    {
		int number = (int)(Double.parseDouble (output.getText ()));
		String binary = convert (number);
		output.setText (binary);
	    }
	    // Binary to decimal
	    if (evt.target == dec)
	    {
		double decimal = 0;
		String number = (output.getText ());


		/*if (number.indexOf ("2") == -1 && number.indexOf ("3") == -1 && number.indexOf ("4") == -1 && number.indexOf ("5") == -1 && number.indexOf ("6") == -1 && number.indexOf ("7") == -1 && number.indexOf ("8") == -1 && number.indexOf ("9") == -1)
		{
		    // 2's complement
		    if (number.indexOf ("1") == 0)
		    {
			int pos = 1;
			double flip = Math.pow (2, (number.length () - 1));
			for (int i = number.length () - 1 ; i > 0 ; i--)
			{
			    if (number.charAt (pos) == ('1'))
			    {
				decimal = decimal + (Math.pow (2, i - 1));
			    }
			    pos++;
			}
			decimal = (decimal - flip);
			String ans = Double.toString (decimal);
			output.setText (ans);


		    }*/
		// Normal binary to decimal
		int pos = 0;
		for (int i = number.length () ; i > 0 ; i--)
		{
		    if (number.charAt (pos) == ('1'))
		    {
			decimal = decimal + (Math.pow (2, i - 1));
		    }
		    pos++;
		}
		String ans = Double.toString (decimal);
		output.setText (ans);
	    }


	    // Calculator operations

	    // Pi dislay (in unicode)
	    if (evt.target == (pi))
	    {
		temp1 = Double.parseDouble (output.getText ());
		enter = enter + "\u03c0";
		output.setText (enter);
		operation = 5;
	    }


	    // Factorial
	    if (evt.target == (fac))
	    {
		temp1 = Double.parseDouble (output.getText ());
		double fact = 1;
		for (int i = 1 ; i <= temp1 ; i++)
		{
		    fact = fact * i;
		}
		output.setText (Double.toString (fact));
	    }


	    // Power
	    if (evt.target == (pow))
	    {
		temp1 = Double.parseDouble (output.getText ());
		output.setText ("0");
		enter = "";
		operation = 6;

	    }


	    // Square root
	    if (evt.target == (sq))
	    {
		temp1 = Math.sqrt (Double.parseDouble (output.getText ()));
		output.setText (Double.toString (temp1));
		enter = "";

	    }


	    // Trig calculators
	    if (evt.target == sin)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = taylorsin (temp1 * (Math.PI / 180));
		    output.setText (Double.toString (sin1));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = taylorsin (temp1);
		    output.setText (Double.toString (sin1));
		    enter = "";
		}


	    }


	    if (evt.target == cos)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double cos1 = taylorcos (temp1 * (Math.PI / 180));
		    output.setText (Double.toString (cos1));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double cos1 = taylorcos (temp1);
		    output.setText (Double.toString (cos1));
		    enter = "";
		}
	    }


	    if (evt.target == tan)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = Math.sin (temp1 * (Math.PI / 180));
		    double cos1 = Math.cos (temp1 * (Math.PI / 180));
		    double tan1 = sin1 / cos1;
		    output.setText (Double.toString (tan1));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = Math.sin (temp1);
		    double cos1 = Math.cos (temp1);
		    double tan1 = sin1 / cos1;
		    output.setText (Double.toString (tan1));
		    enter = "";
		}
	    }


	    if (evt.target == csc)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = 1 / (Math.sin (temp1 * (Math.PI / 180)));
		    output.setText (Double.toString (sin1));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = 1 / (Math.sin (temp1));
		    output.setText (Double.toString (sin1));
		    enter = "";
		}
	    }


	    if (evt.target == sec)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double cos1 = 1 / (Math.cos (temp1 * (Math.PI / 180)));
		    output.setText (Double.toString (cos1));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double cos1 = 1 / (Math.cos (temp1));
		    output.setText (Double.toString (cos1));
		    enter = "";
		}
	    }


	    if (evt.target == cot)
	    {
		if (deg.getState ())
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = Math.sin (temp1 * (Math.PI / 180));
		    double cos1 = Math.cos (temp1 * (Math.PI / 180));
		    double tan1 = sin1 / cos1;
		    output.setText (Double.toString (1 / tan1));
		    enter = "";
		}
		else
		{
		    temp1 = Double.parseDouble (output.getText ());
		    double sin1 = Math.sin (temp1);
		    double cos1 = Math.cos (temp1);
		    double tan1 = sin1 / cos1;
		    output.setText (Double.toString (1 / tan1));
		    enter = "";
		}
	    }


	    // Negative, by multiplying -1
	    if (evt.target == (neg))
	    {

		if (output.getText ().indexOf (" ") != -1)
		{
		    int position = 0;
		    for (int i = 0 ; i <= output.getText ().length () - 1 ; i++)
		    {
			if (output.getText ().charAt (i) == ' ')
			{
			    position = i;

			}
		    }
		    output.setText (output.getText ().substring (0, position) + " " + Double.toString ((Double.parseDouble (output.getText ().substring (position)) * -1)));
		}

		else if (output.getText ().indexOf (",") != -1)
		{
		    String seq = output.getText ();
		    String seq1 = output.getText ();
		    for (int i = seq.length () - 1 ; i >= 0 ; i--)
		    {
			if (seq.charAt (i) == ',')
			{
			    seq1 = seq1.substring (0, i);
			    seq = seq.substring (i + 1);
			    break;
			}
		    }
		    seq = Double.toString ((Double.parseDouble (seq) * -1));
		    output.setText (seq1 + "," + seq);
		}
		else
		{
		    temp = Double.parseDouble (output.getText ());
		    output.setText (Double.toString (temp * -1));
		    enter = "";
		}

	    }


	    // Simple mathematical operations
	    if (evt.target == (add))
	    {
		temp1 = Double.parseDouble (output.getText ());
		output.setText ("0");
		enter = "";
		operation = 1;
	    }


	    if (evt.target == (mul))
	    {
		temp1 = Double.parseDouble (output.getText ());
		output.setText ("0");
		enter = "";
		operation = 2;
	    }


	    if (evt.target == (div))
	    {
		temp1 = Double.parseDouble (output.getText ());
		output.setText ("0");
		enter = "";
		operation = 3;
	    }


	    if (evt.target == (sub))
	    {
		temp1 = Double.parseDouble (output.getText ());
		output.setText ("0");
		enter = "";
		operation = 4;
	    }


	    if (evt.target == (mod))
	    {
		temp1 = Double.parseDouble (output.getText ());
		output.setText ("0");
		enter = "";
		operation = 7;
	    }


	    // Mean, median,and mode calculations

	    if (evt.target == (mean))
	    {
		if (show == 0)
		{
		    enter = ("Enter a list of numbers, separated by a comma: ");
		    output.setText (enter);
		    show = 1;
		}
		else if (show == 1)
		{
		    String mean1 = output.getText ().substring (47);
		    double answer = calmean (mean1);
		    output.setText ("The mean is " + Double.toString (answer));
		    show = 0;
		}
	    }


	    if (evt.target == median)
	    {
		if (show1 == 0)
		{
		    enter = ("Enter a list of numbers, separated by a comma: ");
		    output.setText (enter);
		    show1 = 1;
		}
		else if (show1 == 1)
		{
		    String median1 = output.getText ().substring (47);
		    double answer = calmed (median1);
		    output.setText ("The median is " + Double.toString (answer));
		    show1 = 0;
		}
	    }


	    if (evt.target == mode)
	    {
		if (show2 == 0)
		{
		    enter = ("Enter a list of numbers, separated by a comma: ");
		    output.setText (enter);
		    show2 = 1;
		}
		else if (show2 == 1)
		{
		    String mode1 = output.getText ().substring (47);
		    double answer = calmode (mode1);
		    output.setText ("The mode is " + Double.toString (answer));
		    show2 = 0;
		}
	    }


	    if (evt.target == (equals))
	    {
		if (operation == 1)
		{
		    answer = temp1 + Double.parseDouble (output.getText ());
		    output.setText (Double.toString (answer));
		}
		else if (operation == 2)
		{
		    answer = temp1 * Double.parseDouble (output.getText ());
		    output.setText (Double.toString (answer));
		}
		else if (operation == 3)
		{
		    answer = temp1 / Double.parseDouble (output.getText ());
		    output.setText (Double.toString (answer));
		}
		else if (operation == 4)
		{
		    answer = temp1 - Double.parseDouble (output.getText ());
		    output.setText (Double.toString (answer));
		}
		else if (operation == 5)
		{

		    answer = temp1 * 3.141592653589793238462643383279502884197169399375105820974944592307816406286208998;
		    output.setText (Double.toString (answer));
		}
		else if (operation == 6)
		{
		    answer = Math.pow (temp1, Double.parseDouble (output.getText ()));
		    output.setText (Double.toString (answer));

		}
		else if (operation == 7)
		{
		    answer = temp1 % (Double.parseDouble (output.getText ()));
		    output.setText (Double.toString (answer));

		}

	    }


	    return true;
	}

	// Error message when crashed
	catch (Exception e)
	{
	    output.setText ("PROGRAM ERROR");
	    return true;
	}
    }


    // Factorial method
    public static double factorial (double n)
    {
	double fact = 1;
	for (int i = 1 ; i <= n ; i++)
	{
	    fact = fact * i;
	}


	return fact;
    }


    // Dec to binary method
    public static String convert (int number)
    {
	int remainder = 0;
	int answer = number;
	String pattern = "";

	while (true)
	{
	    remainder = answer % 2;
	    answer = answer / 2;
	    pattern = remainder + pattern;
	    if (answer == 0)
	    {
		break;
	    }
	}


	return (pattern);
    }


    // Mean method
    public static double calmean (String mean1)
    {
	int count = 1;
	for (int i = 0 ; i < mean1.length () ; i++)
	{
	    if (mean1.charAt (i) == ',')
	    {
		count++;
	    }
	}


	double coor[] = new double [count];
	int position = 0;
	int a = 0;
	while (a < count - 1)
	{
	    for (int i = 0 ; i < mean1.length () ; i++)
	    {
		if (mean1.charAt (i) == ',')
		{
		    position = i;
		    break;
		}
	    }
	    coor [a] = Double.parseDouble (mean1.substring (0, position));
	    mean1 = mean1.substring (position + 1);
	    a++;
	}


	coor [count - 1] = Double.parseDouble (mean1);
	double sum = 0;
	for (int i = 0 ; i < coor.length ; i++)
	{
	    sum = sum + coor [i];
	}


	double answer = sum / count;
	return (answer);
    }


    // Median calculation method
    public static double calmed (String median1)
    {
	int count = 1;
	for (int i = 0 ; i < median1.length () ; i++)
	{
	    if (median1.charAt (i) == ',')
	    {
		count++;
	    }
	}


	double coor[] = new double [count];
	int position = 0;
	int a = 0;
	while (a < count - 1)
	{
	    for (int i = 0 ; i < median1.length () ; i++)
	    {
		if (median1.charAt (i) == ',')
		{
		    position = i;
		    break;
		}
	    }
	    coor [a] = Double.parseDouble (median1.substring (0, position));
	    median1 = median1.substring (position + 1);
	    a++;
	}


	coor [count - 1] = Double.parseDouble (median1);

	double swap = 0;
	for (int b = 0 ; b <= coor.length - 2 ; b++)
	{
	    for (int i = 0 ; i < b ; i++)
	    {
		if (coor [i] > coor [i + 1])
		{
		    swap = coor [i];
		    coor [i] = coor [i + 1];
		    coor [i + 1] = swap;
		}
	    }
	}


	if (count % 2 != 0)
	{
	    return (coor [count / 2]);
	}


	else
	{
	    return ((coor [count / 2 - 1] + coor [count / 2]) / 2);
	}
    }


    // Mode calculation method
    public static double calmode (String mode1)
    {
	int count = 1;
	for (int i = 0 ; i < mode1.length () ; i++)
	{
	    if (mode1.charAt (i) == ',')
	    {
		count++;
	    }
	}


	double coor[] = new double [count];
	int position = 0;
	int a = 0;
	while (a < count - 1)
	{
	    for (int i = 0 ; i < mode1.length () ; i++)
	    {
		if (mode1.charAt (i) == ',')
		{
		    position = i;
		    break;
		}
	    }
	    coor [a] = Double.parseDouble (mode1.substring (0, position));
	    mode1 = mode1.substring (position + 1);
	    a++;
	}


	coor [count - 1] = Double.parseDouble (mode1);
	double maxValue = 0;
	int maxCount = 0;
	for (int i = 0 ; i < coor.length ; i++)
	{
	    int count1 = 0;
	    for (int b = 0 ; b < coor.length ; b++)
	    {
		if (coor [b] == coor [i])
		{
		    count1++;
		}
	    }
	    if (count1 > maxCount)
	    {
		maxCount = count1;
		maxValue = coor [i];
	    }
	}


	return maxValue;
    }


    // Taylor series method
    public static double taylorsin (double x)
    {
	double sum = 0;
	x = x % (2 * Math.PI);

	for (int i = 0 ; i <= 100 ; i++)
	{
	    sum = (Math.pow (-1, i) * Math.pow (x, 2 * i + 1) / (factorial (2 * i + 1)) + sum);
	} //the taylor series for sine


	// the alternating power series from zero to infinity, of the odd powers of x, divided by the corresponding odd factorials
	return sum;
    }


    public static double taylorcos (double x)
    {
	x = x % (2 * Math.PI);
	double sum = 1;

	for (int i = 0 ; i <= 100 ; i++)
	{
	    sum = (Math.pow (-1, i + 1) * Math.pow (x, 2 * i + 2) / (factorial (2 * i + 2)) + sum);
	}


	return sum;
	// the alternating power series from zero to infinity, of the even powers of x, divided by the corresponding even factorials
    }
}
