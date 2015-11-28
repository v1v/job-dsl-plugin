job('example-1') {
    publishers {
        richText {
            markupLanguage('HTML')
            textForStable('<h2>Hello World</h2>')
            sameTextForUnstable()
            sameTextForFailed()
        }
    }
}

job('example-2') {
    publishers {
        richText {
            markupLanguage('HTML')
            textForStable('<h2>Hello World</h2>')
            textForUnstable('<h2>Unstable</h2>')
            textForFailed('<h2>Failed</h2>')
        }
    }
}
