public class xpath3notes {
   /* locators in selenium :

            1.id
2.class name
3.linktext (that it must have a link tag <a> and it must have a text )
4.partial link text ()
5.tagName
6.Xpath
7.CSS

.....................................Xpath------------------------------......................

            1.Relative Xpath:

    a.Syntax for xapth (finding by attribute):
    //tagname[@attribute='attribute value']

    translation:
    hey get me the tagname , which has an 'attibute' whose value is "attribute value"


            *****   Example  ****

								<input name ="abra" ,class ="fhdhfd"/>


    task is to write down the xpath to get to this webElement:

    //input[@name='abra']

    translate:

    hey get me the tag "input" which has an attribute name whose value is "abra";






    b.Syntax for xpath (finding by text):
    //tagname[text()='text value']


    translation :
    hey get me the tagname which has a text    "text value".

    condition :
    our html code (webelement) must have text.
            ****Example:****

									<button id="tro", class="fyo"> heelo </button>
    answer:
    //button[text()='heelo']



    c.Syntax for xpath (finding by contains method):

            for tagname

    //tagname[contains(@attribute, 'partial attribute value')]

    translation :

    get me the tag name which has an attibute whose value contains "partial value of the attribute"


            ******Example**********
                              <input email= "how are you i am fine , thankyou" id="dsfs"/>

    xpath using contains method:

            //input[contains(@email,'how are you')]



            for text

    //tagname[contains(text(), 'partial text value')]





    conatins can be used in a scenario where
1.the attribute or text is very long
2.when part of the value or text is dynamic


--------------------------------------------------------------------------------------------------------------------------


    in xpath we learned 4 type

    a.by attribute    //tagname[@attribute = 'attribute value']
    b.by text          //tagname[text() = 'text value']
    c.By partial attribute value    //tagname[contains(@attribute, 'partial attribute value')]
    d.by partial text value        //tagname[contains(text(), 'partial text value')]



    we learned two more methods

1..clear()  --> it clears the text box
2. .getText() --> it gets the text from the webElment (if no text is present it will print empty)



    Scenario:

    you tried alot but still you were unable to find the unique xpath or locator for a webElement
    it always shows 1of 2

    which one will be accessed when u used
    driver.findelement????

    Answer: the First one that is encountered.




    Scenario:
            if you are unable to find a unqique and it always shows 1of 2 or 1of 4 u can use indexing
    but make sure it is last resort as any addition or changes in code might effect indexing

    syntax:
//tagname[@attribute="attribute value"][index]---> index starts from 1 here not 0.





            ---------------------------Absolute xpath---------------------
    absolute xpath refers to the exact pin point of the location of the element
    but it is usually avoided, not much used in the industry.
    as a little change in dom can change that location.



<html>
  <head>
 		 <title> mywebPage </title>
 </head>
  <body>
         <input id='email'/>
         <button x="a"> helo</button>
         <a>
            <input id="dsdad"/>
            <input id ="ab"/>
 			<input id ="troy"/>
        </a>
  </body>


</html>


    question:
    get the third input tagwith id =troy
    answer :
            /html/body/a/input[3]




            -------------------------------------------------------------------------------------------


            --------------------------------By tagName-------------------------------------------------


    in order to use this locator u just give the tagName
    it is very help ful in scenarios where u want to get mutliple elements with the same tag name.






            task : goto amazon.com and get all the links.







            ------------------------------------- revise-----------------------------------

            1.Xpath

    a.Relative

	1.by attribute    //tagname[@attribute = 'attribute value']
	2.by text          //tagname[text() = 'text value']
	3.By partial attribute value    //tagname[contains(@attribute, 'partial attribute value')]
	4.by partial text value        //tagname[contains(text(), 'partial text value')]



    b.Absolute





1..clear()---> it deletes the text in the text box
2.getText()--> gets the text if there is any


    The locator Tagname:

    we use this usually when we need to access mutliple elements with same tagname


            .getattribute()--> to get the vlaue of an attribute from the webElement

goto amazon.com and get all the links.


            1. links are usally in which tag?  <a>

*/
}
