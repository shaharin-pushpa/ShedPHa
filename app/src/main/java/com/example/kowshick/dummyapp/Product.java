package com.example.kowshick.dummyapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
    private int productImage;
    private String type;
    private String productName;
    private String genericName;
    private String declaration;
    private String indication;
    private String doses;
    private String preparation;
    private String price;
    private String otherDetails;

    public Product() {
    }

    public Product(int productImage, String type, String productName, String genericName, String declaration, String indication, String doses, String preparation, String price, String otherDetails) {
        this.productImage = productImage;
        this.type = type;
        this.productName = productName;
        this.genericName = genericName;
        this.declaration = declaration;
        this.indication = indication;
        this.doses = doses;
        this.preparation = preparation;
        this.price = price;
        this.otherDetails = otherDetails;
    }

    public int getProductImage() {
        return productImage;
    }

    public String getType() {
        return type;
    }

    public String getProductName() {
        return productName;
    }

    public String getGenericName() {
        return genericName;
    }

    public String getDeclaration() {
        return declaration;
    }

    public String getIndication() {
        return indication;
    }

    public String getDoses() {
        return doses;
    }

    public String getPreparation() {
        return preparation;
    }

    public String getPrice() {
        return price;
    }

    public String getOtherDetails() {
        return otherDetails;
    }
    public List<Product> generateProductList(){
        List<Product>products = new ArrayList<>();
        products.add(new Product(R.drawable.ajocin,"Capsule","Ajocin® 500mg","Swaskaschintamoni",
        "Anti Asthmatic, Bronchial and Cardiac Asthma Ayurvedic Medicine",
        "Asthma, Bronchial Asthma, Cardiac Asthma, Catarrh, All types of cough, Tonsillitis, Headache and sore throat.",
        "One capsule two times in a day.","2X15 PVC Blister Strip, 1X50 PVC Blister Strip","300.00Tk 350.00Tk Tk.",
        "Ajocin is an Ayurvedic medicine in 500mg capsule form, used in the treatment of respiratory diseases. This medicine contains heavy metal ingredientsIt is used in the treatment of cold, cough, bronchitis, asthma and respiratory disorder."));

        products.add(new Product(R.drawable.diabacure,"Capsule","Diabacure®","Vasant kusumakar Ras","Effective in diabetes and metabolic disorder.",
        "Diabetes, Diabetes complications, Diseases of Heart and blood vessels coronary heart diseases, Neuropathy, Erectile dysfunction, Diabetes carbuncles, Memory Loss, Insomnia, Nocturnal, Geriatric disorders and Hemophilia",
                "1 capsule 1-3 times in a day or as directed by the physician advice. Diabacure is not indicated in pregnancy and lactation.",
                "1X30 Capsule Pot","210.00Tk Tk.","Diabacure is an Ayurvedic medicine in capsule from, used in treatment of diabetes diseases related to urinary tract, memory loss etc. This medicine contains heavy metal ingredients, hence should only be taken under strict medical supervision."));
        products.add(new Product(R.drawable.eman,"Capsule","E-Man®","Brihot Purnochandra Ras","Natural Sex Stimuler, Vigor tic",
                "Sexual Power increases, Stimulatant, Aphordisiac, Premature ejaculation, Nerve disorder diseases, Immunity booster, Memory freshener.",
                "1 Capsule 1-3 times in a day or as directed by the physician. It is advised along with betel leas juice.",
                "2X10 PVC Blister Strip","800.00Tk Tk.","E-Man is a unique natural aphrodisiac capsule for any age of limit. It is sexually harmless Ayurvedic product. It has been developed by valuable herbs which is special Rasayan."));
        products.add(new Product(R.drawable.eldorex,"Capsule","Eldorex®","Kamini Vindravan Ras","Sexual tonic, Masculine tonic for optimum duration of coitus.",
                "Premature ejaculation, Sexual disorder, Viscosity of semen, Increases size the penis tissue, Nervier tonic, Sexual tonic, Produce of semen",
                "1 Capsule in a day 1-2 times or as a directed by the physician advised.","3X4 Alu Alu Pack","432.00Tk Tk.",
                "Unique formulation of Eldorex with the combination of effective nerving tonic, cephalic tonic, cardio tonic, hepatic tonic and sexual tonic. Eldorex promotes vitality and strength."));
        products.add(new Product(R.drawable.fullvita,"Capsule","Full-vita®","Saraswata Churna","Brain Health and Memory Builders","","","2X15 PVC Blister Strip",
                "345.00Tk Tk.",""));
        products.add(new Product(R.drawable.gprazol,"Capsule","G-PRAZOL®","Abipottikar churno","Ayurvedic Antacid, Antacid-Appetizer-Antilithiatic-Mild diuretic, Natural Antiulcerant",
                "Acidity, Chronic Gastritis, GERD, Constipation, Heart burn, Indigestion, Urinary problems, Nephritis, Difficulty in Micturation, Nephritic syndrome, Upset stomach due to hyperacidity.",
                "1 capsule 2-3 times in a day before meal with normal water or as directed by the physician.","15X4 PVC Blister Strip ,6X10 Alu Alu pack",
                "300.00Tk 300.00Tk Tk.",
                "G-PRAZOL is an ayurvedic medicine in capsule form, which is used for hyper-acidity, gastritis, burning ache due to excess acid, loss of appetite and indigestion linked with gastritis, piles, urinary problems, difficulty in maturation." +
                        "G-PRAZOL relieves acid indigestion and acid re-flux, neutralizes excess acids in the stomach and intestines, protect the stomach living as well as help maintain healthy digestion helps to relieve constipation and difficulty in urination."));
        products.add(new Product(R.drawable.hipick,"Capsule","Hipick®","Jouban Satadal","Natural sex stimuler, Inspiring passion –puts you in the mood for love (Ayurvedic Capsule)",
                "Erectile dysfunction, Loss of libido, Sexual disorder, Sperm count Increase, Increase vigor and rituality, Impotency, Sexual debility, Early ejaculation and Physical & nervous weakness.",
                "1 capsule, 1-2 times in a day or as directed by the physician advice.","1X10 PVC Blister Strip\n" +
                "1X20 PVC Blister Strip\n" +
                "3X4 Alu Alu Pack",
                "300.00Tk 600.00Tk 480.00Tk Tk.","Vigor and vitality stimulant by supplying adequate blood and nutrition to the penile tissue Hipick Capsule prevents erectile dysfunction, loss of libido and sexual disability. It solves physical and mental problems thus relieve psychosomatic impotence.\n" +
                "\n" +
                "Hipick Capsule affects the mind, causing relaxation, releasing in habitations or inspiring passion. It endows the user with stamina, allowing longer love making session. Hipick Capsule restores vigor, vitality and stamina and Improvement male libido, infertility and impotence.\n"));
        products.add(new Product(R.drawable.asmonil,"Liquid","Asmonil®","Draksharista","Natural Bronchodilator, Mucolytic Expectorant and antitussive Natural restore for respiratory tract","Cardiac Arrhythmia, High and low Blood pressure, Myocardial Infarction, Stable Angina Pectoris, Congestive Heart failure, Mitral regurgitation, Lung disorder.",
                "Chidren: 1-2 Teaspoonful with equal amount of water. Adults: 2-4 Teaspoonfuls with equal amount of water. Old age: 4 Teaspoonful.",
                "200ml Pet Bottle Syrup\n" +
                        "450ml Pet Bottle Syrup", "80.00 Tk 160.00Tk Tk.","Cardiosolve is a potent Ayurvedic medicine commonly used as a heart tonic. It is a liquid in medication that can help in the treatment and prevention of several cardiac diseases. Is an excellent adjustment in the management of chronic cardiac and lung diseases. It corrects functioning of heart by enhancing the action of heart muscles. It is also useful for hypertension.\n"));
        products.add(new Product(R.drawable.cardiosolve,"Liquid","Cardiosolve®","Arjunarisnta","Heart tonic and lung seducer.",
                "Cardiac Arrhythmia, High and low Blood pressure, Myocardial Infarction, Stable Angina Pectoris, Congestive Heart failure, Mitral regurgitation, Lung disorder.",
                "Chidren: 1-2 Teaspoonful with equal amount of water. Adults: 2-4 Teaspoonfuls with equal amount of water. Old age: 4 Teaspoonful.",
                "200ml Pet Bottle Syrup\n" +
                        "450ml Pet Bottle Syrup","80.00 Tk 160.00Tk Tk.",
                "Cardiosolve is a potent Ayurvedic medicine commonly used as a heart tonic. It is a liquid in medication that can help in the treatment and prevention of several cardiac diseases. Is an excellent adjustment in the management of chronic cardiac and lung diseases. It corrects functioning of heart by enhancing the action of heart muscles. It is also useful for hypertension"));
        products.add(new Product(R.drawable.gb,"Tablet","GB®","Amla Pittantak Ras","Natural antiulcerant, Effective remedy for digestive dysfunction (Ayurvedic Tablet)",
                "Hyperacidity, Colic, Loss of appetite, Liver problem, Nausea, Heart burn, ulceration time, Abdominal pain, Constipation, Constipation, Dyspepsia",
                "1 tablet two times a day or as directed by the physician advice.","3x10 PVC Blister Strip","150.00Tk Tk.",
                "GB is an ayurvedic medicine prepared with the valuable natural ingredients, which is highly effective in heart burn, flatulence, abdominal pain due to gases dyspepsia and constipation. It discharges the excessive gas from stomach and bowels and improves the acidity of digestive system.\n"));
        products.add(new Product(R.drawable.honeycon,"Tablet","Honeycon®","Ratibilash","Male stamina and Increases sexual desire, Natural Aphrodisiac.",
                "Sexual weakness, Premature Ejaculation over a long period of time, Improve sperm quality, Stimulate CNS, Satisfy to sexual intercourse."
                ,"1 Tablet 1-2 timer in a day or as directed by the prescriber.","2X5 Blister Pack\n" +
                "10X10 Blister Pack","400.00Tk 4000.00Tk Tk.","This medicine contains rejuvenating and revitalizing ingredients which can improve erection strength and enhance overall sexual performance. If you feel that your penis length is hot adequate while working on an under develop penis, the ingredients of this package improve blood circulation to the grain increasing the size of male organ and the testosterone production as well.\n" +
                "Honeycon increases spermatogenesis and act as an aphrodisiac. It improves the nervous system, lowering stress level and improving overall functioning of the autonomic nervous system for better sexual performance. Honeycon naturally enhance sperm production. It can also help a man last longer in bed, enabling him to provide pleasure to his partner and increases sexual desires."));
        products.add(new Product(R.drawable.menstro,"Capsule","MENSTRO®","Pradarari Ras","Ayurvedic Capsule, Solution for Leucorrhoea and Menstrual disorder",
                "Leucorrhoea, Weakness of uterus, Menstrual irregularity, Dysmenorrheal, Uterine inflammation, Antibacterial, Antifungal.",
                "1-2 Capsule 2-3 times daily meal or as directed by the physician.","4X3 Alu Alu Pack","240.00 Tk.","Menstro is an Ayurvedic medicine in capsule form. It is a unique combination of valuable natural ingredients. It acts as an astringent, anti-inflammatory and emmenagogue. Menstro tones up and restores the normal functions of uterus. Prevent urinary discharge particularly useful of watery discharge from vagina." +
                " It is also very effective in leucorrhoea and menstrual irregularity."));
        products.add(new Product(R.drawable.painol,"Capsule","Painol®","Brihatvat Gajangkush",
                "Ayurvedic pain Reliever Capsule give a natural treatment","Osteoarthritis, Rheumatoid Arthritis, Gout, Muscular pain, Spondylitis, Sciatica, Joint pain, Stiffness of joints, Paralysis, Spinal Pain.",
                "Capsule daily 1-2 times after meal or as directed by the physician.","6X10 PVC Blister Strip","300.00 Tk.",
                "Painol is herbomineral Auyervedic medicine. It also gives effective treatment of neuro-muscular diseases. It also gives effective treatment in sciatica, paralysis, spondyltis, athritis and torti collis. Painol enriched with heavy metal ingredients which has anti inflammatory, carminative, anti-flatulent properties.\n" +
                        "Painol Relives from pain in the back, buttocks pain, pain of hip, muscles pain, thigh pain, lower extremities pain and multi types chronic pain. It is helpful for muscle weakness and controls leg numbness. It is useful for difficulty raising the foot and paralysis of muscle. Pinol treats spinal cord and useful for treatment of physical deformity."));
        products.add(new Product(R.drawable.quine,"Capsule","Quin-E® 500mg","Satabori","Female Sex pill, Reproductive tonic, Female Aphrodisiac",
                "Low sexual desire, Sexual disorder, vaginal dryness, Hormonal balance, Painful intercourse, Ovum cysts, Vagainitis, Gastritis, Hyperacidity, Dyspepsia, Breast milk production.",
                "1-2 capsules 2 times a day or directed by the physician.","2X5 PVC Blister Strip\n" +
                "10X10 PVC Blister Strip","400.00Tk 4000.00 Tk.","Quin-E is used as general tonic for the nervous, hormonal and reproductive systems at has an ancient reputation as an aphrodisiac. It enhance sexual desire reduce vaginal dryness and ever blood pressure allowing for the relaxation necessary for improved organs us."));

        products.add(new Product(R.drawable.spiru,"Capsule","Spiru","SPIRU","Foods such as Spirulina, blue-green algae, formulated supplementary sports foods, formulated supplementary foods, artificial sweeteners and sugar cubes do not meet the legal definition of therapeutic and do not make claims that listed medicines or registered therapeutic goods are permitted to do.",
                "Leukoplakia","1 g PO qD x12 days","3X10 PVC Blister Strip","315.00 Tk.",
                "Spirulina is a natural blue green 'algae' (cyanobacteria). It is worldwide popular as a high quality food with nutrient. The United Nation World Food Organization declared SPIRILINA as 'the food for tomorrow'. MCRS Madrase has declared it as 'the wonder gift of nature' and Japanese Chemical Company (DIC) has declared it as 'the Miracle Food of 20th Century'."));

        products.add(new Product(R.drawable.cinvita,"Liquid","Cinvita®","Bolarishta","Natural revitalizer, Energetic and Nervine tonic.",
                "Loss of appetite, Vita disorders, General Weakness, Neural debility, Paralysis, Hemispheric, Paraplegia, Facial paralysis, Rheumatoid arthritis, Erectile dysfunction.",
                "Children- 2.5 ml to 10 ml, Adults- 10 ml to 30 ml. twice a day with equal amount of water. Immediately after Breakfast and dinner is the best time to take.",
                "200ml PET Bottle Syrup\n" +
                        "450ml PET Bottle Syrup","80.00 Tk 150.00 Tk.","Cinvita is an Ayurvedic medicine categorized under Arishta category and syrup form, which is used for diseases occurring due to vita aggravation or excess vita in the body, vita disorders are mostly related to nervous system and musculature system. So, the main actions of the cinvita are observable on the brain, nerves, muscles, ligaments, bones and joints. Cinvita is a good therapeutic measure for paralysis, arthritic disorders and spinal disorders. It helps to manage the cervical dispositions, frozen shoulder, low backache and knee pain.\n"));

        products.add(new Product(R.drawable.darmatis,"Liquid","Darmatis®","Sarribaddorishta","Ayurvedic blood Purifier",
                "Fungal infections, Skin diseases (all types), Psoriasis, Acne, Eczema, Burning sensation, Urinary disorder, Blood cell provider, Dermatitis, Purities scabies.",
                "2-4 teaspoonful 2-3 times daily after meal or as directed by the prescriber.","200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup","90.00 Tk 180.00 Tk.","Darmatis is poly herbal Ayurvedic Liquid. It is dark brows fermented liquid preparation, astringent in taste and has blood purifying properly. It treats skin diseases and helps burning sensation. Darmatis cures carbuncle, syphilis and balanced the blood disorders. It helps digestive impairment."));

        products.add(new Product(R.drawable.diactiv,"Liquid","Diactiv®","Mustakarishta","Natural digestive Enzyme, Anti-dysentery and Anti-spasmodic Syrup",
                "Dyspepsia, GERD, diarrhea, Flatulence, Indigestion, Chronic dysentery, Gastritis, Hyperacidity, Low digestion strength, gastro enteritis, vomiting with diarrhea, Mal absorption, IBS, Constipation, Relieves bloating.",
                "Adults: 2-4 teaspoonful 2-3 times a day. Children: 1-2 teaspoonful 2-3 times a day or as directed by the prescriber advice.",
                "200ml Pet Bottle Syrup\n" +
                        "450ml Pet Bottle Syrup","80.00 Tk 150.00 Tk.","Diactiv is a special Ayurvedic formulation of time tested natural ingredients that helps to control flatulence, dyspepsia and indigestion. It helps in toning up to mucous of the stomach and brings about a well tolerated balance between liver functions and gastric activities. Diactiv is a safe and effective remedy for everyday stomach discomfort for the endive family. \n" +
                "Diactiv helps support body’s own digestive capabilities. It supports proper digestion, which is crucial for rebuilding and regenerating the body. Diactiv stimulates bile flow and gastric juices which play a critical role in cleaning, repairing the digestive organs and helps body digestive power heat. "));
        products.add(new Product(R.drawable.dilucid,"Liquid","Dilucid®","Amalaki Rasayan","Vitamin C supplement, Natural Antacid and antioxidant (Ayurvedic Syrup)",
                "Gastritis, Anemia, Hyperacidity, Bowel movements, Eye disorder, Ulceration, Scurvy, Dyspepsia, Heart burn, Premature aging, Skin diseases, Constipation, Heart and lungs diseases.",
                "Child under 12 years: ½ teaspoonful two times a daily. Adult: 1-2 teaspoonfuls 2-3 times a day.","200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup","120.00Tk 350.00 Tk.","Dilucid enriched with amla extract. Amla extract is naturally extracted using only the finest quality fruits grown in our country this amlaki extract provides active levels of tennis along with vita Vitamin C and flavoring. Concentrated in the balance ratio nature intended, without isolating, fictionalizing or using toxic solvents, Amla fruit is famous for its rejuvenating properties. It is known for its nutrient dense levels of Vitamin C.\n" +
                "It is strong rejuvenate helps balance stomach acid and improves food absorption. It has antioxidant properties and helps prevent premature aging. It Promotes the health of lungs and respiratory function and supports brain functions. It maintains reproductive health, strengthens immune system. It has detoxifies and cleansing action and acts as a coolant."));

        products.add(new Product(R.drawable.eboost,"Liquid","E-Boost®","Dasamularista","Multivitamin & Multi Mineral",
                "Lactating Mother, Pregnancy, Nervous weakness and irritability, Low memory, Impotency, Tonic, Allergic reactions, Urinary Tract infection and Rheumatoid arthritis.",
                "2-3 teaspoons full daily after meal or as directed by the physician.","100ml Pet Bottle Syrup\n" +
                "200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup","95.00 Tk 180.00Tk 350.00 Tk.","E-Boost is an Ayurvedic preparation it contains unique mixture of medicinal herbs that have been proved to exhibit pharmacological action that can fight against aging can improve milk production and milk flow in locating mothers as well as improve total health conditions of both men and women.\n" +
                "There is a super combination of most effective natural herbs in E- Boost. This formula is particularly made up of  Dashomula and efficient purely natural herbs without any chemicals."));

        products.add(new Product(R.drawable.emini,"Liquid","Emini®","Patrangasava","Ayurvedic uterine power Syrup",
                "Irregular Menstruation, Dysfunctional uterine bleeding, Menorrhagia, Amenorrhea, vaginal discharge, vaginal dryness, Menstrual pain, Heavy periods.",
                "2-4 teaspoonful 2-3 times in a day after meal for adult. 1-2 teaspoonful 2-3 times for pre adult or as directed by the prescriber.",
                "200ml Pet Bottle Syrup\n" +
                        "450ml Pet Bottle Syrup","120.00Tk 210.00 Tk.","Emini is an Ayurvedic medicine used mainly in gynecological conditions such as heavy menstrual bleeding, leucorrhea, fever etc.\n" +
                "\n" +
                "Emini maintains proper female hormone balance and is useful for any menstrual problems. It tones up generative organs and promotes regular menstruation. Emini restores of vaginal secretions and decreasing the chance of infections. It is treated to white discharge.  "));

        products.add(new Product(R.drawable.fivokol,"Liquid","Fivokol®","Amritarista","Naturally remedy for fever and headache.",
                "Typhoid fever, Malaria, Chronic Fever, Splenomegaly, Hepatomegaly, Jaundice, Hepatitis, Anemia.","2-4 teaspoonfuls 3 times daily for adult. Children: ½ -1 teaspoonful 3 times daily after meal or as prescribed by the physician. Shake well before use.",
                "200ml Amber glass Bottle\n" +
                        "450ml Amber glass Bottle","70.00 Tk 140.00 Tk.","Fivokol syrup prepared with moon creeper (Tinospora cordifolia), Black nightshade (Solarinum indicum), and other valuable natural medicinal ingredients. It is effective in acute and chronic fever, excessive thirst and also treatment of the enlargement of liver and spleen. It helps to relieve burning urination, urinary tract infection and oliguria."));

        products.add(new Product(R.drawable.galacto,"Liquid","Galacto®","Aswangandharisata","General tonic, Natural Appetizerable",
                "Appetizer, Anti aging, Sexual debility, Fatigue, Anorexia, General debility, Loss of memory, Immunodeficiency, Insomnia, Nervous debility, Anemia.",
                "Adult: 2-4 teaspoonful 2-3 times a day. Child: 1-2 teaspoonful 2-3 times a day. or av","200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup","180.00Tk 350.00 Tk.","Galacto is a unique anti aging, adaptogenic and herbal tonic, Galacto contains Aswagandha which is famous for antioxidant and anti-aging properties. It acts as an adaptogen and immune stimulant. Galacto improves physical and mental strength, enhance vitality power and increases the production of essential enzymes and hormones. Galacto provides extra energy, makes the body strong, active and energetic."));

        products.add(new Product(R.drawable.giovita,"Liquid","Gio-vita®","Aswagandhadi kawth","Natural Vitamin supplement, Body builder",
                "General weakness, Underweight/Malnutrition, Fatigue, Insomnia, Depression, stress, Anxiety, Neurological disorders, Loss of memory, Loss of libido, Male, female infertility, Osteoarthritis.",
                "Adult: 2-4 teaspoonful 2-3 times a day. Child: 1-2 teaspoonful 2-3 times a day. or av","100ml Pet Bottle Syrup\n" +
                "200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup"," 95.00 Tk 180.00Tk 350.00 Tk.","Giovita is an amazing combination of rejuvenating energized and vitamin-zed medicinal plants. It relieves malnutrition, strengthens the nervous and muscles. Giovita strengthens the vital organs, prevents general debility, mental debility and anorexia and help to increase body weight. Giovita is Aswagandha based ayurvedic liquid prepared used in a variety of aliment and general debility. It is also a health tonic, which helps restoring strength after a long standing disease and improves overall health."));

        products.add(new Product(R.drawable.livovita,"Liquid","Livovit®","Rohitakarista","Hepatoprotective, Effective in enlarged liver and spleen (Ayrvedic Liver tonic)",
                "Hepatitis, Ascitis, Piles, Enlargement of liver and spleen, Jaundice, Anorexia, colitis, Edema, Blood purity, Heart disease.",
                "Adults: 2-4 teaspoonful 2-3 times a daily & Child: 1/2-1 teaspoonful 2-3 times a daily after meal with normal water.",
                "200ml Pet Bottle Syrup\n" +
                        "450ml Pet Bottle Syrup","90.00 Tk 180.00 Tk.","Livovit is a poly herbal Ayurvedic medicine. It is a unique hepato-protective Ayurvedic medicine. It is used to treat many diseases specially enlargement of liver and spleen. This medicine also improves conditions of heart and blood. The main ingredient of this medicine is stem bark of tree Rohitak. Livovit prepared with Rohitak, zinger, clove and others valuable natural ingredients. It helps to promote bile flow and improve digestion."));

        products.add(new Product(R.drawable.shedovas,"Liquid","Shedovas®","Vasakarista","Ayurvedic cough syrup, Alternative expectorant tonic",
                "Liquefies phlegm, corrects all types of cough, Persistent cough, Bronchial asthma, Bronchitis, allergic action, smoker cough, respiratory distress.",
                "Children under 12 years: 1-2 teaspoonful 3 times a day and adult 3 teaspoonful 2-3 times a day. In acute cough warm water can be added for better result or as directed by the prescriber.",
                "100ml Pet Bottle Syrup\n" +
                        "200ml Pet Bottle Syrup","60.00 Tk 110.00 Tk.","Shedovas (Ayurvedic Syrup) is a preparation of right combination of herbs which is effective for all kinds of cough. All of the herbs of this combination are time tested and shown to be clinically effective in case of cough, cold and flu. It is effective, well tolerated, safe and non-sedating with potent anti allergic properties.\n" +
                "\n" +
                "Shedovas relieves cough, bronchial spasm and liquefies mucous. It also relieves irritation of throat, expectorant and anti-inflammatory agent. Shedovas corrects all types of cough, soothes respiratory passage and clear phlegm from respiratory tract."));
        products.add(new Product(R.drawable.tripon,"Liquid","Trip-On®","Mucuna Prurita","Male Multivitamin Syrup",
                "o increase libido, In erectile dysfunction, To increases sperm count and motility, To ensures pleasant orgasm & post coitus freshness, To increase retentive power and optimum duration, To prevent premature ejaculation.",
                "","100ml Pet Bottle Syrup\n" +
                "200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup","105.00Tk 200.00Tk 350.00 Tk.","Trip-on is an Ayurvedic natural aphrodisiac syrup for Youthful Vigor & Vitality."));
        products.add(new Product(R.drawable.urix,"Liquid","Uritrix®","Chandanasav","Uterine tonic and diuretic, Versatile Ayurvedic Syrup",
                "Urinary tract infections (UTI), Pyuria, Burning micturation, Dysuria, Kidney stones, cystitis, Chronic kidney failure, Hyperucemia, Pyospermia, Gonorrhea.",
                "Child: 1-2 teaspoonful 2-3 times a day and Adult : 2-3 teaspoonful 2-3 times a day with equal of normal water.","100ml Pet Bottle Syrup\n" +
                "200ml Pet Bottle Syrup\n" +
                "450ml Pet Bottle Syrup","40.000Tk 70.000Tk 130.00 Tk.","Uritrix is an ayurvedic liquid mainly used for urinary disorders and kidney diseases. It is effective ayurvedic solution for burning maturation, urinary tract infection, pyuria, dysuria, hyperuricemia, kidney stones, cystitis, chronic kidney failure, pyospermia, and gonorrhea."));
        products.add(new Product(R.drawable.ruchitab,"Tablet","Ruchitab®","Hing","Appetizeravel and Digestant",
                "","","1X15 Tablet Pot\n" +
                "1X30 Tablet Pot","180.00Tk 350.00 Tk.",""));
        products.add(new Product(R.drawable.sboned,"Tablet","S-Bone-D®","Shankhadi churno","Natural calcium supplement",
                "Ca supply, Ca absorption, Hyperacidity, Rheumatoid arthritis, Bone Disorder, Liver enlargement, Indigestion.",
                "1 tablet 1-2 times in a day or as a directed by the physician prescription.","2X15 PVC Blister Strip\n" +
                "1X30 PVC Blister Strip","345.00Tk 345.00 Tk.","S-Bone-D is an Ayurvedic remedy prepared from conch shell. In Ayurveda,it is used for treating bone growth development. It also effective for hepatomegaly, Splenomegaly, indigestion and others disease. "));

        products.add(new Product(R.drawable.suntab,"Tablet","Suntab®","Cherry loral","Energy vitalizes and Respiratory diseases reducer",
                "common cold, cough, Rhinitis, convulsion, Malnutrition, Insomnia","1 Tablet in a day 1-2 times or as a directed by the physician advised.",
                "1X15 Tablet Pot\n" +
                        "1X30 Tablet Pot","190.00Tk 380.00 Tk.","Suntab is Ayurvedic medicine in tablet form. It is formulated by extract of cherry, which is a valuable herb. It is effective for common cold, cough, and convulsion. It is also immune booster. It helps in metabolic system in growing health."));

        products.add(new Product(R.drawable.dermory,"Ointment/Cream","Dermory®","Gondhok","Natural Ointment for skin aliments, herbal antiseptic ointment.",
                "Scabies, Itching, Pustules, Eczema, Psoriasis, Ring Worm, Skin Eruption and burn.",
                "Rub gently the affected area and 2 to 4 times daily or as directed by the physician.","Each Tube contains 50gm Ointment/Cream",
                "","Dermory is a unique combination of camphor, Henna, Catechu and others natural ingredients. It act as an antiseptic, anti-inflammatory and anti-microbial. Dermory in very effective in scabies, itching, pustular, piles, boils, eczema and psoriasis. "));

        products.add(new Product(R.drawable.rejuvi,"Ointment/Cream","Rejuvi®","Ambatari Tail","Natural Painkiller ointment, Medicated joint Pain Oil",
                "Rheumatoid arthritis, Osteo arthritis, Spondylytis, Body aches, Joint pain, Muscular pain, Back Pain.",
                "Apply Rejuvi on the affected part, 2-3 times in a day. It is used for external application only.",
                "10gm Lami Tube Ointment\n" +
                        "15gm Lami Tube Ointment\n" +
                        "20gm Lami Tube Ointment"," 60.00Tk 90.00Tk 115.00 Tk.","Rejuvi is a natural painkiller ointment. It helps to get quick relief from rheumatic arthritis. Osteo arthritis, Spondylitis, Sprain, body aches, joint pain, "));

        products.add(new Product(R.drawable.shiny,"Oil","Shiny®","Maha Vringaraj Toil","Medicated Shiny Hair Oil",
                "Hair Fall, Premature graying of Hair, Broken Hair, Dandruff, Scalp folliculitis, Scalp Itching, Tinea Capitis-Fungal Infection, Dry Scalp, Headache, Weak Eyesight, Frozen Shoulder, Medicinal",
                "Apply sufficient quantity on the scalp twice daily or as directed by the physician.","1X200ml Hair Oil","400.00 Tk.",
                "Shiny Herbal Hair Oil nourishes and shields your hairs from tip to roots to make them long, dense & black. Shiny Herbal Hail Oil is non sticky hair oil enriched with the power of vital herbs that cares and protects your dry, dull & damaged hair in a natural way. It spreads evenly onto your hair, penetrates & protects them from heat head, mechanical & chemical damages as well as from routine wear and tear. Shiny Herbal Hail Oil not only tackles hair problems but also treats common scalp problems."));

        products.add(new Product(R.drawable.ageless,"Semi Solid/Halua","Ageless®","ChyabanaPrash","Immunity Enhancer and Anti aging",
                "General debility, Chronic cough, Heart diseases, Anemia, Asthma, Recurrent colds, Blood disorders, Dry skin, Headache, Anorexia nervosa, Insomnia, Dementia",
                "Children: ½ teaspoonful 2 times a day and Adult:1-2 teaspoonfull2-3 times in a day (with honey, ginger )or as a directed by the prescriber advice.",
                "1X100gm Semi Solid\n" +
                        "1X200gm Semi Solid","180.00Tk 350.00 Tk.","Ageless is an ideal tonic of the east, containing valuable natural ingredients, fortified with honey prepared with the ancient’s wisdom and modem research and technology. Ageless keeps you physically fit and mentally alert. It is the supplements of vitamin and minerals. It strengthens respiratory system, fortifies immunity and prevents infectious diseases."));

        products.add(new Product(R.drawable.genking,"Semi Solid/Halua","GEN KING®","Sukrasanjibani","Natural remedy for spermatorrhoea and oligospermia",
                "Spermatorrhoea, Oligospermia,Sexual disorder, Impotency,Aphrodiasic, Nocturnal emission","1 teaspoonful 2 times with milk hot water or milk or as directed by the physician.",
                "1X150gm Halua\n" +
                        "2X150gm Halua","350.00Tk 700.00 Tk.","GEN KING is unique formulation of poly herbs combination which is semisolid form. It enhances retentive power and relieves oligospermia. It also prevents spermatorrhoea and premature ejaculation. It enhances viscosity of semen and prolongs the duration of coitus and ensures post coitus freshness.\n" +
                "\n" +
                "GEN KING Increases semen quantity, sperm motility. It produces sperm and incredibly increases and sperm healthier. GEN KING cures abnormality of sperm, increase fertility and cures impotency."));

        products.add(new Product(R.drawable.hoom,"Drinks","Hoom®","Hawema Bark","Natural Drinks for Energetic and sexual stimulation.",
                "Hoom is effective for the loss of body fluids and provides extra energy for vital organs brain, heart and liver.",
                "100ml Hoom takes per a day or as directed by the physician","100ml Amber glass Bottle\n" +
                "200ml Amber glass Bottle","50.000Tk 80.000 Tk.","Hoom is more than a Natural cold drink. It is a blend of extract of Hawema bark, distilled extract of fruits and herbal valuable ingredients. Hoom is effective for the loss of body fluids and provides extra energy for vital organs brain, heart and liver. It maintains nutritional status and electrolyte balance."));

        products.add(new Product(R.drawable.soyapro,"Powder","Soya-Pro®","Soya lisithin","Natural Protein",
                "General Weakness, Nervous debility, Heart diseases, Digestive, Bone and tissue regeneration, Malnutrition, Low fat, Cholesterol level",
                " 4 cup powder with hot light water or milk is taken, two times in a day or as directed by the physician.","100gm Powder\n" +
                "500gm Powder","130.00Tk 650.00 Tk.","Soya-pro is Natural protein which is powder from dosage as formulated. It is a complete protein which provides all of the essential amino acids for human nutrition. "));

        products.add(new Product(R.drawable.teagra,"Sachet","T-Eagra®","Ginseng Churna","Natural immunizer, Natural Aphrodisiac. For strength, Energy and vitality.",
                "Fatigue and stress, Loss of libido, Adaptive and general tonic, Immunomodulatory effects, Menopausal symptoms, Strength immunity, Antioxidant, Aphrodisiac.",
                "1 sachet 2 times with milk hot water or milk or as directed by the physician.","1X5 Powder Sachet\n" +
                "5X10 Powder Sachet","300.00Tk 3000.00 Tk.","T-Eagra is valued Ayurvedic medicine which is sachet form. The active ingredients in ginseng are a set of compounds called ginsensoides. These complex chemicals have a verity of effects, ranging from stimulation of the nervous system to reduction of blood sugar levels. The herb also has an antioxidant and reduces LDL the bad cholesterol levels.\n" +
                "T-Eagra may help with stimulating physical and mental activity among people who are weak and tired and improve thinking ability and cognition. T-Eagra has inflammatory action. There may be substances in ginseng that have anticancer properties and help in the treatment of erectile dysfunction."));

        products.add(new Product(R.drawable.spagel,"Gel","Spa-Gel®","Maha chandanadi toil","Sexual organ fertilizers Oil, Strengthens the male organ.",
                "Sluggishness, Feebleness, Curvature, Shortness, Obliquity of make organ, Impotency, Night fall and CNS Stimulant.",
                "Apply a few drops of Spa-gel® oil directly on penis and massage gently. Like the massage to the penis and pubic area, massaging above the prostate gland, the area between scrotum and anus.",
                "1X15ml Penis Gel/Oil","250.00 Tk.","Spa-Gel is highly effective in sluggishness, feebleness, curvature, shortness and obliquity of male organ. For excessive indulgence in sexual acts or other causes nerve, blood vessel and tissue lost their elasticity and blood cannot store long time in the blood vessel which reduces the erecting time and makes the male organ week.  Spa-Gel stimulates the nerves and muscles."));


        return products;
    }
}
