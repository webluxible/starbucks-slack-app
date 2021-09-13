package com.webluxible.starbucksslackapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.slack.api.bolt.App
import com.slack.api.bolt.jetty.SlackAppServer

@SpringBootApplication
class StarbucksSlackAppApplication

fun main(args: Array<String>) {
	runApplication<StarbucksSlackAppApplication>(*args)

	val app = App()

	// Write some code here

	val server = SlackAppServer(app)
	server.start() // http://localhost:3000/slack/events
}
