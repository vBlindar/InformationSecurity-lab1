<div class="table-container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <#list alphabet as item>
                <td class="text-center">
                    ${item}
                </td>
            </#list>

        </tr>
        </thead>
        <tr>
            <#list key as item>
                <td class="text-center">
                    ${item}
                </td>
            </#list>

        </tr>
    </table>
</div>