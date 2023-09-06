
PROJECT-II

 **Aim**: The aim of this project is to comprehensively assess the
 capabilities, risks, and implications of offensive cybersecurity
 tools, with a focus on Villain and Metasploit. The project aims to
 provide insights into their potential applications, vulnerabilities
 they exploit, and the ethical and security
 considerations surrounding their use.

Tool_I ==\> Selected Offensive Tool Name:Villain

 About Villain:

 In this project, I explored **Villain**, a C2 framework

 that advances the idea behind handling multiple TCP\
 sockets and HoaxShell-based reverse shells to new heights.

 It allows users to generate powerful and customizable payloads for
 their specific requirements.

 Villain's user-friendly design and intuitive interface make creating
 backdoors and managing numerous sessions a breeze. Additionally,
 Villain is compatible with Windows and Linux machines, making it an
 ideal cross-platform solution. If you want to enhance your backdoor
 generation and session management skills for ethical hacking and
 penetration testing, Villain is an exceptional tool worth exploring.

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image1.png){width="6.6930555555555555in"
height="3.3069444444444445in"}

 Villain Tool Preview:

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image2.png){width="6.6930555555555555in"
height="3.341665573053368in"}

 Key commands of Villain:

 *Generate Backdoor Payloads*

 Connect with Sibling Server\
 The shell command\
 The Upload Command\
 The Conptyshell Command\
 The exec Command*\
 Chat with Sibling Servers\
 Session Defender

 Use \<help\> command to display all Commands which are used in
 Villain:

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image3.png){width="6.6930555555555555in"
height="5.608333333333333in"}

 *In this Poject will go with some basics commands which are used by
 Villain to generate Reverse Shell/Backdoor Payloads\....*

 Generate Reverse Shell Commands

 Use the generate prompt command to generate payloads for\
 Windows / Linux machines. In the latest Villain release, this function
 was redesigned to use payload templates (files). In\
Core/payload_templates/\<OS\>/\<HANDLER\>/ you can find these\
 templates, edit them, make your own, etc. Ultimately, you should
 replace the predefined Windows reverse shell commands with obfuscated
 versions. That way you can create a personalized instance of Villain
 and deal with AV evasion in a more productive and efficient way.

 To get the syntax of the generate command type \<help generate\>\.....

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image4.png){width="6.6930555555555555in"
height="1.7777777777777777in"}

 Generate payload by using the following syntax:

 Syntax:

 Generate payload=\<OS_TYPE/HANDLER/PAYLOAD_TEMPLATE\> lhost=\<IP or
 INTERFACE\> \[ obfuscate encode \]

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image5.png){width="6.6930555555555555in"
 height="1.6041666666666667in"}

 Use the \<connect\> prompt command to connect and share your shell
 sessions with another machine running Villain.

 By default, the Core server port is 65001 (you can change that with -p
 when starting Villain).

Sessions Command:\
Use sessions command to show active session in the victims computer\...

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image6.png){width="6.6930555555555555in"
height="1.4694444444444446in"}

Shell command:\
Use the \<shell\>prompt command to start an interactive pseudo-shell for
a shell session. The effectiveness of the pseudo shell is going to vary
depending on the quality and stability of the shell session. Again, you
should prefer TCP socket based shells as they will always be more stable
than HoaxShell.

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image7.png){width="6.6930555555555555in"
height="1.9166666666666667in"}

Now we are on this machine that the little thing at the bottom so we are
on this machine right now,so we can just type windows command like for
Example\
\<who am i\>

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image8.png){width="6.6930555555555555in"
height="0.5777766841644795in"}

 and you can type \<systeminfo\> to see if we get to pull the info for
 that Machine..

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image9.png){width="6.6930555555555555in"
height="2.283332239720035in"}

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image10.png){width="6.6930555555555555in"
height="2.977777777777778in"}

 one can also use the \<exec\> prompt command to execute a quoted
 command or script from your file system against a session. Files are
 executed by being http requested from the Http File Smuggler. Be
 carefull! The script you execute should much the shell session type
 (e.g., a PowerShell script script should be executed against a
 powershell.exe session, etc).

 One can use \<exit\> to exit from the machine but the session still
 active\...

To Terminate the session use \<kill\> command with the session ID\...

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image11.png){width="6.6930555555555555in"
height="0.47638888888888886in"}

 If you type \<sessions\> after the \<kill\> command there is no active
 sessions\....

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image12.png){width="6.6930555555555555in"
height="0.7847211286089238in"}

 Conclusions:

 Villain has a built-in auto-obfuscate payload function to assist users
 in bypassing AV solutions (for Windows payloads). As a result,
 payloads are undetected (for the time being).

 Each generated payload is going to work only once. An already used
 payload cannot be reused to establish a session.

 The communication between sibling servers is AES
encrypted using the recipient sibling server's ID as the
 encryption KEY and the 16 first bytes of the local server's ID as IV.
 During the initial connection handshake of two sibling servers, each
 server's ID is exchanged clear text, meaning that the handshake could
 be captured and used to decrypt traffic between sibling servers. I
 know it's "weak" that way. It's not supposed to be super secure as
 this tool was designed to be used during penetration testing / red
 team assessments, for which this encryption schema should be enough.

Villain instances connected with each other (sibling servers) must be
able to directly reach each other as well. I intend to add a network
route mapping utility so that sibling servers can use one another as a
proxy to achieve cross network communication between them.

Tool_II\
==\>Selected Offensive Tool Name:METASPLOIT-\
FRAMEWORK

 About METASPLOIT:

 The Metasploit framework is a very powerful tool which can be

 used by cybercriminals as well as ethical hackers to probe systematic
 vulnerabilities on networks and servers. Because it's an open-source
 framework, it can be easily customized and used with most operating
 systems.

With Metasploit, the Pen Testing Team can use ready-made or custom
 code and introduce it into a network to probe for weak spots. As
 another flavor of threat hunting, once flaws are identified and
 documented, the information can be used to address systemic weaknesses
 and prioritize solutions.

 **Here's a diagram of a typical Metasploit architecture:**
![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image13.png){width="6.6930555555555555in"
height="4.670832239720035in"}

 **PREVIEW OF METASPLOIT:**
![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image14.png){width="7.445833333333334in"
eight="4.184721128608924in"}

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image15.png){width="5.195833333333334in"
 height="5.3in"}

 **[BASIC COMMANDS USED IN METASPLOIT:]{.underline}**
 One shortcut is to type "help" into the console, which will bring up a
 list of Metasploit commands and their descriptions. It should look
 like this:

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image16.png){width="6.6930555555555555in"
height="5.144444444444445in"}

 Type "use exploits/windows/smb/psexec" thats it now we are in psexec
 module and now I've gone ahead and set some commands\...

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image17.png){width="6.6930555555555555in"
height="0.9541666666666667in"}

 \<show options\>

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image18.png){width="6.6930555555555555in"
 height="4.733332239720035in"}

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image19.png){width="6.6930555555555555in"
 height="3.4416655730533683in"}

\<set PAYLOAD \> for windows:

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image20.png){width="6.6930555555555555in"
 height="0.625in"}

 \<set LHOST\>

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image21.png){width="6.337498906386702in"
 height="0.4652777777777778in"}

 \<set LPORT\>

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image22.png){width="6.069444444444445in"
 height="0.8958333333333334in"}

 \<set RPORT\>

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image23.png){width="5.4875in"
 height="0.7333333333333333in"}

 \<set RHOST\>

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image24.png){width="5.419444444444444in"
 height="0.41805555555555557in"}

 again type \<show options\> to see the difference:

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image25.png){width="6.6930555555555555in"
height="2.9791666666666665in"}

 To see sessions type \<sessions\>
![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image26.png){width="6.6930555555555555in"
height="1.8416666666666666in"}

 To get the all information about the machine type \<info\>

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image27.png){width="6.6930555555555555in"
 height="3.1069444444444443in"}

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image28.png){width="5.883333333333334in"
height="3.5930544619422573in"}

 Use \<save \>to save all commands use by the metasploit\...

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image29.png){width="6.022222222222222in"
 height="0.6625in"}

 use \<cat file_name\> to see the contents of the file msf4

 [](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image30.png){width="6.9444444444444in"
 height="2.6277777777777778in"}

 \<makerc file_name\> to save all used commands in a particular
 file_name(exploit_example.rb)

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image31.png){width="6.6930555555555555in"
height="2.2777777777777777in"}

 use \<cat file_name\> to see the contents of the exploit_example.rb

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image32.png){width="6.569443350831146in"
 height="1.488888888888889in"}

To see jobs and sessions :\
\<jobs\> to see active jobs(since there is no active jobs here)\
\<sessions\> to see active sessions (since there is no active sessions)

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image33.png){width="4.895833333333333in"
 height="3.279166666666667in"}

To change the module again we have to type the \<use module_name\>
command\....

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image34.png){width="6.6930555555555555in"
 height="3.6333333333333333in"}

 \<search \> command

![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image35.png){width="6.694443350831146in"
height="2.2402777777777776in"}

 use \<exit\> command to exit from Metasploit

 ![](vertopal_d236c31b48be4ca28ab6c942ae086c74/media/image36.png){width="5.731944444444444in"
 height="0.6513888888888889in"}

 **CONCLUSION:**

 With the wide range of applications and open-source availability that

 Metasploit offers, the framework is used by professionals in
 development,

 security, and operations to hackers. The framework is popular with
 hackers and

 easily available, making it an easy to install, reliable tool for
 security

 professionals to be familiar with even if they don't need to use it.\
**Thank you**

