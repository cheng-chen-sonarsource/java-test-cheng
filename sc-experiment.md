
Experiment date: 2022-08-30

SC Project key: <code>cheng-chen-sonarsource_java-test-cheng</code>

Tracked issue: <code>AYLvCsMWX7AR_G1auNUZ</code>


### Commit adc57d1694229a1d7abd0ab9fa2557c29a083ada
- Date:   Tue Aug 30 15:56:37 2022 +0200
- Message: reinitialize issue


### Push, SC scan triggered

Issue created:

https://sonarcloud.io/api/issues/search?issues=AYLvCsMWX7AR_G1auNUZ returns:

- line: 27
- "creationDate": "2022-08-30T15:56:37+0200",
- "updateDate": "2022-08-30T15:57:03+0200",

https://sonarcloud.io/api/sources/issue_snippets?issueKey=AYLvCsMWX7AR_G1auNUZ returns:

    {
        "line": 27,
        "code": "        <span class=\"sym-4 sym\">Connection</span> <span class=\"sym-18 sym\">connnection</span> = <span class=\"sym-5 sym\">DriverManager</span>.getConnection(<span class=\"s\">\"jdbc:derby:memory:myDB;create=true\"</span>, <span class=\"s\">\"login\"</span>, <span class=\"s\">\"\"</span>);;",
        "scmRevision": "adc57d1694229a1d7abd0ab9fa2557c29a083ada",
        "scmDate": "2022-08-30T15:56:37+0200",
        "duplicated": false,
        "isNew": false
    },


### commit 916960601b085dc16e0cb8d2f36fc1af1fd4e7ac
- Date:   Tue Aug 30 16:05:20 2022 +0200
- Message: issue line 27 to 30


### commit b6b13f11213e4a831bcb4bb048e2df968f13e4f7
- Date:   Tue Aug 30 16:06:39 2022 +0200
- Message: issue fixed


### commit 87b27500a40920d5f4f7d38886fc5add565af546
- Date:   Tue Aug 30 16:08:33 2022 +0200
- Message: issue line 30-35, then changed line 35


### commit 154d0a79f74a399a6b924083069cabe86e9f0be9
- Date:   Tue Aug 30 16:10:04 2022 +0200
- Message: changed line 35


### Push, SC scan triggered
Issue Closed:Fixed

https://sonarcloud.io/api/issues/search?issues=AYLvCsMWX7AR_G1auNUZ returns:
- line: 27
- "creationDate": "2022-08-30T15:56:37+0200",
- "updateDate": "2022-08-30T16:12:21+0200",
- "closeDate": "2022-08-30T16:12:21+0200",


https://sonarcloud.io/api/sources/issue_snippets?issueKey=AYLvCsMWX7AR_G1auNUZ returns:

    {
        "line": 27,
        "code": "",
        "scmRevision": "87b27500a40920d5f4f7d38886fc5add565af546",
        "scmDate": "2022-08-30T16:08:33+0200",
        "duplicated": false,
        "isNew": false
    },


    {
        "line": 35,
        "code": "        <span class=\"k\">int</span> <span class=\"sym-18 sym\">x</span> = <span class=\"c\">200</span>;<span class=\"cd\">//Connection connnection = DriverManager.getConnection(\"jdbc:derby:memory:myDB;create=true\", \"login\", \"\");;</span>",
        "scmRevision": "154d0a79f74a399a6b924083069cabe86e9f0be9",
        "scmDate": "2022-08-30T16:10:04+0200",
        "duplicated": false,
        "isNew": false
    },



### commit e85a40d7f49305d579148391f4971b5618754f13
- Date:   Tue Aug 30 16:15:19 2022 +0200
- Message: issue line 35 to 50


### Push, SC scan triggered
Issue still Closed:fixed

https://sonarcloud.io/api/issues/search?issues=AYLvCsMWX7AR_G1auNUZ
- line: 27
- "creationDate": "2022-08-30T15:56:37+0200",
- "updateDate": "2022-08-30T16:12:21+0200",
- "closeDate": "2022-08-30T16:12:21+0200",


https://sonarcloud.io/api/sources/issue_snippets?issueKey=AYLvCsMWX7AR_G1auNUZ

    {
        "line": 27,
        "code": "",
        "scmRevision": "e85a40d7f49305d579148391f4971b5618754f13",
        "scmDate": "2022-08-30T16:15:19+0200",
        "duplicated": false,
        "isNew": false
    },


    line 50 is out of the scope (no results)