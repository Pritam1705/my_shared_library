package org.p11combinedforce.template.ansibleCI

import org.p11combinedforce.ansibleCI.*
import org.p11combinedforce.common.*

def call(String url, String branch, String creds, String playbookPath) {
    // Call utility functions
    wsClean()
    gitCheckOut(url, branch, creds)
    SyntaxCheck(playbookPath)
}
