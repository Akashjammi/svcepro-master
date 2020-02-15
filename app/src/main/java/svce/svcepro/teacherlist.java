package svce.svcepro;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class teacherlist extends AppCompatActivity {

    ListView listView;

    Integer r, x, y, z, t, d;



    //below is d teachers list for first yr second yr ,third yr and fourth year even semesters

    //method used - (fl)+(dept)+(section if available)+(semester)
    String[] flautotwo = {"Automotive chasis - Mr. R. Sakthivel", "Mechanics of machines - I - Mr.K.E.Kumaraguru", "Electrons and microcontroller - Dr.S.Ganesh ", "EVS- Dr. A.Bhaskaran", "Computational methods - Ms.K.Vijayalakshmi", "Fluid mechanics and machinery - Mr. A.Balasubramanian", "Automotive components lab- Dr.V.Ganesh/Dr.S.Premnath/Dr Paul /Mr Dhanabal/Mr A.K.Boolasenthiraj", "Electrons and microcontroller lab -Mr.P.Arul/Mr.G.Loganathan/Ms.S.Radhika/Mr.B.Netaji", "Fluid mechanics and machinery lab - Dr.J.Venkatesan/Mr.Ramanjaneyulu/Ms.Radika/Dr.S.Premnath/Mr.A.Balasubramaniyum/Mr.E.Ravindr rao"};

        String[] flautofour = {"Automotive Chassis - Mr.R.Sakthivel", "Mechanics of Machines - Mr.K.E.Kumaraguru", "Electronics and Microcontroller - Dr.S.Ganesh Vaidyanathan", "Environmental Science and Engineering - A.Bhaskaran", "Computational Methods - K.Vijayalakshmi", "Fluid Mechanics and Machinery - Mr.A.Balasubramanian", "Automotive Components Laboratory - Dr.V.Ganesh/Mr.K.Paul Durai,S.Premnath,J.Dhanabal,A.Boobalasenthilraj", "Electronics and Microcontroller Laboratory - P.Arul,G.Loganathan,S.Radhika,B.Nethaji", "Fluid Mechanics and Machinery Laboratory - j.Venkatesan/Ramanjaneyulu Kolla, Dr Premnath,A balasubramaniam/Mr.E.Ravindar Rao"};

            String[] flautosix =  {"Automotive Air - Conditioning - J.Venkatesan", "Alternative Fuels and Energy Systems - G.Ravi","advanced theory of IC Engines-K.Boobalasenthilraj","Automotive Engine Components Design - Mr.E.Ravindar Rao/E.Kumaraguru", "Automotive Chassis Components Design - R.Sakthivel/G.Ravi", "Automated pollution and control - K.Paul Durai", "Finite element analysis - Mr.Ramanujavel Kolla/Dr.V.Ganesh", "Principles of Management - Dr.S.Premnath", "Computer Aided Engine and Chassis Design Lab - Mr.E Ravindar Rao/Mr.K.E.Kumaraguru/Mr.Ramanjaneyulu Kolla,J.Dhanabal,G.RaviR.Sakthivel","Interview and Career skills Lab-C.Amutha Charu Sheela", "Placement 1 - T.Rajasekaran", "Placement 2 - P.Nirmala"};

                String[] flautoeight =  {"Transport Management - K.Paul Durai", "Vehicle Body Engineering - E.Ravinder Rao", "Project Work - Dr.V Ganesh", "Operations Research - Mr.J.Dhanabal","Quality management - K.Boobalasenthilraj"};




    String[] flbiotechtwo = {"Probability and statistics - Dr.B.Thilaka", "Analytical methods and instrumentation -Ms.S.Panji Prabha", "Applied theromodynamics for biotechnologists - Dr.P.K.Praveen Kumar/Dr.D.Nilavesan", "Heat and momentum transfer operations - Dr.V.Sunnitha/Dr.A.Senthil Naggarpan", "Enzyme technology and biotransformation - Mr.D.Suresh Kumar/Mr.S.Naga Vignesh", "Bioprocess principles- Mr.S.Naga Vignesh /Mr.P.K.Praveen kumar", "Chemical Enginnering lab - Mr.P.K.Praveen Kumar / Mr.J.Hariharan & Mr.S.Nagavignesh ", "Instruments mehods of analysis Laboratory - Mr.D.Nilavunesan/Dr.S.Prabhu", "Library - Ms.V.Sumitha/Dr.A.Senthil Nagappan", "Seminar I - Ms.Summitha"};

        String[] flbiotechfour = {"Probability and Statistics - Dr.B.Thilaka", "Analytical Methods and Instrumentation - Ms.S.Pandi Prabha", "Applied Thermodynamics for Biotechnologists - Mr.P.K.Praveen Kumar/Mr.D.Nilavunesan", "Heat and Momentum Transfer Operations - Ms.V.Sumitha/Dr.A.Senthil Nagappan", "Enzyme Technology and Biotransformation - Mr.D.Suresh Kumar/Mr.S.Naga Vignesh", "Bioprocess Principles - Mr.S.Naga Vignesh/Mr.P.K.Praveen Kumar", "Chemical Engineering Lab - Mr.P.K.Praveen Kumar/S.Naga Vignesh,J.Hariharan", "Instrumental Methods of Analysis Lab - Dr.S.Prabhu/D.Nilavunesan", "Library - V.Sumitha,A.Senthil Nagappan", "Seminar - V.Sumitha"};

            String[] flbiotechsix = {"Total Quality Management For Biotechnologists - Naga Vignesh", "Immunology - Prof.R.B.Narayanan", "Genetic Engineering And Genomics - S.Prabhu", "Chemical Reaction Engineering - Mr.D.Nilavunesan/Mr.S.Naga Vignesh", "Cancer Biology-N.Sathish", "Animal Biotechnology - K.Pravcen Kumar", "Metabolic Engineering - Dr.A.Senthil Nagappan", "IPR and Ethical Issues in Biotechnology - D.Sureshkumar", "Genetic Engineering Lab - Mr.N.Sathish/S.Pandi Prabu", "Bioprocess Lab II - Ms.V.Sumitha/P.K.Praveen Kumar", "Communication and Soft Skills - Lab Based - Dr.C.Amutha Charu Sheela/Dr Samuel Sudharsan Dawson", "Library - S.Naga Vignesh", "Seminar - Mr.K.Praveen Kumar"};

                String[] flbiotecheight = {"Project Work - Prof.E.Nakkeeran", "Library - N.Sathish"};




    String[] flchematwo = {"Communicative English - Mr.R.Prenraj", "Engineering Mathematics - II - Dr.T.Kulandaivel", "Engineering Drawing - Dr.S.Ponnuvel/Mr.G.Saravanaram", "Basic civil and mechanical engineering - Mr.S.Diravia/Mr.E.suresh", "EVS - Mr.G.Thayanidhi", "Organic chemistry - Dr.G.Baskar", "Programming for problem solving - Ms.P.Leena Rani / Ms.P.Sharon femi/Mr.E.Sivakumar/Ms.K.Kiruthika devi", "Basics electrical and  electronics lab- Mr.A.Tamizhselvan /Mr.I venkatraman/Mr.C.Kamal/Ms.M.Rajalakshmi", "Library - Dr.R.Palani"};

        String[] flchemafour = {"Probability and Statistics - radhakarishan", "Chemical Process Calculations - Ms.S.Swathi", "Chemical Engineering Thermodynamics I - Sudha", "Mechanical Operations - Bharath", "Heat Transfer - Meyyapan", "Instrumental Methods of Analysis - Anandha babu", "Technical Analysis Lab - Ananda babu/baskar", "Fluid Mechanics Lab - Ms.S.Swathi/Vijaylakshmi","Library -Sudha"};

            String[] flchemasix = {"Modern separation proccess-Swathi", "Food technology - Vishal", "proccess optimization - Arun", "Energy engineering-Sivakumar", "material scicnece and engineering - Mr.S.Yogesh", "Chemical proccess industry-raja sekar","mass tranfer- nalinkanth","Chemical reaction engineering - Saraswathi", "Mass transfer lab - Ms Saraswathi/Sudha","Mass Transfer Lab - Dr.D.Swaminathan/Dr.M.Yogesh Kumar", "Library -Vishal"};

                String[] flchemaeight = {"Petroleum Technology - S.Bharath", "Process Plant Utilities - P.G.Priya Dharshini", "Professional Ethics in Engineering - G.Saraswathi", "Project Work - G.Sudha/S.Jai Ganesh"};




    String[] flchembtwo = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - II - Dr.S.Prabhu", "Engineering Drawing - Mr.R.Ganesan/Mr.M.Kalaimani", "Basic civil and mechanical engineering - Ms.C.sandhiya/Mr.E.Suresh", "EVS - Dr.D.Swaminathan", "Organic chemistry - Dr.M.Thirumalaikumar", " Programming for problem solving- Ms.B.T.Shobhana/Ms.K.Kiruthika devi/Ms.S.Jerusha/Ms.R.Shakteeshwari", "Basics electrical and  electronics lab Laboratory - Mr.G.Vinothkumar/Mr.V.Mohanraj/Mr.M.Shankar/Ms.M.Maadhuri", "Library - Ms.A.C.Vijayalakhmi"};

        String[] flchembfour ={"Probability and Statistics -Vijayalaksmi", "Chemical Process Calculations - Thayanidhi", "Chemical Engineering Thermodynamics I - yogesh", "Mechanical Operations - Jai ganesh", "Heat Transfer - Sundhari", "Instrumental Methods of Analysis - T.Kumar", "Technical Analysis Lab - Devasagayam", "Fluid Mechanics Lab - Vishal/palani","Library -Arun"};

            String[] flchembsix ={"Modern separation proccess-Swathi", "Food technology - Sivakumar", "proccess optimization - Arun", "Energy engineering-Vishal", "material scicnece and engineering - Sundhari", "Chemical proccess industry-Dharshini","mass tranfer- nalinkanth","Chemical reaction engineering - Saraswathi", "Mass transfer lab - Ms Saraswathi/Sudha","Mass Transfer Lab - Sivakumar./Sundhari", "Library -Sivakumar"};

                String[] flchembeight = {"Petroleum Technology - A.C.Vijayalakshmi", "Process Plant Utilities - C.Anand Babu", "Professional Ethics in Engineering - G.Saraswathi", "Project Work -G.Sudha/S.Jai Ganesh"};




    String[] flciviltwo = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - II - Dr.R.Suresh", "Programming for problem solving - Ms.V.M.Sivagami", "EVS - Dr.G.Baskar", "Engineering mechanics of civil engineering - Ms.K.Sathyapriya", "Building Planning - Dr.V.Tamizhselvi", "Programming for problem solving Laboratory - Ms.V.M.Megala/Ms.V.M.Sivagami/Ms.N.Devi/Ms.Kiruba", "CAD Laboratory - Ms.Ruby/Ms.C.Sandhiya", "Library - Mr.G.Kumar", "Seminar I - Mr.R.Kalaivannan", "Seminar II - Ms.C.Sandhya"};

        String[] flcivilfour = {"Strength of Materials II - Dr.P.Venkateswara Rao/Mr.G.Kumar", "Applied Hydraulic Engineering - Mr.S.Diravia Balan/Mr.R.Kalaivannan", "Surveying II - Dr.M.Selvakumar", "Soil Mechanics - Ms.C.Sandhiya", "Environmental Science and Engineering - Mr.R.Kalaivannan", "Computational Methods - Ms.K.Vijayalakshmi", "Hydraulic Engineering Lab - Mr.S.Diravia Balan/Mr.R.Kalaivannan", "Survey Practical - Mr.K.Arun/Mr.G.Kumar", "Library - Mr.K.Arun/Mr.G.Kumar"};

            String[] flcivilsix = {"Concrete Technology - Dr.V.Tamizhselvi", "Construction Planning and Scheduling - Mr.K.Arun", "Design of Reinforced Concrete & Brick Masonry Structures - Mr.R.Kalaivannan", "Structural Analysis II - Dr.P.Venkateswara Rao/Ms.Ruby Freya", "Design of Steel Structures - Ms.Ruby Freya/Ms.K.Sathyapriya", "Railways, Airports and Harbour Engineering - Dr.M.Selvakumar", "Environmental Engineering II - Dr.E.Ravindranath", "Environmental Engineering Lab - Mr.R.Mathiyazhagan/Mr.G.Arun", "Concrete and Highway Engineering Lab - Dr.V. Tamizhselvi/Ms.K.Sathyapriya","Ms.C.Sandhiya"};

                String[] flcivileight = {"Prefabricated Structures - Mr.G.Kumar", "Repair and Rehabilitation of Structures - Mr.R.Mathiyazhagan", "Principles of Management - Mr.G.Arun"};




    String[] flcseatwo = {"Communicative English - Ms.Anichamalar", "Engineering Mathematics - II - Dr.D.Meiyappan", "Engineering Drawing - Dr.M.Nishal/Mr.R.Ganesan", "Dr.N.Nachiappan", "DPSD - Ms.E.Rajalkashmi", "OOP- Ms.T.Padmavathy", "OOP Laboratory - Ms.T.Padmavathy / Ms.U.Abirami", "DPSD Laboratory - Mr.E.Rajalakshmi / Ms.R.Bhuvaneshwari", "Library - Mr.K.Kumanan", "Seminar - Mr.M.P.Lakshmanakumar"};

        String[] flcseafour={"Probability and Queuing Theory-radhakrishnan","Computer Networks-Ms.K.Bhuvana","Database Management Systems-Poorani","Deisgn and Analysis of Algorithms-rajeshwari","Computer Architecture-Ms.S.Rajalakshmi","Software Engineering-Jayakumar","Networks Lab-Ms.J.Bhuvana and Ms.V.Rajalakshmi","Database Management Systems Lab-Ms.Iswarya & Ms.S.Poorani","Software Engineering Lab-Mr.T.Rajasekaran & Ummamaheswari & laksmikumar","Library-Revathi"};

            String[] flcseasix = {"ML-Sasikala", "Mobile Computing-Umma maheshwari", "Compiler Design-Selvamani", "Digital signal processing-Loganathan",  "Artificial Intelligence-Dr.R.Jayabhaduri", "Information retrieval techniques-Nendhunchilan", "Mobile Application Dev Lab-Mr.K.Srinivasan & Revathi", "Compiler Lab-Mr.Saroj & Ms.S.Selvakumar,Kumaran", "Library - Bala murugan"};

                String[] flcseaeight = {"Multi-Core Architecture and programming-Sasikala", "Professional Ethics and Engineering-janatharajan", "Knowledge Management-Ganan Sekar", "Project work-Dr.R.Jayabhaduri,balamurgan,Rajalakshmi"};




    String[] flcsebtwo = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - II - Ms.Visalakshmi", "Engineering Drawing - Mr.G.Kirubakaran/Mr.M.Kalaimani", "EVS - Ms.B.Preetha", "DPSD - Mr.A.Sowmyanarayan", "OOP - Ms.G.Janakasudha", "OOP Laboratory - Ms.G.Janakasudha/ Ms.U.Abirami", "DPSD Laboratory - Mr.A.Sowmyanarayan/Mr.M.Adimoolam" , "Library - Mr.J.M.Gnanasekar", "Seminar - Mr.S.U.Muthunagai"};

        String[] flcsebfour ={"Probability and Queuing Theory-Suba","Computer Networks-Suresh kumar","Database Management Systems-Muthugani","Deisgn and Analysis of Algorithms-rajalakshmi","Computer Architecture-Abirami","Software Engineering-Kumaran","Networks Lab-Ms.J.Bhuvana and Suresh","Database Management Systems Lab-Muthugani & Ms.S.Poorani","Software Engineering Lab-Kumaran & laksmikumar","Library-Manikandan"};

            String[] flcsebsix ={"ML-Senthamizhselvi", "Mobile Computing-Praveen kumar", "Compiler Design-Sanoj", "Digital signal processing-Nagaraj",  "Artificial Intelligence-", "Information retrieval techniques-Nendhunchilan", "Mobile Application Dev Lab-Praveenkumar & Revathi & Senthilkumar", "Compiler Lab-Mr.Saroj & Ms.S.Selvakumar,Kumaran", "Library - janarthanam"};

                String[] flcsebeight ={"Multi-Core Architecture and programming-Revathi", "Professional Ethics and Engineering-janatharajan", "Knowledge Management-Senthil kumar", "Project work-Dr.R.Jayabhaduri,balamurgan,Rajalakshmi"};





    String[] flcsectwo = {"Communicative English - Dr.Sam Dawson","Engineering Mathematics - II - Dr.R.Suresh", "Engineering Drawing - Mr.M.Kalamani/Mr.G.kirubakaran", "DPSD - Ms.R.Bhuvaneswari", "OOP- Ms.P.Vinothiyalakshmi", "OOP Laboratory - Ms.P.Vinothiyalakshmi / Ms.G.Janakasudha", "DPSD Laboratory - Ms.R.Bhuvaneshwari/Mr.A.Sowmyanarayan", "Library -Mr.A.Sowmyanarayan ", "Seminar - Dr.P.Janarthanan"};

        String[] flcsecfour = {"Probability and Queuing Theory-Vijayalakhmi","Computer Networks-Adimaloon","Database Management Systems-Anitha","Deisgn and Analysis of Algorithms-Padmavathi","Computer Architecture-Umma maheshwari","Software Engineering-Rajasekaran","Networks Lab-Senthamizh selvi ,Rajalakshmi and Suresh","Database Management Systems Lab-Muthugani & Ms.ishawari","Software Engineering Lab-Kumaran & Rajasekarn","Library-ishwariya"};

            String[] flcsecsix ={"ML-Senthamizhselvi", "Mobile Computing-manikandan", "Compiler Design-Kumaran", "Digital signal processing-Kumaran",  "Artificial Intelligence-gaythri", "Information retrieval techniques-Nendhunchilan", "Mobile Application Dev Lab-Praveenkumar & Revathi & Senthilkumar", "Compiler Lab-Mr.Adimoolam & Ms.S.Selvakumar,Kumaran", "Library - balamurugan"};

                String[] flcseceight ={"Multi-Core Architecture and programming-Ishawariya", "Professional Ethics and Engineering-balamurgan", "Knowledge Management-manikandan", "Project work-Dr.R.Jayabhaduri,balamurgan,Rajalakshmi"};





    String[] fleceatwo = {"Communicative English - Mr.P.Ganapathy", "Engineering Mathematics - II - Dr.B.Saravanan", "Programming for problem solving  - Ms.S.Jerusha", "Physics of Materials - Dr.S.Sampath krishnan", "EVS - Dr.S.Ananda babu", "Electron devices - Mr.P.Muthukumaran / Ms.S.Sangeetha priya", "Electron devices and engineering Laboratory - Mr.P.Muthukumaran,Ms.SM.Mezhabeen,Mr.B.Nethaji,Mr.M.Ranjithkumar,Mr.G.Vinothkumar ","Programming for problem solving Laboratory - Mr.E.Sivakumar,Ms.S.Jerusha,Ms.G.Sangeetha,Ms.Sharon ranjitha", "Library - Ms.K.S.Subhashini", "Seminar I - Ms.M.Anushya,Mr.G.Loganathan"};

        String[] fleceafour = {"Probability and Random Processes-Umadevi", "Signals and Systems-Kalyani,varadharajan", "Analog Communication Systems-Sivangana", "Electronoic Circuits-II-Athapan", "Line Integrated Circuits-Ms.Barathkumar/Mezhabeen", "Control System Engineering-Satish,srividhya", "Circuits and Simultation Integrated Lab-Sivangana/Athapan/Satish/Ms.A.Bharathipriya", "Electrical Engineering and Control System Lab-Kanadasn/Ranjithkumar/Shanmugavadivu/Pursothaman","Library-Loganathan"};

            String[] fleceasix = {"Principles Of Management-Anju", "Computer Architecture-Dr.S.Muthukumar", "Computer Networks-Jeyaprabha", "VLSI Design-Ms.M.Athappan", "Antenna and Wave Propagation-Jothi lakshmi", "Digital image proccesing -Srividhya", "Computer Networks Lab-Jeyaprabha,Srividhya,Anushya,Satish", "VLSI Design Lab-Ms.M.Anju/nagaraj/Vidhya/Priya", "Communication and Soft Skills Lab-Murgavel,Ms.Ganapathy", "Mini project-Malathy,Menaka,hemalatha,Bala"};

                String[] fleceaeight = {"Wireless Communication-gayathri", "Wireless Networks-Subhalakshmi", "Professional Ethics in Engineering-Umma", "Cryptography and Network Security/Toal Quality Management/Entrepreneurship Development(E-VI)-Sivanagna", "Project Work-Ms.K.S.Subhashini",  "Library-Ms.Kumaran","Project-1.Sangeetha priya,2.Satish,3Arul.,4.Radika"};




    String[] flecebtwo = {"Technical English-S.B.Lavanya", "Mathematics-Visalakshmi", "Programming for problem solving-Guru Gokul", "Physics of materials-Mohan raj", "EVS-Preetha", "Electron devices-Hemalatha/Srividya", "Electron device lab-Hemalatha/Muthukumaran/Nagaraj/Sudharsanam/Thamizhmani/Rajvikram/Madhuri", "Programming Laboratory-Guru Gokul/Sugacini/Siva Kumar/Rohini", "Lib-Sivangana Subramaniyam", "Seminar-Kumaran/Satish"};

        String[] flecebfour = {"Probability and Random Process-N.S.Priya", "Signals and Systems-Kouslya /Kalyani", "Analog Communication Systems-Massod", "Electronic Circuits-II-Gomatheeshwari", "Linear Integrated Circuits-Balasubramani/Sarala", "Control System Engineering-Ms.Rajeswari Ramaraj/Sivangana", "Circuits and Simulation Integrated lab-Ms.C.Gomatheeswari Preethika/Varadharajan/Masood/Koushalya/Ramraj", "Electrical Engineering and Control System lab-Rajalakshmi/Venkataramanan/Sinthamani","Library-Athapan"};

            String[] flecebsix = {"Principles Of Management-Radhika", "Computer Architecture-Mezhabeen", "Computer Networks-Koushalya", "VLSI Design-Malathy", "Antenna and Wave Propagation-Ms.Umma", "Digital Image proccessing-Anju", "Computer Networks Lab-Mr.S.Senthil Rajan/Ansuhya/Sarala/Radhika", "VLSI Design Lab-Ms.Mezhabeen,Mr.Kumaran,Ms.Bharathipriya/Sarala", "Communication and Soft Skills Lab-Shaktivel,Mrs.Lavanya", "Miniproject-Padmavathi,Kumarantharan,Muthukumran,Kumaran"};

                String[] flecebeight = {"Wireless Communication-jeyaprabha", "Wireless Networks-Dr.G.A.Sathish Kumar", "Professional Ethics in Engineering(E-V)-Anushya", "Toal Quality Management(E-VI)-Senthilrajan", "Project Work-Sivangana","Library-Sangeetha priya","Project work-Anushya/Vidhya/Subhashini/Nagaraj"};





    String[] flecectwo = {"Technical English-Prem Raj", "Mathematics-Prabhu", "Programming for problem solving-Nivetha Shree K", "Physics of materials-Dr.Sheela", "EVS-Balusamy", "Electron devices-Netaji/Preethika", "Electron device lab-Nethaji/Hemalatha/Ramraj/Mohan raj/Vinoth kumar/Annamalai", "Programming Laboratory-Sangeetha/Nivetha shree/Sivakumar/Meghala", "Lib-Sarala", "Seminar-Jeyaprabha/hemalatha"};

        String[] flececfour = {"Probability and Random Process-Uma Devi","Signals and Systems-Vardharajan,Kousalya","Analog Communication Systems-Menaka" ,"Electronic Circuits II-Balasubramani", "Linear Integrated Circuits-Sarala/Bharathipriya", "Control System Engineering-Kalyani/Rajeshwari", "Circuits and Simulation Integrated lab-Varadharajan/Balasubramani/Kalyani/Radhika/Sarala","Electrical Engineering and Control System lab-Ms.S.Sinthamani,(I/C),Mr.S.Thamizhmani,Mr.S.Sudharsanam","Library-Ms.Preethika"};

            String[] flececsix = {"Principles Of Management-Ms.D.Menaka", "Computer Architecture-Padmavathi", "Computer Networks-Subhashini", "VLSI Design-Sangeethapriya", "Antenna and Wave Propagation-Senthil rajan", "Digital image proccessing -gayathri", "Computer Networks Lab-Subhashini,Ms.C.Gomatheeswari Preethika,Mr.Massood", "VLSI Design Lab-Ms.Gayathri/Ms.Vidhya/Ms.Sangeethapriya", "Communication and Soft Skills Lab-Mr.Sam Dawson,Lavanya", "Mini project-Padmavati/Vidhya/Kumaran"};

                String[] flececeight = {"Wireless Communication-Ms.M.vidhya", "Wireless Networks-Mr.Kumaratharan", "Professional Ethics in Engineering(E-V)-Sri vidhya", "Toal Quality Management-Arul", "Project Work-radhika", "Project-Kumaran/Muthukumaran/Anju/Bharathipriya", "Library-Senthil"};






    String[] fleeeatwo = {"Technical English-Amurtha charu sheela", "Mathematics-Kulandaivelu", "Engineering drawing-Balakumar/ senthilvelan", "Physics of materials-Barathy", "EVS-Preetha", "Electric circuit analusys-Venkataraman", "Physics and chem lab-Bharathy/Bhaskaran/raju/Sheela/kalpana/Mohan raj/Preetha/Balusamy", "EC Laboratory-Venkatarmanan/Anitha/Sinthamani/Pavithra", "Lib-Sankar", "Seminar-Sinathamani"};

        String[] fleeeafour = {"Computational Methods-N.S.Priya", "Electric Power Systems-Mr.Kumaravel", "Electrical Machines-II-Sethuraman", "Digital Logic Circuits-Anitha", "Analog Circuits-Santha", "Control Systems-Rajvikram", "Electrical machines-II laboratory - Mr V Mohanraj,Mr.Senthuraman,Mr.Karthikeyen/Shanmugavadivu", "Digital and Analog Circuits Lab-Ms Anitha/Sasikala", "Control Systems and Instrumentation Lab-Rajvikram/Rajalakshmi/Suganthi/ranjith kumar/Senthuraman"};

            String[] fleeeasix = {"Powersystem operation and controll -Kanadasan", "Solid state Drives-Suagnthi", "Computer networks - senthil kumar", "DTSP -Vinoth kumar", "Embedded system - Mohan raj", "Solid state device - Sudhakar", "Optimization techniques -Tamizhmani", "Power system simulation lab -Kanadasan/sarkar/Tamizhmani/Venkatesan", "Presentation skills and technical seminar-Prem raj/Dawson", "Mini project-Mohanthy,kumaravel"};

                String[] fleeeaeight = {"Wireless communication -Gayathri", "Wireless networks -Subhasini ", "professional Ethics oin Engineering(E-V) - Umma", "Project work -Subhasini", "Central library - Mr.Kumaran", "Project-Sangeetha/Sathish/Arul/Radhika"};






    String[] fleeebtwo = {"Technical English-Lavanya", "Mathematics-Prabhu", "Engineering drawing-Ganeshan/ Nishal", "Physics of materials-Sheela", "EVS-Balusamy", "Electric circuit analusys-Maadhuri", "Physics and chem lab-Bharathy/Bhaskaran/raju/Sheela/kalpana/Mohan raj/Preetha/Balusamy", "EC Laboratory-Maadhuri/Karthikeyen/Amudhavalli/Pavithra", "Lib-Venkataramanan", "Seminar-Anitha"};

        String[] fleeebfour = {"Computatioanl methods- Muthucumarasamy", "Electric Power System-Sinthami", "Electrical Machines-II-Anamalai", "Digital Logic Circuits=-Arul mozhi", "Analog Circuits-Sasikala", "Control Systems-barathidasan", "Electrical MSchines Laboratory-II - Annamalai,venkatesan,arul,tamilmani", "Digitl and analog Circuits Lab-Pavithra,Arulmozhi", "Control Systems And Insr=trumentayion Lab-Sasikala,madhuri,tamizhselvam"};

            String[] fleeebsix ={"Powersystem operation and controll -Sankar", "Solid state Drives-Mudhavali", "Computer networks - Srinivasan", "DTSP -Mohanthy", "Embedded system - Pavithra", "Solid state device - Sudhakar", "Optimization techniques -Sudharasam", "Power system simulation lab -Kanadasan/sankar/Tamizhmani/Venkatesan", "Presentation skills and technical seminar-Lavanya/Dawson", "Mini project-Mohanthy,Gopinath"};

                String[] fleeebeight=  {"Electrical energy generation,utilization,conservation - Tamizhselvan", "Power Electronics for renewable energy -Shanmugavadivu", "professional Ethics oin Engineering(E-V) - Karthikeyen", "Project work -Bharathidasan", "Central library - Mohan raj", "Project-Barathidsan"};





    String[] flitatwo = {"Technical English-I-Anichamalar", "Mathematics-Visalakshmi", "Engineering Drawing-I-NIr. G. Saravanaram / Mr. S. Muniraj", "EVS-Dr. N. Nachiappan", "Digital Principles and System Design-Suresh", "OOPS using g++ and Python-MsSugacini", "Digital Principles and System Design Laboratorv-K. Suresh, Mr. V. Rajaram", "OOPS using C++ and Python Laboratory-l s. K. Kiruthika Devi Is. B. T. Shobana/ Ms. P. Nirmala", "lIB - Nirmala"};

        String[] flitafour = {"Probability and queuing theory - A.Suba", "Microprocessor and microcontroller - V.Rajaram", "Paradigms of Algorithm Design-Dr.V.Vidhya", "Databse Management System-K.Nivetha Shree", "Software engineering Methodologies - V.Ranjith", "IT Essentials-R.Saktheeswari","Microprocessor and microcontroller laboratory - V.Rajaram,V.Saroja", "Database Management Systems Lab -Ms.K.Nivetha Shree,D.Jayanthi,A.Kala", "Mini Project-Dr V.Vidhya,N.Devi,D.Jayanthi,A.Kala,R.Saktheeswari", "Library -  S.Uvaraj Arutkumaran"};

            String[] flitasix = {"Information and coding theory - N.Devi", "Mobile Computing - E.Sakthivel", "Software Testinng and Quality Assurance- S.Uvaraj Arutkumaran", "Automated Compiler Design - Ms.A.Rohini,Ms.S.Kalavathi", "Service oriented architecture- P Sharon Femi ", "User Interface - N.Uma","Data Science using python-T Shobana", "Mobile appication development laboratory - Ms.N.Devi,E.Sakthivel", "Compiler Laboratory -Ms.S.Kalavathi,Ms.A.Rohini/Ms.P.Sharon Femi", "Interview and Career Skills laboratory - Anachamalar/Ms.S.B.Lavanya"};

                String[] flitaeight = {"Service oriented Architecture - Ms.A.Kala ", "Professoional ethics - Ms.Kiruba wesley", "Cyber Forensics -Mr.T.Sukumar", "Software project management - V.Megala", "Project Work - Ms.Kiruba Wesley", "Library -A.Kala "};





    String[] flitbtwo = {"Technical English-I-Lavanya", "Mathematics-Meiyappan", "Engineering Drawing-Y. Senthilvelan / Mr. M. Kalaimani", "EVS-Balusamy", "Digital Principles and System Design-Mr. V. Ranjith", "OOPS using g++ and Python-Ms. K. Kiruthika Devi", "Digital Principles and System Design Laboratorv-Mr. V. Ranjith, Mr. K. Suresh", "OOPS using C++ and Python Laboratory-Ms. M. Sugacini, Ms. G. Sangeetha", "lIB -Indumati"};

        String[] flitbfour = {"Probability and queuing theory - B.Thilaka", "Microprocessor and microcontroller -Dr.C.Yaashuwanth", "Paradigms of Algorithm-E.Sivakumar", "Database Management systems - Ms A.Indumathi", "Software engineering Methodologies-Mr S Uvaraj Arutkumaran", "Microprocessor and microcontroller laboratory - Dr.C.Yaahuwnth,T.Sukumar", "Database Management Systems Lab-Ms.A.Indumathi,T.Shobana", "Mini Project-G.Sumathi,Ms.D.Jayatnthi,A.Kala,R.Sharon Femi,Ms.R.Satheeswari", "Library -  Ms.N.Uma"};

            String[] flitbsix = {"Information and coding theory - P.leela rani", "Mobile Computing -V.Saroja", "Software Testinng and Quality Assurance- A.Indumathi", "Automated Compiler Design - Ms.A.Rohini,Ms.S.Kalavathi", "Service oriented architecture-G.Sangeetha", "User Interface - N.Uma","Data Science using python-T Shobana", "Mobile appication development laboratory - V.Saroja,P.leela rani", "Compiler Laboratory -Ms.S.Kalavathi,N.Uma", "Interview and Career Skills laboratory - T.Murugavel/Anichamalar"};

                String[] flitbeight = {"Service oriented Archetecture - Ms.D.Jayanthi", "Professoional ethics-Ms.S.jerusa", "Cyber Forensics-J.Sharon Ranjitha Esther ", "Software project management - G.Sumathi", "Project Work -A.Kala", "Library -D.Jayanthi"};




    String[] flmechatwo = {"Technical English-I-Ganapathi", "Mathematics-I-A.Suba", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-R.Raja", "Computer Programming-N.Uma", "Engineering Graphics-M.Prem Ananth/V.Senthilvelan", "Computer Practise Laboratory-N.Uma,V.Saroja,AR.Guru Gokul,R.Sakhteeshwari", "Engineering Practise Laboratory-R.Sakthivel/D Amudhavalli (I/C)", "Physics/Chemistry Lab-K.Raja/R.Raja", "Sports-G.Kirubakaran/M.Arulkumar/R.Ganesan"};

        String[] flmechafour = {"Computational Methods-Ms.N.S.Priya", "Kinematics Of Machinery-Mr.N.Muthukrishnan", "Manufacturing Technology II-Ananthkumar", "Thermal Engineering-Kaliyanasundar","Fluid Mechanics and Machinery-R.Natarajan/M.Gajendran", "Environmental Science and Engineering-S.Kalpana", "Thermal Engineering Lab-I-Natarajan/Raghu/Balakumar/S.Saravanan", "Manufacturing Technology laboratory II-M.Ananthkumar/S.Muniraj/Mr.RamPrasad/V.Sridaran,J.Sivaramapanian", "Fluid Mechanics and Machinery Lab-Kalyanasundar,Arumugam,G.Saravanan"};

            String[] flmechasix = {"Design Of Transmissionsystems-Mr.J.Sivaramapandian", "Automobile Engineering-T.Raja", "Finite Element Analysis-Mr.C.Senthamaraikannan", "Gas Dynamics and Jet Propulsion-Mr.S.Arumugan","Quaity control and reliability engineering-K.Ramprasad", "Renewable Sources of Energy-Mr.V.Sridharan", "Unconventional Machining Process-Mr.R.Ramesh", "C.A.D./C.A.M.Laboratory-Mr.M.Mohandas/Dr.C.Senthamaraikannan,Mr.G.Saravanaram/Mr.M.Nishal,T.Raja", "Design and Fabriction project-S.Ilaiyavel,C.Senthamaraj Kannan", "Interview and career skills lab-Amutha Charu Sheela,P.Ganapathy"};

                String[] flmechaeight = {"Engineering Economics-Dr.S.RameshBabu", "Entrepreneurship Development-Mr.V.Senthilvelan", "Advanced I.C.Engines-Dr.S.Saravanan", "Additive Manufacturing-Dr.K.S.Badrinathan", "Non Destructive Testing and Materials-V.Sridaran","Project Work-R.Ramesh/Dr.S.Ponnuvel/Mr.S.Arumugam/Mr.M.Kalaimani"};



    String[] flmechbtwo = {"Technical English-I", "Mathematics-I", "Engineering Physics-I", "Engineering Chemistry", "Computer Programming", "Engineering Graphics", "Computer Practise Laboratory", "Engineering Practise Laboratory", "Physics/Chemistry Lab", "Sports"};

        String[] flmechbfour = {"Computational Methods-DR R Suresh", "Kinematics Of Machinery-Mr.K.Ramprasad", "Manufacturing Technology II-Dr.S,Iliyavel", "Thermal Engineering-Mr.G.Suresh","Fluid Mechanics and Machinery-Dr.V.Sridharan/Mr.G.Logachander", "Environmental Science and Engineering-Mr.M.Balakumar", "Thermal Engineering Lab-I-Mr.A.Kumaraswamy(Tue&Fri)/Mr.M.Maheshwaran(Thr)/Mr.G.Logachander", "Manufacturing Technology laboratory II-Mr.S.Muniraj/Dr.S.Ponnuvel/Mr.RamPrasad/Mr.M.Balakumar,Dr.N.Muthukrishnan", "Fluid Mechanics and Machinery Lab-Dr.S.gajendran/Mr.S.yeswanthraj"};

            String[] flmechbsix = {"Design Of Transmissionsystems-Mr.S.Muniraj", "Automobile Engineering-Mr.A.Kumaraswamy", "Finite Element Analysis-Mr.E.Suresh", "Gas Dynamics and Jet Propulsion-Mr.P.Raghu","Quaity control and reliability engineering-K.Ramprasad","Renewable Sources of Energy-Mr.V.Sridharan", "Unconventional Machining Processes-Dr.M.Mohandass", "C.A.D./C.A.M.Laboratory-Mr.G.Mohandas/C.Senthamaraikrishnan/Mr.M.Nishal/Dr.Ramesh/G.Saravanaram", "Design and Fabriction project-Gopinath,Sentilvelan", "Interview and career skills lab-S.Saktivel,R.Premraj"};

                String[] flmechbeight = {"Engineering Economics-Mr.K.Karthee", "Entrepreneurship Development-Mr.S.Gopinath", "Advanced I.C.Engines-Dr.S.Saravanan", "Additive Manufacturing-Dr.K.S.Badrinath" , "Non Destructive Testing and Materials-V.Sridaran" , "Project Work-R.Ramesh/Dr.S.Ponnuvel/Mr.S.Arumugam/Mr.M.Kalaimani"};






    String[] flmarinetwo={};

        String[] flmarinefour={"Computation Methods-A.R.Vijayalakshmi","Mechanism OF solids - G.Rameshkannan,Karnam Dileep","Marine Diesel Engines-K.V.Sivanarayana","Marine Auxilarry Machines-K.V.Sivanarayana","Marine Refrigeration and Air COnditioning -M.Anandan","Enineering Materials,Metallurgy and Metrology-J.Arun Chakkaravarthy","Marine Boilers and Steam Turbines-S.Krishnan","Strength of Materials and Applied Mechanics lab-G.Rameshkannan,Karnam Dileep","Thermal engineering and Boiler lab- Karnam dileep,G.Rameshkannan,Stanley Samuel,Nachiappan","Library-Arun Chakaravarthy and Karthick Kumar,Karthick kumar"};

            String[] flmarinesix={"Onboard Training"};

                String[] flmarineeight = {"Environmental Science and Engineering - Dr.S.Stanly Samuel", "Ship Operational Management and IMO Requirements - Prof.K.V.Sivanarayana", "Marine Control Engineering and Automation - S.Krishnan", "Safety Precautions and Watch Keeping - Prof.S.Krishnan", "Marine Corrosion and Prevention -Karthick Kumar", "Project Work, Technical Paper and Viva voce - Mr.V.Gurusamy/Mohan,Karthick kumar", "Comprehension Test - Anandhan,Mohan","Training assesment - Anandhan"};




    //odd sem of second year and third year and fourth year




    String[] flautoone = {"Communicative English - Mr. R. Premraj", "Engineering Mathematics - I - Ms. A. Suba", "Engineering Physics - Dr. K. Raju", "Engineering Chemistry - Dr. S. Ananda Babu", "Basic Electrical and Electronics Engineering - Mr. P. Arul", "Engineering Drawing - Mr. E. Ravindar Rao / Dr. J. Venkatesan", "Engineering Practices Laboratory - Mr. K. Paul Durai / Mr. E. Ravindar Rao & Mr. M. Sankar / Mr. I. Venkatraman & Mr. T. Annamalai / Mr. R. Karthikeyan", "Physics and Chemistry Laboratory - Dr. S. Sampath Krishnan, Dr. K. Raju / Dr. S. Ananda Babu", "Library - Mr. R. Sakthivel", "Seminar I - Mr. G. Ravi", "Seminar II - Mr. K. Paul Durai"};

        String[] flautothree = {"Automotive Engines-Dr.J.Venkatesan", "Mathematics III-Ms.N.S.Priya", "Engineering Thermodynamics-Mr.A.Balasubramanian / Mr.A.K.Boobalasenthilraj", "Engineering Materials and Metallurgy-Mr.K.E.Kumaraguru", "Mechanics of solids-Dr.S.Premnath / Mr.Ramanjaneyulu Kolla", "Manufacturing Technology-Mr.J.Dhanabal ", "Engine Performance and System Testing Lab-Dr.V.Ganesh / Mr.A.Balasubramanian", "Strength of materials lab-Mr.S.Premanth / Mr.R.Sakthivel / Mr.Ramanjaneyulu Kolla","Manufacturing Technology Lab-Mr.J.Dhanabal / Mt.K.E.Kumaraguru"};

            String[] flautofive = {"Applied Thermodynamics and Heat Transfer - Mr.K.Paul Durai / Mr.A.Balasubramanian", "Automotive Transmission-Mr.Ramanjaneyulu Kolla", "Automotive Electrical and Electronics System-Mr.G.Ravi", "Vehicle Design and Data Characteristics-Mr.R.Sakthivel / Mr.G.Ravi", "Automotive Fuels and Lubricants-Mr.E.Ravindar Rao", "Design of Machine Elements-Mr.J.Dhanabal / Mr.K.E.Kumaraguru", "Automotive Electrical and Electronics Lab-Mr.P.Muthukumaran / Mr.R.Nagaraj / Mr.A.Balasubramanian / Mr.A.K.Boobalasenthilraj", "Automotive Fuels and Lubricants Lab-Mr.Ramanjaneyulu Kolla / Mr.R.Sakthivel","Computer Aided Machine Drawing Lab-Mr.K.Paul Durai / Mr.G.Ravi"};

                String[] flautoseven = {"New Generation and Hybrid Vehicles-Mr.K.E.Kumaraguru","Automotive Aerodynamics-Mr.J.Dhanabal","Automotive Safety-Mr.G.Ravi","Engine and Vehicle Management System-Mr.R.Sakthivel","Vehicle Maintenance-Mr.K.Paul Durai","Automotive Pollution and Control-Mr.A.K.Boobalasenthilraj","Finite Element Analysis-Dr.V.Ganesh / Mr.Ramanjaneyulu Kolla","Engine Performance and Emission Testing Lab-Mr.V.Gamesh / Mr.A.K.Boobalasenthilraj","Vehicle Maintenance Lab-Dr.S.Premnath / Mr.E.Ravindar Rao","Library-Mr.A.K.Boobalasenthilraj","Placement-Mr.G.Ravi / Mr.Ramanjaneyulu Kolla","Project Work I-Mr.E.Ravindar Rao"};




    String[] flbiotechone = {"Communicative English - Dr.T.Murugavel", "Engineering Mathematics - I - Dr.B.Saravanan", "Engineering Physics - Dr.N.R.Sheela", "Engineering Chemistry - Dr.G.Devasagayam", "Basic Electrical and Electronics Engineering - Mr.P.Muthukumaran", "Engineering Drawing - Dr.M.Gajendiran / Dr.R.Ramesh", "Engineering Practices Laboratory - Dr.V.Sridharan / Mr.G.Logachandar & Mr.R.Kannadasan / Ms.S.Sindhamani", "Physics and Chemistry Laboratory - Dr.N.R.Sheela / Dr.T.Balusamy", "Library - Ms.S.Pandi Prabha / Dr.S.Prabha", "Seminar I - Mr.N.Sathish", "Seminar II - Mr.J.Hariharan"};

        String[] flbiotechthree = {"Transforms and Partial Differential Equations-Dr.R.Muthukumarasamy","Stoichiometry and Process Calculations-Ms.V.Sumitha / Mr.P.K.Praveen Kumar (T)","Bioorganic Chemistry-Mr.N.Sathish / Dr.S.Prabhu (T)","Cell Biology-Mr.S.Naga Vignesh / Ms.P.Jaibiba (T)","Basic Industrial Biology-Ms.N.Kanagam","Environmental Science and Engineering-Prof. R.B.Narayanan","Cell Biology Lab-Ms.P.Jaibiba / Mr.S.Naga Vignesh","Bioorganic Chemistry Lab-Ms.S.Pandi Prabha / Dr.A.Senthil Nagappan","Library-Ms.V.Sumitha","Seminar-Mr.P.K.Praveen Kumar"};

            String[] flbiotechfive = {"Protein Structure Function and Proteomics-Mr.S.Naga Vignesh / Dr.A.Senthil Nagappan(T)","Bioprocess Engineering-Dr.D.Suresh Kumar / Dr.D.Nilavunesan (T)","Mass Transfer Operations - Dr.D.Nilavunesan / Ms.V.Sumitha(T)","Molecular Biology-Mr.N.Sathish ","Biophysics-Dr.Senthil Nagappan","Principles of Food Processing-Ms.P.Jaibiba","Biopharmaceutical Technology-Dr.S.Pandi Prabha","Bioprocess Lab-I-Dr.D.Nilavunesan / Mr.D.Suresh Kumar","Molecular Biology Lab-Mr.N.Sathish / Ms.N.Kanagam","Library-Mr.J.Hariharan","Seminar-I-Dr.S.Prabhu ","Seminar-II-Dr.R.B.Narayanan"};

                String[] flbiotechseven = {"Bioinformatics and Computational Biology-Mr.P.K.Praveen Kumar / Mr.S.Naga Vignesh (T)","Downstream Processing-Dr.E.Nakkeeran / Mr.D.Suresh Kumar (T)","Creativity,Innovation and New Product Development-Dr.A.Senthil Nagappan","Bioconjugate Technology and Applications-Mr.J.Hariharan","Bio Industrial Entrepreneurship-Ms.N.Kanagam","Tissue Engineering-Dr.R.B.Narayanan","Neurobiology and Cognitive Sciences-Dr.S.Prabhu","Downstream Processing Lab-Mr.D.Suresh Kumar / Dr.D.Nilavunesan","Immunology Lab-Ms.N.Kanagam /Mr.J.Hariharan","Bioinformatics lab-Mr.P.K.Praveen Kumar / N.Sathish","Library-N.Sathish","Seminar-Ms.V.Sumitha","Project Planning-Dr.E.Nakkeeran"};





    String[] flchemaone = {"Communicative English - Mr.R.Prenraj", "Engineering Mathematics - I - Dr.M.Radhakrishnan", "Engineering Physics - Dr.A.Anandavadivel", "Engineering Chemistry - Dr.G.Devasagayam", "Electrical Machines and Drives - Mr.M.Sankar", "Programming for Problem Solving - Ms.P.Leela Rani", "Engineering Practices Laboratory - Mr.E.Suresh / Mr.R.Ganesan", "Physics and Chemistry Laboratory - Dr.A.Anandavadivel / Dr.T.Balusamy", "Library - Mr.S.Rajasekar", "Special Class for Engineering Mathematics -I - Ms.P.G.Priya Darshini / Dr.M.Radhakrishnan", "Special class for Electrical Machines and Drives - Mr.S.Jai Ganesh / Mr.M.Sankar", "Special class for Programming for Problem Solving - Mr.S.Bharath / Ms.P.Leela Rani", "Special class for Engineering Mathematics - I - Ms.S.Swathi / Dr.M.Radhakrishnan"};

        String[] flchemathree = {"Mathematics III-Dr.V.Thilaka","Electrical Drives And Control-Dr.V.Sreeraj","Organic Chemistry-DrM.Thirumalaikumar","Mechanics of Solids for Chemical Engineering-Mr.S.Jai Ganesh / Dr.M.Yogesh Kumar(T) ","Physical Chemistry-Dr.N.Nachiappan","Fluid Mechanics-Mr.D.Sivakumar / Mr.N.Meyyappan(T)","Organic Chemistry Lab-Dr.G.Thirumalaikumar / Ms.G.Sudha","Physical Chemistry Lab-Dr.N.Nachiappan / Dr.Nalinkanth V Ghone(A1) / Ms.N.Sundari(A2)", "Library-Ms.N.Sundari"};

            String[] flchemafive = {"Computational Methods-Ms.A.Suba","Environmental Science and Engineering-Ms.S.Swathi","Chemical Process Industries I-Ms.N.Sundari", "Chemical Engineering Thermodynamics II-Ms.G.Thayanidhi","Mass Transfer I-Dr.Nalinkanth V Ghone","Process Instrumentation Dynamics and Control-Dr.R.Govindarasu","Interview and Career Skills Lab-Dr.T.Murugavel / Mr.P.Ganapathy","Mechanical Operations Lab-Mr.N.Arun Prem Anand / Ms.G.Thayanidhi", "Heat Transfer Lab-Mr.B.S.Vishal/Ms.N.Sundari"};

                String[] flchemaseven = {"Drugs and Pharmaceutical Technology-Dr.Nalinkanth V Ghone","Fertilizer Technology-Ms.G.Sudha","Industrial Management-Mr.B.S.Vishal","Chemical Reaction Engineering-Ms.A.C.Vijayalakshmi / Mr.S.Bharath","Transport Phenomena-Dr.C.Anand Babu","Chemical Process Plant Safety-Dr.N.Meyyappan","Process Economics-Mr.B.S.Vishal","Biochemical Engineering-Dr.D.Swaminathan","Chemical Reaction Engineering Lab-Dr.R.Palani / Ms.G.Sudha","Process Control Lab-Dr.R.Govindarasu / Mr.S.Jai Ganesh"};





    String[] flchembone = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - I - Dr.D.Meiyappan", "Engineering Physics - Dr.A.Anandavadivel", "Engineering Chemistry - Dr.M.Thirumalaikumar", "Electrical Machines and Drives - Mr.G.Vinothkumar", "Programming for Problem Solving - Mr.E.Sakthivel", "Engineering Practices Laboratory - Mr.M.Kalaimani", "Physics and Chemistry Laboratory - Dr.A.Anandavadivel / Dr.T.Balusamy", "Library - Ms.G.Saraswathi", "Special Class for Engineering Mathematics -I - Ms.P.G.Priya Darshini / Dr.D.Meiyappan", "Special class for Electrical Machines and Drives - Ms.G.Saraswathi / Mr.G.Vinothkumar", "Special class for Programming for Problem Solving - Mr.S.Rajasekar / Mr.E.Sakthivel", "Special class for Engineering Mathematics - I - Dr.R.Govindarasu / Dr.D.Meiyappan"};

        String[] flchembthree = {"Mathematics III-Ms.Visalakshi Subramanian","Electrical Drives And Control-Dr.V.Sreeraj","Organic Chemistry-Dr.G.Baskar","Mechanics of Solids for Chemical Engineering-Dr.M.Yogesh Kumar / Mr.S.Bharath","Physical Chemistry-Dr.M.Thirumalaikumar","Fluid Mechanics-Dr.R.Palani / Mr.B.S.Vishal","Organic Chemistry Lab-Dr.G.Baskar / Mrs.G.Saraswathi","Physical Chemistry Lab-Ms.B.Preetha / Mr.D.Sivakumar","Library-Ms.G.Saraswathi"};

            String[] flchembfive = {"Computational Methods-Dr.B.Saravanan","Environment Science and Engineering-Ms.G.Saraswathi","Chemical Process Industries I-Mr.S.Rajasekar","Chemical Engineering Thermodynamics II-Ms.S.Swathi","Mass Transfer I-Ms.N.Sundari","Process Instrumentation Dynamics and Control-Mr.N.Arun Prem Anand","Interview and Career Skills Lab-Dr.S.B.Lavanya / Mr.R.Premraj","Mechanical Operations Lab-Dr.D.Swaminathan / Dr.M.Yogesh Kumar","Heat Transfer Lab-Ms.A.C.Vijayalakshmi / Ms.S.Swathi"};

                String[] flchembseven = {"Drugs and Pharmaceutical Technology-Dr.Nalinkanth V Ghone","Fertilizer Technology-Ms.G.Sudha","Industrial Management-Mr.B.S.Vishal","Chemical Reaction Engineering-Mr.S.Bharath / Dr.C.Anand Babu","Transport Phenomena-Mr.N.Arun Prem Anand","Chemical Process Plant Safety-Ms.G.Thayanidhi","Process Economics-Ms.P.G.Priyadarshini","Biochemical Engineering-Dr.M.Yogesh Kumar","Chemical Reaction Engineering Lab-Mr.D.Sivakumar / Mr.S.Bharath","Seminar and Comprehension- B1-Dr.C.Anad Babu / Mr.S.Rajasekar / Dr.R.Govindarasu.  B2-Ms.P.G.Priyadarshini / Dr.Nalinkanth V Ghone","Process Control Lab-Mr.S.Rajasekar / Ms.P.G.Priyadarshini"};






    String[] flcivilone = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - I - Dr.G.Satheesh Kumar", "Engineering Physics - Ms.G.Bharathy", "Engineering Chemistry - Dr.T.Balusamy", "Basic Electrical and Electronics Engineering - Mr.N.Sathish", "Engineering Drawing - Ms.V.Tamizhselvi / Ms.Ruby Freya", "Engineering Practices Laboratory - Mr.K.Arun", "Physics and Chemistry Laboratory - Ms.G.Bharathy / Dr.N.Nachiappan", "Library - Ms.K.Sathya Priya", "Seminar I - Ms.K.Sathya Priya", "Seminar II - Mr.R.Kalaivannan"};

        String[] flcivilthree = {"Strength of Materials I-Dr.P.Venkateswara Rao / Mr.G.Kumar","Mechanics of Fluids-Mr.S.Diravia Balan / Mr.R.Kalaivannan","Surveying I-Mr.G.Kumar","Engineering Geology-Mr.K.Arun","Construction Materials-Ms.K.Sathya Priya","Mathematics III-Dr.S.Prabhu","Strength of Materials Lab-Mr.R.Mathiyazhagan / Dr.P.Venkateswara Rao / Ms.Ruby Freya","Computer Aided Building Drawing-Ms.K.SathyaPriya / Mr.G.Arun / Mr.S.Diravia Balan","Library-Mr.K.Arun","Seminar-Mr.S.Diravia Balan"};

            String[] flcivilfive = {"Structural Analysis I-Ms.Ruby Freya / Ms.K.Sathya Priya","Highway Engineering-Dr.M.Selvakumar","Design of Reinforced Concrete Elements-Ms.K.Sathya Priya","Foundation Engineering-Ms.C.Sandhya","Environmantal Engineering I-Mr.R.Mathiyazhagan","Construction Techniques and Equipment Practice-Mr.K.Arun","Soil Mechanics Lab-Ms.C.Sandhya / Mr.G.Arun","Interview and Career Skills Lab-Ms.B.Anichamalar","Seminar-Ms.Ruby Freya","Library-Ms.K.Sathya Priya"};

                String[] flcivilseven = {"Traffic Engineering and Management-Dr.M.Selvakumar","Structural Dynamics and Earthquake Engineering-Mr.G.Kumar","Prestressed Concrete Structures-Dr.V.Tamizhselvi","Water Resources and Irrigation Engineering-Mr.R.Kalaivannan","Estimation and Quantity Surveying-Mr.G.Arun","Municipal Solid Waste Management-Mr.R.Mathiyazhagan","Computer Aided Design and Drafting Lab-Mr.G.Kumar/Mr.R.Kalaivannan","Design Project-All Faculties","Technical Skills-Ms.Ruby Freya","Quantitative and Aptitude-Dr.M.Selvakumar","Library-Mr.R.Mathiyazhagan"};






    String[] flcseaone = {"Communicative English - Ms.Anichamalar", "Engineering Mathematics - I - Dr.T.Kulandaivel", "Engineering Physics - Mr.J.Mohan Raj", "Engineering Chemistry - Ms.B.Preetha", "Basic Electrical and Electronics Engineering - Mr.M.Rajvikram", "Programming for Problem Solving - Dr.K.S.Gayathri", "Engineering Practices Laboratory - Mr.R.Ganesan / Mr.M.Balakumar", "Physics and Chemistry Laboratory - Mr.J.Mohan Raj / Dr.S.Anand Babu", "Programming for Problem Solving - Ms.R.Bhuvaneswari, Mr.B.PraveenKumar / Mr.T.Kumaran, Mr.T.Rajasekaran, Mr. R.Senthilkumar", "Library - Mr.C.S.Sanoj", "Seminar - Mr.T.Rajasekaran"};

        String[] flcseathree = {"Mathematics III-Dr.R.Uma Devi","Programming and Data Structures II-Ms.T.Padmavathy","Operating Systems-Ms.D.Sasikala","Microprocessor and Microcontroller-Mr.A.Sowmyanarayanan","Analog and Digital Communication-Ms.D.Menaka","Environmantal Science and Engineering-Dr.A.Senthil Nagappan","Programming and Data Structures Lab II-Ms.T.Padmavathy / Ms.V.Rajalakshmi","Operating Systems Lab-Ms.D.Sasikala / Ms.U.Abirami","Microprocessor and Microcontroller Lab-Ms.MMehzabeen(A1) / Ms.C.Gomatheeswari Preethika(A2) / Mr.N.Kumaran","Library-Mr.R.Senthilkumar"};

            String[] flcseafive = {"Discrete Mathematics-Dr.B.Thilaka","Internet Programming-MS.J.Buvana","Object Oriented Analysis and Design-Mr.R.Senthilkumar","Theory of Computation-Mr.P.Selvamani","Computer Graphics-Dr.N.M.Balamurugan","Internet Programming Lab-Ms.J.Buvana / Mr.K.Srinivasan","Computer Graphics Lab-Ms.G.Janakasudha & Mr.M.P.Lakshmanakumar / Dr.N.M.Balamurugan & Dr.R.Jayabhaduri","Seminar 1-Dr.P.Janarthanan","Seminar 2-Dr.N.M.Balamurugan","Library-Dr.K.S.Gayathri"};

                String[] flcseaseven={"Cryptogtaphy and Network Security-Mr.K.Kumaran","Graph Theory and Applications-Ms.S.Rajalakshmi","Grid and Cloud Computing-Ms.S.Iyswarya","Resource Managament Techniques-Ms.N.Revathi","Cyber Forensics-Mr.T.Kumaran","Information Retrieval-Dr.R.Jayabhaduri","Security Lab-Mr.K.Kumaram & Mr.C.S.Sanoj","Grid and cloud Computing Lab-Ms.R.Iyswarya & Ms.R.Gayathri","Project 1-Ms.N,Rajeswari & Mr.P.Selvamani","Project 2-Dr.P.Janarthanan & Dr.J.M.Gnanasekar","Project 3-Dr.C.Jayakumar & Mr.M.Suresh Kumar","Seminar -Mr.T.Rajasekaran","Library-Ms.N.Rajeswari"};





    String[] flcsebone = {"Communicative English - Mr.S.Sakthivel", "Engineering Mathematics - I - Dr.R.Suresh", "Engineering Physics - Dr.K.Raju", "Engineering Chemistry - Ms.B.Preetha", "Basic Electrical and Electronics Engineering - Mr.I.Venkatraman", "Programming for Problem Solving - Ms.R.Bhuvaneswari", "Engineering Practices Laboratory - Mr.E.Suresh / Mr.V.Senthilvelan", "Physics and Chemistry Laboratory - Dr.K.Raju , Dr.N.Nachiappan / Dr.S.Anand Babu", "Programming for Problem Solving - Ms.R.Bhuvaneswari, Mr.B.PraveenKumar , Mr.C.S.Sanoj / Mr.T.Kumaran, Mr.P.Selvamani", "Library - Dr.K.S.Gayathri", "Seminar - Mr.T.Kumaran"};

        String[] flcsebthree = {"Mathematics III-Dr.S.Prabhu","Programming and Data Structure Lab II-Ms.V.Rajalakshmi","Operating Syatems-Ms.S.Senthamizhselvi","Microprocessor and Microcontroller-Mr.A.Sowmyanarayanan","Analog and Digital Communication-Ms.K.S.Subhashini","Environmental Science and Engineering-Dr.A.Nilavunesan","Programming and Data Structures Lab II-Ms.V.Rajalakshmi & Ms.S.Rajalakshmi","Operating Systems Lab-Ms.S.Senthamizhselvi & Ms.D.Sasikala","Microprocessor and Microcontroller Lab-Ms.S.M.Mehzabeen & Mr.G.Loganathan","Library-Ms.R.Bhuvaneswari"};

            String[] flcsebfive = {"Discrete Mathematics-Dr.G.Satheeshkumar","Internet Programming-Dr.J.M.Gunasekar","Object Oriented Analysis and Design-Mr.R.Senthilkumar","Theory of Computation-Ms.R.Gayathri","Computer Graphics-Ms.E.Rajalakshmi","Internet Programming Lab-Ms.N.Revathi & Ms.J.Buvana","Computer Graphics Lab-Ms.E.Rajalakshmi & Mr.M.P.Lakshmanakumar","Interview and Career Skills Lab-Mr.Sam Dawson & Ms.Amutha Charu Sheela","Seminar 1-Dr.R.Jayabhaduri","Seminar 2-Ms.N.Rajeswari / Mr.M.Suresh Kumar","Library-Dr.R.Jayabhaduri"};

                String[] flcsebseven = {"Cryptogtaphy and Network Security-Mr.M.Adimoolam","Graph Theory and Applications-Mr.T.Rajasekaran","Grid and Cloud Computing-Dr.P.Janarthanan","Resource Management Techniques-Dr.R.Nedunchelian","Cyber Forensics-Mr.T.Kumaran","Information Retrieval-Dr.R.Jayabhaduri","Security Lab-Mr.M.Adimoolam & Mr.A.Sowmyanarayanan","Grid and Cloud Computing Lab-Ms.R.Gayathri & Ms.P.Vinothiyalakshmi","Seminar-Ms.N.Rajeswari","Project 1-Dr.C.Jayakumar & Mr.A.Sowmyanarayanan","Project 2-Mr.R.Senthilkumar & Dr.S.P.Manikandan","Project 3-Dr.R.Jayabhaduri & Mr.M.Adimoolam","Library-Dr.C.Jayakumar"};




    String[] flcsecone = {"Communicative English - Dr.Sam Dawson", "Engineering Mathematics - I - Ms.Visalakshi Subramanian", "Engineering Physics - Dr.N.R.Sheela", "Engineering Chemistry - Dr.N.Nachiappan", "Basic Electrical and Electronics Engineering - Mr.V.Mohan Raj", "Programming for Problem Solving - Ms.G.Janakasudha", "Engineering Practices Laboratory - Mr.M.Balakumar / Dr.S.Natarajan", "Physics and Chemistry Laboratory - Dr.N.R.Sheela / Dr.T.Balusamy", "Programming for Problem Solving - Ms.G.Janakasudha, Mr.T.Rajasekaran / Mr.P.Selvamani, Mr.R.Senthilkumar", "Library - Ms.R.Bhuvaneswari", "Seminar - Mr.P.Selvamani"};

        String[] flcsecthree = {"Mathematics III-Ms.N.S.Priya","Programming and Data Structures II-Ms.N.Rajeswari","Operating Systems-Dr.R.Anitha","Microprocessor and Microcontroller-Mr.B.Praveenkumar","Analog and Digital Communication-Mr.B.Nethaji","Environmental Science and Engineering-Mr.S.Bharath","Programming and Data Structures Lab II-N.Rajeswari,Ms.T.PAdmavathy & Mr.B.Praveenkumar","Operating Systes Lab-Ms.U.Abirami & Ms.S.Senthamizhselvi","Microprocessor and Microcontroller Lab-Mr.B.Nthaji, Ms.RajeswariRamaraj","Library-Ms.N.Rajeswari"};

            String[] flcsecfive = {"Discrete Mathematics-Dr.A.R.Vijayalakshmi","Internet Programming-Mr.K.Srinivasan","Object Oriented Analysis and Design-Mr.M.P.Lakshmanakumar","Theory of Computation-Mr.C.S.Saroj","Computer Graphics-Dr.N.M.Balamurugan","Internet Programming(Tutorial)-Mr.K.Srinivasan & Dr.J.M.Gnanasekar","Computer Graphics Lab-Ms.G.Janakasudha,Mr.M.P.Lakshmanakumar(C1), Ms.E.Rajalakshmi(C2)","Internet Programming Lab-Mr.K.Srinivasan,Ms.N.Revathi","Interview and Career skills laboratory-Ms.S.B.Lavanya and Mr.S.Sakthivel","Seminar 1-Dr.S.P.Manikandan and Mr.T.Kumaran","Seminar 2-Mr.T.Kumaran","Library-Dr.P.Janarthanan"};

                String[] flcsecseven = {"Cryptography and Network Security-Mr.M.Suresh Kumar","Graph Theory and Applicatons-Ms.U.Abirami","Grid and cloud Computing-Ms.P.Vinothiyalakshmi","Resource Management Techniques-Mr.P.Selvamani","Ad hoc and sensor Networks-Dr.C.Jayakumar","Data Analytics-Dr.S.P.Manikandan","Security Lab-Mr.K.Kumanan & Mr.M.Sureshkumar","Grid and Cloud Computing Lab-Ms.R.Ishwarya & Ms.P.Vinothiyalakshmi","Seminar 1-Dr.K.S.Gayathri","Project1-Mr.A.Sowmyanarayanan and Mr.M.Adimoolam","Project 2-Mr.M.Sureshkumar & Mr.Rajasekaran","Project 3-Dr.S.P.Manikandan & Mr.P.Selvamani","Library-Dr.S.P.Manikandan"};





    String[] fleeeaone = {"Communicative English-Dr.Amutha C Sheela", "Mathematics_I-Dr.D.Meiyappan", "Engineering Physics-I-Ms.G.Bharathy", "ENgineering Chemistry-I-Dr.G.Baskar", "Basic Civil and Mechanical Engineering-Mr.K.Arun/Mr.G.K.Kirubakaran", "Programming for Problem Solving-Ms.V.Saroja", "Programming for problem solving-Ms.V.Saroja*,Ms.K.Kiruthika Devi,Ms.Kruba Wesley,Mr.A.R.Guru Gokul", "Engineering Practise Laboratory-Mr.M.Kalaimani/K.Ram Prasad,Ms.M.Rajalakshmi*","Library-Mr.T.Annamalai", "Seminar1-Mr.S.Sudharsanam","Seminar 2-Ms.M.Rajalakshmi","Seminar 3-Ms.M.Maadhuri","Sports-Dr.R.K.Kannadasan/Mr.M.Ravivikram/Ms.M.Maadhuri"};

        String[] fleeeathree = {"Mathematics-III-Ms.K.Vijayalakshmi", "Electronic Devices and Circuits-Ms.M.Maadhuri", "Electromagnetic Theory-Mr.S.Thamizhmani", "Electrical Machines-I-MS.K.Suganthi", "Programming and Data Structures-Ms.N.Uma", "Measurements and Instrumentations-Mr.C.Kamal", "Electrical Machines-I Lab-Ms.K.Suganthi,Mr.S.V.Sreeraj,Dr.S.G.Bharathidasan/Mr.S.Kumaravel", "Electronic Devices and Circuits Lab-Ms.M.Maadhuri,Ms.M>Sasikala", "Programming and Data Structures Lab-Ms.N.Uma,Ms.R.Saktheeswari"};

            String[] fleeeafive = {"Power System Analysis-Mr.M.Sankar","Design of Electrical Apparatus-Dr.Nalin Kant Mohanty","Microprocessors and Microcontrollers-Ms.D.Amudhavalli", "Power Plant Engineering-Mr.S.Arumugam", "Power Electronics-Mr.I.Venkatraman","Power Electronics LAb-Mr.I.Venkatraman(I/C),Mr.T.Annamalai","Microprocessor and microcontroller lab-Ms.D.Amudhavalli(I/C),Mr.D.S.Purushothaman","Library-Mr.S.Sudharsanam","Seminar-Mr.C.Venkatesan(M),Mr.M.Rajvikram(F)"};

                String[] fleeeaseven = {"High Voltage Engineering-Mr.C.Kamal", "Protection and Switchgear-Mr.C.Venkatesan", "Special Electrical Machines-Ms.S.Arulmozhi", "Principles of Management-Dr.R.Karthikeyan", "Bio-Medical Instrumentation(E-II)-Dr.C.Gopinath", "Fundamentals of Nanoscience(E-III)-Ms.S.Anitha","Power System Simulation Lab-Dr.C.Gopinath(I/C),Mr.C.Kamal", "Comprehension-Dr.Sudhakar K Bharathan,Ms.S.Arulmozhi,Ms.K.S.Pavithra,Mr.S.S.Sethuraman,Mr.S.V.Sreeraj,Dr.Nalinkanth Mohanty", "Soft Skills Training-Mr.G.Vinothkumar,Mr.C.Kamal,Ms.K.Suganthi", "Central Library-Ms.D.Amudhavalli", "Seminar-Dr.C.Gopinath"};





    String[] fleeebone = {"Communicative English-Ms.S.B.Lavanya", "Mathematics-I-Dr.G.Satheesh Kumar", "Engineering Physics-I-Ms.S.KAlpana", "Engineering Chemistry-I-Dr.G.Baskar","Basic Civil and Mechanical Engineering-Mr.K.Arun/Mr.E.Suresh","Programming for problem solving-Ms.K.Kiruthika Desvi", "Programming for problem solving Laboratory-Ms.K.Kiruthika Devi,Ms.N.Devi,Ms.J.Sharon Ranjitha Esther,Ms.K.Nivethaa Shree", "Engineering Practise Laboratory-Mr.S.Yeshwanthraj,Dr.R.Kannadasan*", "Library-Mr.M.Shankar", "Seminar 1-Mr.A.Tamilselvan","Seminar 2-Dr.R.Kannadan","Seminar 3-Mr.G.Vinothkumar","Ms.M.Rajalakshmi"};

        String[] fleeebthree = {"Mathematics-III-Ms N.S.Priya", "Electronic Devices and Circuits-Ms.S.Anitha", "Electromagnetic Theory-Dr.Sudhakar K Bharathan", "Electrical Machines-I-Mr.V.Mohanraj", "Programming and Data Structures-Ms.K.Nivethashree", "Measurements and Instrumentations-Mr.A.Thamizhselvan", "Electrical Machines-I Lab-Ms.S.Arulmozhi,Mr.V.Mohanraj,Mr.S.S.Sethuraman", "Electronic Devices and Circuits Lab-Ms.S.Anitha/Ms.K.S.Pavithra", "Programming and Data Structures Lab-Ms.K.Nivethashree,Mr.V.Ranjith"};

            String[] fleeebfive = {"Power System Analysis-Mr.M.Rajvikram","Design of Electrical Apparatus-MR.G.Vinothkumar","Microprocessors and Microcontrollers-Dr.S.G.Bharathidasan", "Power Electronics-Mr.A.Thamizhselvan", "Total quality Management-Mr.S.Thamizhmani", "Environmental Science and Engineering-Ms.P.G.Priyadharshini", "Power Electronics Lab-Mr.A.Thamizhselvan(I/C)/MR.m>Rajvikram", "Microprocessor and microcontroller Lab-Ms.M>Sasikala,Ms.N.Shanmugavadivu", "Library-Mr.A.Thamizhselvan","Seminar-Ms.M.Maadhuri(T),Ms.S.Arulmozhi(TH)"};

                String[] fleeebseven = {"High Voltage Engineering-Dr.K.Sundararaman", "Protection and Switchgear-Dr.K.Kannadasan", "Special Electrical Machines-Ms.N.Shanmugavadivu", "Principles of Management-Dr.R.Karthikeyan", "Bio-Medical Instrumentation(E-II)-Mr.D.S.Purushothaman", "Fundamentals of Nanoscience(E-III)-Ms.M.Sasikala", "Power System Simulation Lab-Mr.R.Kannadasan,Mr.C.Venkatesan", "Comprehension-Dr.C.Gopinath,Mr.S.Kumaravel/Dr.K.Sundararaman,Mr.S.Thamizhmani,Mr.S.Kumaravel", "Soft Skills Training-Ms.S.Sinthamani,Dr.R.Karthikeyan", "Central Library-Mr.D.Purushothaman", "Seminar-Mr.S.Thamizhmani"};




    String[] fleceaone = {"Communicative English - Mr.P.Ganapathy", "Engineering Mathematics - I - Dr.S.Prabhu", "Engineering Physics - Mr.J.Mohan Raj", "Engineering Chemistry - Dr.T.Balusamy", "Basic Electrical Engineering - Ms.S.Radhika", "Engineering Drawing - Mr.S.Muniraj / Mr.G.Kirubakaran", "Engineering Practices Laboratory - Mr. T. Annamalai / Mr.K.Ramprasad , Mr.M.Kalaimani", "Physics and Chemistry Laboratory - Mr.J.Mohan Raj / Dr.T.Balusamy", "Library - Ms.M.Vidya", "Seminar I - Ms.S.Sangeethapriya / Mr.B.Nethaji", "Sports - Mr.R.Nagaraj"};

        String[] fleceathree = {"Mathematics III-Dr.A.R.Vijayalakshmi","Electrical Engineering and Instrumentation-Ms.M.Rajalakshmi","Programming and Data Structures-Ms.S.U.Muthunagai","Digital Electronics-Mr.M.K.Varadarajan","Electromagnetic Fields-Ms.Rajeswari Ramaraj/Dr.P.Jothilakshmi(T)","Electronic Circuits I-Mr.S.R.Balasubramanian","Digital Electronics Lab-Ms.M.Anushya,Mr.M.K.Varadarajan,Ms.Rajeswari Ramaraj","Analog Circuits Lab-Dr.R.Gayathri,Mr.B.Nethaji,Ms.S.Reethi","Programming and Data Structures Lab-Ms.S.U.Muthunagai,Ms.S.K.Umamaheswari","Library-Dr.P.Jothilakshmi"};

            String[] fleceafive = {"Digital Communication-Dr.S.R.Malathi","Principles of Digital Signal Processing-Ms.R.Kousalya,Dr.N.Kumaratharan(T))","Transmission Lines and waveguides-Mr.P.Muthukumaran, Mr.K.Srividhya(T)","Microprocessor and Microcontroller-Ms.K.S.Subhashini","Environmental Science and Engineering-Ms.C.Sandhiya","Digital Signal Processing Lab-Ms.R.Kousalya,Ms.B.Sarala,Mr.N.Sathish/Mr.P.Arul","Communication System Lab-Ms.M.Anushya,Ms.B.Hemalatha/Mr.M.H.Masood,Dr.H.Umma Habiba/DR.P.Jothilakshmi","Microprocessor and Microcontroller Lab-Ms.K.S.Subhashini,Mr.S.Senthil Rajan,Dr.G.PAdmavathi/Dr.G.A.Sathishkumar","Medical Electronics/Robotics and Automation(E-1)-Ms.M.Anushya/Mr.S.P.Sivagnana Subramanian","Library-Ms.K.Srividhya"};

                String[] fleceaseven = {"RF and Microwave Engineering-MS.Sangeethapriya", "Optical Communication and Networks-Dr.P.Jothilakshmi", "Embedded and Real Time Systems-Mr.N.Kumaran", "Satellite Communication/Digital Image Processing(Elective-II)-Ms.K.Srividhya/Ms.D.Menaka", "Advanced Computer Architecture-Dr.G.A.Sathishkumar","Advanced Microprocessors and microcontrollers-Mr.P.Arul","Embedded Lab-Ms.S.M.Mehazabeen", "Optical and Microwave Lab-Mr.P.Muthukumaran,Ms.S.Sangeethapriya", "Library-Ms.S.Sangeethapriya", "Seminar-Ms Rajeswari Ramaraj,Mr.S.P.Sivagnana Subramanian,Mr.S.Senthil Rajan,Ms.S.Sangeethapriya"};





    String[] flecebone = {"Communicative English-Ms.S.B.Lavanya", "Mathematics-I-Dr.V.Valliammai", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-Dr.T.Balusamy", "Basic Electrical and Electronics Engineering-Mr.G.Loganathan", "Engineering Drawing-Mr.M.Kalaimani/Mr.R.Ganesan","Engineering Practices-Ms.K.S.Pavithra/Mr.G.Logachander,Dr.V.Sridharan", "Physics/Chemistry Lab-K.Raju/Dr.S.Sampath Kumar/Dr.S.Ananda Babu,", "Library-Ms.A.Bharathipriya","Seminar-Ms.Rajeshwari Ramaraj/Mr.N.Kumaran","Sports-Ms.A.Bharathipriya"};

        String[] flecebthree = {"Mathematics III-Dr.D.Meiyappan", "Electrical Engineering and Instrumentation-Mr.T.Annamalai", "Programming and Data Structures-Ms.S.K.Umamaheswari", "Digital Electronics-Dr.S.Malathi", "Electromagnetic Fields-Ms.B.Hemalatha/Dr.H.Umma Habiba(T)", "Electronic Circuits-I-Mr.G.Loganathan", "Digital Electronics Lab-Dr.S.R.Malathi,Ms.L.Anju,Ms.S.Radhika", "Programming and Data Structures Lab-Ms.S.K.Umamaheswari", "Analog Circuits LAb-Ms.B.Hemalatha,Ms.M.Vidya,Mr.G.Loganathan","Library-Dr.H.Umma Habiba"};

            String[] flecebfive = {"Digital Communication-Ms.G.Padmavathi", "Principles of Digital Signal Processing-Ms.S.Kalyani,Ms.G.Padmavathi(T)", "Transmission Lines and Waveguides-Ms.K.Srividhya,Mr.S.Saravanan(T)", "Microprocessor and Microcontroller-Dr.S.Muthu Kumar", "Environmental Science and Engineering-Mr.R.Kalaivanan", "Digital Signal Processing Lab-Ms.D.Menaka,Ms.S.Kalyani,Ms.M.Vidya", "Communication System Lab-Mr.S.R.Balasubramanian,Mr.S.P.Sivagnana Subramanian,Ms B Hemalatha", "Microprocessor and Microcontroller Lab-Mr.M.Athappan,Ms.A.Bharathipriya,Mr.M.K.Varadarajan/Mr.R.Nagaraj","Medical Electronics/Robotics and Automation-Ms.M.Anushya/Mr.S.P.Sivagnana Subramanian","Library-Mr.S.Saravanan"};

                String[] flecebseven = {"RF and Microwave Engineering-Ms.C.Gomatheeswari Preethika", "Optical Communication and Networks-Dr.R.Gayathri", "Embedded and Real Time Systems-Ms.S.Reethi", "Satellite Communication-Ms.S.Radhika","Speech Processing-Ms.M.Vidya","Cognitive Radio-Dr.N.Kumaratharan", "Embedded Lab-Ms.R.Kousalya, Ms.S.Reethi", "Optical and Microwave Lab-Mr.S.Saravanan,Ms.C.Gomatheeswari Preethika", "Library-Ms.M.Vidya", "Seminar-Mr.P.Arul,Ms.A.Bharathipriya,Mr.S.Saravanan,Mr.B.Nethaji"};





    String[] flececone = {"Communicative English-Mr.Premraj", "Mathematics-I-Dr.T.Kulandaivel", "Engineering Physics-I-Dr.N.R.Sheela", "Engineering Chemistry-I-Ms.B.Preetha", "Basic Electrical and Electronics Engineering-Ms.M.Vidya","Engineering Drawing-Mr.R.Ganesan/Mr.M.Balakumar", "Engineering Practices Laboratory-Mr.G.Vinoth Kumar,Mr.V.Senthilvelan,Mr.M.Nishal", "Physics/Chemistry Lab-Dr.N.R.Sheela,Ms.G.Bharathy/Ms.B.Preetha", "Library-Ms.S.M.Mehzabeen","Seminar-M.M.Vidya,Mr.N.Kumaran","Sports-Mr.N.Sathish"};

        String[] flececthree = {"Mathematics III-Dr.R.Umadevi", "Electrical Engineering and Instrumentation-Ms.M.Rajalakshmi", "Programming and Data Structures-Ms.S.Poorani", "Digital Electronics-Mr.M.Athappan", "Electromagnetic Fields-Mr.M.H.Masood,Ms.Rajeswari Ramaraj(T)", "Electronic Circuits-I-Ms.B.Sarala", "Digital Electronics Lab-Mr.M.Athappan,Mr.N.Sathish/Mr.R.Nagaraj", "Analog Circuits Lab-Ms.B.Sarala,Mr.M.H.Masood,Ms.S.Sangeethapriya", "Programming and Data Structures Lab-Ms.S.Poorani,Ms.S.U.Muthunagai", "Library-Ms.Rajeswari Ramaraj"};

            String[] flececfive = {"Digital Communication-Ms.T.J.Jeyaprabha", "Principles of Digital Signal Processing-Ms.L.Anju,Dr.G.A.Sathishkumar(T)", "Transmission Lines and Waveguides-Mr.S.Saravanan,Mr.P.Muthukumaran(T)", "Microprocessor and Microcontroller-Ms.S.M.Mehazabeen", "Environmental Science and Engineering-Mr.S.Diravia Balan","Medical Electronics-Mr.R.Nagaraj","Digital Signal Processing Lab-Ms.L.Anju, Mr.P.Arul,Mr.G.Loganathan,Mr.N.Kumaran", "Communication System Lab-Ms.T.J.Jeyaprabha,Ms.S.Radhika,Ms.C.Gomatheeswari Preethika", "Microprocessor and Microcontroller Lab-Mr.S.Saravanan,Mr.M.K.Varadarajan,Ms.S.Reethi/Dr.N.Kumaranathan", "Library-Mr.P.Muthukumaran"};

                String[] flececseven = {"RF and Microwave Engineering-Dr.H.Umma Habiba", "Optical Communication and Networks-Mr.S.SenthilRajan", "Embedded and Real Time Systems-Mr.N.Sathish", "Satellite Communication/Digital Image Processing(Elective-II)-Ms.K.Srividhya/Mr.S.P.Sivagnana Subramanian", "Advanced Computer Architecture(Elective-III)-Ms.A.Bharathipriya", "Advanced Microprocessors and Microcontrollers(Elective-IV)-Ms.S.KAlyani", "Embedded Lab-Mr.N.Sathish,Ms.A.Bharathipriya", "Optical and Microwave Lab-Ms.K.Srividhya,Mr.M.H.Mahood", "Library-Ms.S.Kalyani"};





    String[] flitaone = {"Communicative English-Ms.Anichamalar", "Mathematics-I-Dr.B.Saravanan", "Engineering Physics-I-Ms.G.Bharathy", "Engineering Chemistry-I-Dr.S.Ananda Babu", "Basic Electricals and Electronics Engineering-Ms.M.Maadhuri", "Programming for problem solving-Mr.V.M.Sivagami", "Engineering Practices Laboratory-Mr.T.Annamalai,Ms.M.Rajalakshmi,Ms.K.Suganthi,Mr.S.Kumaravel/M.M.K.Kalaimani/Mr.K.Ramprasad", "Physics/Chemistry Lab-Ms.G.Bharathy/Dr.S.Ananda Babu", "Programming for prolem solving lab-Ms.P.Leela Rani,Ms,S,Jerusha,Mr.E.Sakthivel,Mr.E.Sivakumar","Library-Ms.V.Saroja","Sports-Dr.C.Yaashuwanth,Mr.V.Ranjith,Mr.E.Sakthivel"};

        String[] flitathree = {"Mathematics III-Ms.Visalakshi Subramanian", "Programming and Data Structures II-MR.E.Sivakumar", "Operating Systems-Mr.T.Sukumar", "Computer Organization and Architecture-Mr.V.Ranjith", "Analog and Digital Communication-Mr.K.Suresh", "Environmental Science and Engineering-Mr.G.Arun", "Programming and Data Structures Lab II-Mr.E.Sivakumar,Mr.E.Sakthivel", "Operating Systems Lab-Mr.T.Sukumar,Dr.C.Yaashuwanth", "Analog and Digital Communication Lab-Mr.V.Rajaram,Mr.K.Suresh", "Library-Ms.Kiruba Wesley"};

            String[] flitafive = {"Computer Networks-Ms.P.Nirmala", "Graphics and Multimedia-Ms.A.Kala", "Object Oriented Analysis and Design-Mr.S.Uvaraj Arutkumaran", "Digital Signal Processing-Ms.K.S.Pavithra,Mr.S.S.Sethuraman(T)", "Web Programming-Ms.J.Sharon Ranjitha Esther", "Computational Intelligence-Ms.N.Uma,Ms.P.Sharon Femi(T)", "Networks Lab-Ms.P.Nirmala,Ms.R.Saktheeswari,Ms.C.Silambarasi", "Web Programming Lab-Ms.J.Sharon Ranjitha Esther,Ms.C.Silambarasi", "Case Tools Lab-Ms.S.Jerusha,Mr.S.Uvaraj Arutkumaran"};

                String[] flitaseven = {"Information Management-Dr.G.Sumathi", "Cryptography and Network Security-Mr.A.R.Guru Gokul", "Data Ware Housing and Data Mining-Dr.V.Vidhya", "Grid and Cloud Computing-Ms.G.Sangeetha", "Software Testing(E-II)-Ms.C.Silambarasi", "Data Mining Lab-Ms.G.Sangeetha,Ms.V.M.Megala,Ms.P.Sharon Femi,Ms.B.T.Shobana", "Security Lab-Mr.A.R.Guru Gokul,Ms.V.M.Megala", "Grid and Cloud Computing Lab-Ms.D.Jayanthi,Ms.G.Sangeetha,Ms.A.Indumathi", "Library-Mr.S.Uvaraj Arutkumaran", "Seminar-Ms.S.Jerusha,Ms.B.T.Shobana,Ms.A.Kala,MsKiruba Wesley,Ms.N.Devi"};





    String[] flitbone = {"Communicative English-Ms.S.B.Lavanya", "Mathematics-I-Dr.D.Valliammal", "Engineering Physics-I-Ms.S.Kalpana", "Engineering Chemistry-I-Dr.S.Ananthababu", "Basic Electricals and Electronics Engineering-Ms.S.Sinthamani", "Programming for problem solving-Mr.M.Rajvikram,MR.M.RanjithKumar,Mr.C.Gopinath,Ms.S.Arulmozhi,Mr.E.Suresh/Mr.V.Senthilvelan",  "Physics/Chemistry Lab-Ms.S.Kalpana,Dr.A.Bhaskaran/Dr.G.Baskar","Programming for problem solving lab-Ms.N.Devi,Ms.K.Kiruthika Devi,Mr.V.Ranjith,Mr.S.Uvaraj Arutkumaran", "Library-Ms.N.Devi","Sports-Ms.Sharon Ranjitha Esther,Ms.N.Devi,Ms.K.Kiruthika Devi"};

        String[] flitbthree = {"Mathematics III-Ms.K.Vijayalakshmi", "Programming and Data Structures II-Ms.B.T.Shobana", "Operating Systems-Ms.A.Rohini", "Computer Organization and Architecture-Dr.C.Yaashuwanth", "Analog and Digital Communication-Mr.V.Rajaram", "Environmental Science and Engineering-Dr.A.Bhaskaran", "Programming and Data Structures Lab II-Ms.A.Kala,Ms.B.T.Shobana", "Operating Systems Lab-Ms.A.Rohini, Ms.S.Kalavathi", "Analog and Digital Communication Lab-Mr.K.Suresh,Mr.V.Rajaram", "Library-Ms.K.Nivethashree"};

            String[] flitbfive = {"Computer Networks-Ms.R.Saktheeswari", "Graphics and Multimedia-Ms.S.Jerusha", "Object Oriented Analysis and Design-Ms.Kiruba Wesley", "Digital Signal Processing-Mr.S.S.Sethuraman,Ms.K.S.Pavithra(T)", "Web Programming-Ms.S.Kalavathi", "Computational Intelligence-Ms.P.Sharon Femi,Ms.N.Uma(T)", "Networks Lab-Ms.U.Pooranima,Ms.R.Saktheeswari,Ms.P.Nirmala,Ms.C.Silambarasi", "Web Programming Lab-Ms.S.Kalavathi,Ms.A.Rohini", "Case Tools Lab-Ms.Kiruba Wesley,Ms.A.Indumathi"};

                String[] flitbseven = {"Information Management-Mr.A.Indumathi", "Cryptography and Network Security-Ms.V.M.Sivagami", "Data Ware Housing and Data Mining-Mr.T.Sukumar", "Grid and Cloud Computing-Ms.D.Jayanthi", "Software Testing(E-II)-Ms.V.M.Megala", "Data Mining Lab-Ms.B.T.Shobana,Ms.P.Sharon Femi,Mr.T.Sukumar", "Security Lab-Ms.P.Nirmala,Ms.V.M.Sivagami", "Grid and Cloud Computing Lab-Ms.D.JAyanthi,Ms.A.Indumathi/Ms.G.Sangeetha", "Library-Ms.V.Saroja", "Seminar-Mr.T.Sukumar,Dr.C.Yaashuwanth,Ms.P.Leela Rani,Ms.B.T.Shoabana"};





    String[] flmechaone = {"Communicative English-Dr.Sam Dawson", "Mathematics-I-Ms.A.Suba", "Engineering Physics-I-K.Raju", "Engineering Chemistry-I-Dr.S.Sternly", "Basic Electricals and Electronics Engineering-Ms.M.Anushya", "Engineering Drawing-Dr.M.Premananth/Mr.G.Logachandar",  "Engineering Practices Laboratory-Mr.E.Suresh", "Physics/Chemistry Lab-Mr.J.Mohan Raj,Ms.S.Kalpana/Dr.S.Sternly", "Seminar 1,2- Mr.G.Suresh,Mr.E.Suresh","Sports-Dr.P.Raghu,Dr.M.Ganjendiran,Mr.G.Suresh"};

        String[] flmechathree = {"Mathematics III-Dr.R.Suresh", "Engineering Thermodynamics-Dr.K.Pithcandi/Mr.G.Suresh", "Manufacturing Technology I-Dr.S.Ramesh Babu", "Engineering Materials and Metallurgy-Dr.M.Mohandass", "Mechanics of Solids-Mr.M.Maheswaran/Dr.G.Saravanan", "Electrical Drives and Controls-Mr.S.Sudharasanam", "Manufacturing Technology Lab I-Dr.M.Ananthkumar(M&F)/Mr.S.Yeshwanth Raj(M&F)/Mr.G.Ganesan(W),Mr.K.Ramprasad(w)", "Strength of Materials Lab-Dr.M.Mohandass/Mr.G.Suresh", "Electrical Engineering Lab-Mr.S.Sudharasanam/Ms.D.Amudhavalli/Ms.N.Shanmugavadivu"};

            String[] flmechafive = {"Computer Aided Design-Mr.M.Arulkumar", "Heat and Mass Transfer-Mr.R.Kaliyanasunder/Dr.P.Raghu", "Design of Machine Elements-Dr.T.Raja/Dr.R.Ramesh", "Metrology and Measurements-Dr.M.Ananthkumar", "Dynamics of Machines-Mr.J.Sivaramapandian/Mr.C.Senthmaraikannan", "Professional Ethics in Engineering-Mr.S.Muniraj", "Dynamics Lab-Mr.Sivaramapandian/E.Suresh/Mr.M.Arulkumar", "Thermal Engineering Lab II-Mr.R.Kaliyanasunder/Mr.M.Gajendiran(Wed)/Mr.S.Arumugam(Mon)", "Metrology and Measurements Lab-Dr.S.Ponnuvel/Dr.V.Sridharan"};

                String[] flmechaseven = {"Power Plant Engineering-Mr.G.Suresh", "Mechatronics-Mr.M.Arul Kumar", "Computer Integrated Manufacturing System-Mr.S.Muniraj", "Total Quality Management-Mr.K.Ram Prasad", "Process Planning and Cost Estimation-Mr.V.Senthilvelan", "Welding Technology-Dr.M.Ananth Kumar", "Robotics-Dr.K.S.Badrinathan", "Maintenance Engineering-Mr.M.Nishal", "Simulation and Analysis Lab-Mr.M.Maheswaran(Mon)/Mr.M.Nishal(M)/Mr.R.Ganesan", "Mechatronics Lab-Mr.S.Gopinath/Mr.M.Arulkumar", "Comprehension-Mr.S.Natarajan/Mr.V.Senthilvelan", "Placement training-DR.KSB,Dr.MMD,MR.K.Ram,MR.MN(T1),Dr.NMK,Dr.MAK,Mr.MKM,Mr.MB(T2)", "Library-Mr.G.Suresh"};





    String[] flmechbone = {"Communicative English-Dr.Amutha C Sheela", "Mathematics-I-Dr.M.Radhakrishnan", "Engineering Physics-I-Ms.S.Kalpana", "Engineering Chemistry I-Dr.S.Sternly", "Basic Electricals and Electronics Engineering-Mr.R.Nagaraj", "Engineering Drawing-Mr.M.Nishal/Mr.M.Maheshwaran",  "Engineering Practices Laboratory-Mr.M.Nishal/Mr.V.Senthilvelan", "Physics/Chemistry Lab-Ms.S.Kalpana/Dr.S.Stanly","Library-Mr.M.Kalaimani,Mr.S.Yeshwant Raj","Sports-Mr.M.Maheshwaran,Mr.M.Kalaimani,Mr.S.Yeshwant Raj"};

        String[] flmechbthree = {"Mathematics III-Dr.R.Uma Devi", "Engineering Thermodynamics-Dr.S.Saravanan/Mr.S.Arumugam", "Manufacturing Technology I-Dr.N.Muthu Krishnan", "Engineering Materials and Metallurgy-Dr.V.Sridharan", "Mechanics of Solids-Mr.G.Saravanaram/Mr.M.Maheswaran", "Electrical Drives and Controls-Mr.M.Ranjith Kumar", "Manufacturing Technology Lab I-Dr.M.Ananth Kumar,Mr.M.Balakumar,Mr.G.Saravanaram,Mr.K.Ramprasad/Mr.S.Yeshwanth Raj", "Strength of Materials Lab-Mr.Muniraj/Mr.G.Logachandar", "Electrical Engineering Lab-Mr.M.Ranjith Kumar/Mr.D.S.Purushothaman/Mr.S.Sudharsanam"};

            String[] flmechbfive = {"Computer Aided Design-Mr.G.Kirubakaran", "Heat and Mass Transfer-Dr.P.Raghu/Mr.R.Kaliyanasundaram", "Design of Machine Elements-Dr.R.Ramesh/Dr.T.Raja", "Metrology and Measurements-Dr.S.Ilaiyavel", "Dynamics of Machines-Mr.C.Senthamarai Kannan/Mr.J.Sivaramapandian", "Principles of Management-Mr.M.Balakumar", "Dynamics Lab-Dr.C.Senthamarai KAnnan/Mr.E.Suresh", "Thermal Engineering Lab II-Dr.P.Raghu/Dr.M.Gajendran", "Metrology and Measurements Lab-Dr.S.Ilaiyavel/Mr.M.Kalaimani"};

                String[] flmechbseven = {"Power Plant Engineering-Mr.S.Natarajan", "Mechatronics-Mr.A.Kumaraswamy", "Computer Integrated Manufacturing System-Dr.S.Ponnuvel", "Total Quality Management-Mr.S.Gopinath", "Process Planning and Cost Estimation-Mr.S.Yeshwanthraj", "Welding Technology-Dr.M.Ananth Kumar", "Robotics-Dr.K.S.Badrinathan", "Maintenance Engineering-Mr.K.Karthee", "Simulation and Analysis Lab-Mr.G.Kirubakaran/Mr.G.Saravanan/Dr.T.Raja)", "Mechatronics Lab-Mr.A.Kumaraswamy/Mr.K.Karthee", "Comprehension-Dr.P.Raghu(Fri)/Mr.K.Karthee", "Placement training-DR.R.R,Dr.C.S.K,Dr.V.S,Mr.R.G(T3),Dr.T.R.,Dr.S.P,Mr.A.K.S,Mr.SYR(T4)", "Library-Mr.G.Suresh"};





    String[] flmarineone = {"Communicative English-Mr.P.Ganapathy", "Mathematics-I-Dr.R.Suresh", "Engineering Physics-I-Dr.S.Sampathkrishnan", "Engineering Chemistry I-Dr.S.Stanly Samuel", "Basic Electricals and Electronics Engineering-Dr.R.Gayathri", "Engineering Drawing-Mr.S.G.Karthik/Mr.V.Gurusamy",  "Engineering Practices Laboratory-Mr.S.G.KArthik/Mr.B.Srivathsan/Ms.S.Sinthamani/Ms.S.Anitha/Ms.K.S.PAvithra/Ms.M.Rajalakshmi", "Physics/Chemistry Lab-Dr.A.Bhaskaran/Dr.S.Stanly Samuel","Library-Mr.J.Arun Chakkravathy/Prof.T.R.Mohan,Dr.M.Anandan/Karnam Dileep","Seminar-Prof.K.V.Sivanarayanan/Mr.V.Gurusamy/Mr.B.Srivathsan/Mr.S.G.Gayathri"};

        String[] flmarinethird={"Mathematics-III-Ms.K.Vijayalakshmi","Marine Hydraulics and Fluid Machinery-Mr.G.Rameshkannan","Seamanship,Elementary Navigation and Survival at sea-Prof.S.Krishnan/Mr.R.Karthic Kumar","Marine Manufacturing Technology-Mr.V.Gurusamy","Marine Electrical Machines-I-Ms.S.Sinthamani","Marine Steam Engines-Dr.M.Anandan","Marine Machinery Drawing-Mr.J.Arun Chakkaravarthy/Mr.M.Karnam Dileep","Marine Hydraulics and Fluid Machinery Laboratory-Mr.G.Rameshkannan/Mr.S.G.Karthik","Welding Techniques,Lathe and Special M/C Shop-Mr.V.Karnam Dileep/Mr.V.Gurusamy","Library-Mr.J.Arun Chakravarthy"};

            String[] flmarinefive={"Marine Auxiliary Machinery-I-Prof.K.V.Sivanarayana","Marine Diesel Engine-Prof.T.R.Mohan","Ship construction-B.Srivathsan","Mechanics of Marine Machines-Mr.Karnam Dileep/Mr.J.Arun Xhakkravarthy(T)","Marine Electronics-Prof.S.Ganesh Vaidyanathan","Electricsal Engineering,Electronics and Microprocessor Laboratory-Mr.S.Sinthamani,Mr.S.Kumaravel/Ms.D.Menaka,Ms.T.Jeyaprabha","Measurement,Instrumentation & Refrigeration Laboratory-Mr.J.Arun Chakkaravarthy/G.Rameshkannan","Marine Propulsion and Auxiliary Machineries Overhauling lab-Prof.T.R.Mohan/Mr.R.Karthic Kumar","Library-Mr.Karnam Dileep/Mr.B.Srivathsan/Mr.S.G.Karthik"};

                String[] flmarineseven={"Marine System and Machinery Design-Mr.R.Karthic Kumar","Marine Electrical Technology-Mr.S.Kumaravel","Marine Vehicles Performance-Mr.B.Srivathsan","Marine Auxiliary Machinery-II-Prof.K.V.Sivanarayana","Ship's Fire Prevention and Control-Prof.T.R.Mohan","Advanced Marine Heat Engines-Dr.M.Anandan","Fire Fighting,Controls and Simulator Laboratory-Prof.S.Krishnan","Marine Propulsion and Auxiliary Machineries Overhaauling Laboratory-Prof.K.V.Sivanarayana/Mr.R.Karthic Kumar","Communication and Soft Skills Laboratory based-Mr.P.Ganapathy","Library-Mr.G.Rameshkannan/Mr.V.Gurusamy","Training Assessment Record-Mr.M.Anandan"};


    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttperiod);
        Bundle extras = getIntent().getExtras();
        x = extras.getInt("year");
        y = extras.getInt("sem");
        z = extras.getInt("sel");

        t = extras.getInt("sec");
        d = extras.getInt("day");
        listView = (ListView) findViewById(R.id.period);


        listView.setAdapter(new ArrayAdapter<String>(teacherlist.this, android.R.layout.simple_list_item_1, new ArrayList<String>()));

        if (x!= 0) {


            switch (z) // getting the valuefor depatrmnt
            {
                case 1:// automobile
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflautotwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflautofour().execute();
                                        break;
                                    case 6:
                                        new Asyncflautosix().execute();
                                        break;
                                    case 8:
                                        new Asyncflautoeight().execute();
                                        break;


                                }

                            } else {

                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflautoone().execute();
                                        break;
                                    case 3:
                                        new Asyncflautothree().execute();
                                        break;
                                    case 5:
                                        new Asyncflautofive().execute();
                                        break;
                                    case 7:
                                        new Asyncflautoseven().execute();
                                        break;


                                }

                            }
                        }
                        break;
                    }
                }
                break;

                case 2: // biotech
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflbiotechtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflbiotechfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflbiotechsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflbiotecheight().execute();
                                        break;


                                }
                            } else {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflbiotechone().execute();
                                        break;
                                    case 3:
                                        new Asyncflbiotechthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflbiotechfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflbiotechseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                    }

                    break;
                }

                case 3: // chemical
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflchematwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflchemafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflchemasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflchemaeight().execute();
                                        break;

                                }


                            } else {

                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();

                                switch (y) {
                                    case 1:
                                        new Asyncflchemaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflchemathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflchemafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflchemaseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflchembtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflchembfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflchembsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflchembeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflchembone().execute();
                                        break;
                                    case 3:
                                        new Asyncflchembthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflchembfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflchembseven().execute();
                                        break;


                                }


                            }

                        }
                        break;
                    }

                    break;
                }
                case 4: // civil
                {

                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflciviltwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcivilfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcivilsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcivileight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflcivilone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcivilthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcivilfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcivilseven().execute();
                                        break;


                                }


                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: //eee
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleeeatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleeeafour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleeeasix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleeeaeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleeeaone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleeeathree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleeeafive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleeeaseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleeebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleeebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleeebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleeebeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleeebone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleeebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleeebfive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleeebseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                    }
                    break;

                }
                case 6: // it
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflitatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflitafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflitasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflitaeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflitaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflitathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflitafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflitaseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available yet", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflitbtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflitbfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflitbsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflitbeight().execute();
                                        break;

                                }

                            } else {


                                switch (y) {
                                    case 1:
                                        new Asyncflitbone().execute();
                                        break;
                                    case 3:
                                        new Asyncflitbthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflitbfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflitbseven().execute();
                                        break;


                                }

                            }
                            break;
                        }

                    }
                    break;
                }
                case 7://ece
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //  Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncfleceatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncfleceafour().execute();
                                        break;
                                    case 6:
                                        new Asyncfleceasix().execute();
                                        break;
                                    case 8:
                                        new Asyncfleceaeight().execute();
                                        break;

                                }


                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncfleceaone().execute();
                                        break;
                                    case 3:
                                        new Asyncfleceathree().execute();
                                        break;
                                    case 5:
                                        new Asyncfleceafive().execute();
                                        break;
                                    case 7:
                                        new Asyncfleceaseven().execute();
                                        break;


                                }
                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {

                                // Toast.makeText(facultyadv.this, "Teacher list not available ", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflecebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflecebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflecebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflecebeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflecebone().execute();
                                        break;
                                    case 3:
                                        new Asyncflecebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflecebfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflecebseven().execute();
                                        break;


                                }

                            }
                            break;
                        }
                        case 3: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflecectwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflececfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflececsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflececeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflececone().execute();
                                        break;
                                    case 3:
                                        new Asyncflececthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflececfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflececseven().execute();
                                        break;

                                }

                            }
                            break;

                        }

                    }
                    break;
                }
                case 8: // cse
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcseatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcseafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcseasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcseaeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflcseaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcseathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcseafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcseaseven().execute();
                                        break;

                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcsebtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcsebfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcsebsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcsebeight().execute();
                                        break;

                                }


                            } else {
                                switch (y) {
                                    case 1:
                                        new Asyncflcsebone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcsebthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflbiotechfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflbiotechseven().execute();
                                        break;

                                }


                            }
                            break;
                        }
                        case 3: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflcsectwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflcsecfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflcsecsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflcseceight().execute();
                                        break;

                                }

                            } else {
                                switch (y) {
                                    case 1:
                                        new Asyncflcsecone().execute();
                                        break;
                                    case 3:
                                        new Asyncflcsecthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflcsecfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflcsecseven().execute();
                                        break;

                                }


                            }
                            break;

                        }

                    }
                    break;

                }
                case 9:  // mech
                {
                    switch (t)       // selecting the respective section
                    {

                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmechatwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmechafour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmechasix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmechaeight().execute();
                                        break;

                                }
                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflmechaone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmechathree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmechafive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmechaseven().execute();
                                        break;
                                }


                            }
                            break;
                        }

                        case 2: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                //Toast.makeText(facultyadv.this, "Teacher list Not yet given", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmechbtwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmechbfour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmechbsix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmechbeight().execute();
                                        break;

                                }

                            } else {

                                switch (y) {
                                    case 1:
                                        new Asyncflmechbone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmechbthree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmechbfive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmechbseven().execute();
                                        break;
                                }


                            }
                            break;
                        }

                    }
                    break;

                }
                case 10: // marine
                {
                    switch (t) {
                        case 1: {
                            if (y % 2 == 0) // calling the even semester
                            {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 2:
                                        new Asyncflmarinetwo().execute();
                                        break;
                                    case 4:
                                        new Asyncflmarinefour().execute();
                                        break;
                                    case 6:
                                        new Asyncflmarinesix().execute();
                                        break;
                                    case 8:
                                        new Asyncflmarineeight().execute();
                                        break;


                                }
                            } else {
                                // Toast.makeText(facultyadv.this, "Teacher list not available", Toast.LENGTH_LONG).show();
                                switch (y) {
                                    case 1:
                                        new Asyncflmarineone().execute();
                                        break;
                                    case 3:
                                        new Asyncflmarinethree().execute();
                                        break;
                                    case 5:
                                        new Asyncflmarinefive().execute();
                                        break;
                                    case 7:
                                        new Asyncflmarineseven().execute();
                                        break;


                                }


                            }
                            break;
                        }

                    }

                    break;
                }
            }

        }
    }

    //marine

    public class Asyncflmarineone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarineone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarinethree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinethird) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarinefive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinefive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarineseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarineseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


  //marine even semesters
  public class Asyncflmarinetwo extends AsyncTask<Void, String, String> {

      ArrayAdapter<String> arrayAdapter;
      ProgressBar progressBar;
      int count;

      @Override
      protected void onPreExecute() {
          super.onPreExecute();

          arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
          progressBar = (ProgressBar) findViewById(R.id.progressBart);
          progressBar.setMax(10);
          progressBar.setProgress(0);
          progressBar.setVisibility(View.VISIBLE);
          count = 0;

      }

      @Override
      protected String doInBackground(Void... voids) {

          for (String value : flmarinetwo) {
              publishProgress(value);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
          return "Added successfully";
      }

      @Override
      protected void onProgressUpdate(String... values) {
          super.onProgressUpdate(values);

          arrayAdapter.add(values[0]);
          count++;
          progressBar.setProgress(count);
      }

      @Override
      protected void onPostExecute(String s) {
          super.onPostExecute(s);

          progressBar.setVisibility(View.INVISIBLE);
      }
  }

    public class Asyncflmarinefour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinefour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarinesix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarinesix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmarineeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmarineeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }











    public class Asyncflautoone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbone extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbone) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflautotwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautotwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflchematwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchematwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflciviltwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flciviltwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsectwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsectwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecectwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecectwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechatwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechatwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbtwo extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbtwo) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


    public class Asyncflautofour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautofour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechafour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechafour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbfour extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbfour) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautosix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautosix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechasix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechasix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbsix extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbsix) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautoeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotecheight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotecheight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivileight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivileight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseceight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseceight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbeight extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbeight) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    //odd sem asynctask

    public class Asyncflautothree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautothree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechathree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechathree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbthree extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbthree) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautofive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautofive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechafive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechafive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbfive extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbfive) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflautoseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flautoseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflbiotechseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flbiotechseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchemaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchemaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflchembseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flchembseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcivilseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcivilseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcseaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcseaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflcsecseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flcsecseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleceaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleceaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflecebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flecebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflececseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flececseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeeaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeeaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncfleeebseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : fleeebseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflitbseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flitbseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechaseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechaseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    public class Asyncflmechbseven extends AsyncTask<Void, String, String> {

        ArrayAdapter<String> arrayAdapter;
        ProgressBar progressBar;
        int count;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            arrayAdapter = (ArrayAdapter<String>) listView.getAdapter();
            progressBar = (ProgressBar) findViewById(R.id.progressBart);
            progressBar.setMax(10);
            progressBar.setProgress(0);
            progressBar.setVisibility(View.VISIBLE);
            count = 0;

        }

        @Override
        protected String doInBackground(Void... voids) {

            for (String value : flmechbseven) {
                publishProgress(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "Added successfully";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);

            arrayAdapter.add(values[0]);
            count++;
            progressBar.setProgress(count);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            progressBar.setVisibility(View.INVISIBLE);
        }
    }


}










