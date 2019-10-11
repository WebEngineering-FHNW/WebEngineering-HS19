<html>
<head>
    <meta name="layout" content="form"/>
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

        <tmpl:form_row name="en"   label="En"   model="${calculatorInstance}"/>

        <tmpl:form_row name="exam" label="Exam" model="${calculatorInstance}"/>

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

