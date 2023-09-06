**[PROJECT-III]{.underline}**

> **AIM:**

To conduct a comprehensive analysis and simulation of the EternalBlue
exploit as demonstrated in the \'Blue\' room on TryHackMe, with the
objective of deepening knowledge in network security, penetration
testing, and ethical hacking.

> This room is based on a windows machine, in which we need to leverage
> common misconfigurations.
>
> This room is about the BLUE. Here we will be seeing the
> vulnerabilities in windows. So lets get into the room now

**Pictures for completing the ROOM**

**TASK-1 : Recon**

![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image1.png){width="6.988888888888889in"
height="3.1458333333333335in"}

> **TASK-2 : Gain Access**
>
> ![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image1.png){width="6.988888888888889in"
> height="3.145832239720035in"}
>
> **EternalBlue** exploits SMBv1 vulnerabilities to insert malicious
> data packets and spread malware over the
>
> network. The exploit makes use of the way Microsoft Windows handles,
> or rather mishandles, specially

crafted packets from malicious attackers.

> **TASK-3:Escalate**

![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image2.png){width="6.988888888888889in"
height="3.1458333333333335in"}

> ![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image3.png){width="6.988888888888889in"
> height="3.145832239720035in"}
>
> **TASK-4 :Cracking**
>
> Now as we have complete control of the target machine, we can crack
> some passwords. For that,
>
> we need to dump the non-default user's password and crack it.
>
> In our elevated meterpreter shell, by using the command hashdump, we
> will dump all the
>
> passwords on the machine. This is possible because we have the correct
> privileges to do so.

![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image4.png){width="6.988888888888889in"
height="3.1458333333333335in"}

> **TASK-5:Findflags!**
>
> Now we need to find the three flags planted on this machine. These are
> not traditional flags, rather, they are meant to represent key
> locations within the Windows system.

![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image5.png){width="6.988888888888889in"
height="3.1458333333333335in"}

> ![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image6.png){width="6.988888888888889in"
> height="3.147222222222222in"}

Badge After completing the file:

> ![](vertopal_4ff260220b2b40b28b4ea823a3c791ff/media/image7.png){width="6.6930555555555555in"
> height="2.808333333333333in"}

Guided by: Done By:

> Derick Johnson Anand Revanth Kumar

Try HackMe ID:

**Sorryda**
