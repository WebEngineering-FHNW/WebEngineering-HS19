<html>
<head>
%{--    todo: 4 display in nicer layout--}%
%{--    <meta name="layout" content="form"/>--}%
    <title>
        In-Place Calculator
    </title>
%{--    todo: 3 add on-page validation--}%
%{--    <script>--}%
%{--        function validate(field) {--}%
%{--            if( Number(field.value) < 1.0) {--}%
%{--                field.classList.add("error");--}%
%{--                field.focus();--}%
%{--            } else {--}%
%{--                field.classList.remove("error");--}%
%{--            }--}%
%{--        }--}%
%{--    </script>--}%
</head>

<body>

<form action="/inPlaceCalculator/calc" method="get">
    <fieldset class="form padded">

%{--        todo: 2 refactor duplicated parts into template--}%

        <div>
          <label for='en'>En</label>
          <input type="number decimal" name="en" value="${calculatorInstance.getProperty('en')}"
                 required="true" min="1.0" max="6.0" id="en"
                 class="${hasError(calculatorInstance, 'en') ? 'error' : ''}"
                 title="${g.message(error: findError(calculatorInstance, 'en')) }"
        />

        </div>

%{--        <tmpl:form_row name="en" label="En" model="${calculatorInstance}"/>--}%

        <div>
          <label for='exam'>Exam</label>
          <input type="number decimal" name="$exam" value="${calculatorInstance.getProperty('exam')}"
                 required="true" min="1.0" max="6.0" id="exam"
                 class="${hasError(calculatorInstance, 'exam') ? 'error' : ''}"
                 title="${g.message(error: findError(calculatorInstance, 'exam')) }"
        />

        </div>

%{--        <tmpl:form_row name="exam" label="Exam" model="${calculatorInstance}"/>--}%

        <div>
            <label>&nbsp;</label>
            <input type="submit" value="Calculate"/>
        </div>
    </fieldset>
</form>


<div class="padded">
    <label>Result</label>
%{--    todo: 5 decorate result--}%
%{--    <mvc:decorate grade="${calculatorInstance}">--}%
        <output>${calculatorInstance.result}</output>
%{--    </mvc:decorate>--}%
</div>


</body>
</html>

