# PereGreen-Energy
All related documentation and code regarding the smart lightning project.

Introduction:
This document describes the agreed specification for the Intelligent Light Adapter.
The Intelligent Light Adapter (ILA) is a concept to allow LED bulbs to be controlled via an adapter
placed between the bulb and a standard light socket. The inserted adapter allows the LED bulb to be
controlled via a mobile phone. Additionally the adapter will react to its environment automatically
turning off or on or respond to preconfigured settings. In the absence of a detected presence for a
user defined period the light will turn off. When the ambient light falls below a set threshold and a
presence is detected the ILA will illuminate the LED bulb.

Hardware:
The main hardware features and components of the adapter are listed below:

Hardware Features:
The ILA will operate with an LED dimmable bulb of maximum power 15 W.
The ILA will operate at both 110 V and 220 V nominal mains voltages at both 50 Hz and 60 Hz.
The ILA will incorporate a safety resettable fuse to cope with current overload conditions.
Removing mains power to the adapter for 1 second or more will reset the adapter to pass full power
to the bulb on resumption of power.

Light Level Control:
The power to the bulb will be controlled by a triac to allow the bulb to be dimmed over its full range.
Current control will be implemented in software.

Presence Sensor:
A PIR sensing mechanism will be used to detect presence.

Ambient Light Detection
Two sensor types will be used, a device that uses a single sensing device such as TEPT5700 or similar
and an IC with multiple sensing elements such as a GA1A2S100. If no significant benefit is observed
with the multiple sensing element option the single sensing element
device will be used.

Temperature Sensor:
An LM135 temperature will be used to measure the temperature close to the surface of the bulb for
an estimate of the bulb operating temperature.

Communication Protocol:
Two communications protocols will be used to implement a gateway communication model. The ILA
network communication will be achieved using the ZigBee protocol. A gateway node or bulb-
adapter, in the ILA will connect to the user’s home-network using Wi-Fi. Instructions will be passed
via the user’s Wi-Fi to specific bulbs through this gateway. 
