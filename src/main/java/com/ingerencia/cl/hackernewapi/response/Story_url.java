package com.ingerencia.cl.hackernewapi.response;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Story_url.
 */
public class Story_url {
	
	/** The value. */
	private String value;

	/** The match level. */
	private String matchLevel;

	/** The matched words. */
	private List<String> matchedWords;

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 * Sets the match level.
	 *
	 * @param matchLevel the new match level
	 */
	public void setMatchLevel(String matchLevel) {
		this.matchLevel = matchLevel;
	}

	/**
	 * Gets the match level.
	 *
	 * @return the match level
	 */
	public String getMatchLevel() {
		return this.matchLevel;
	}

	/**
	 * Sets the matched words.
	 *
	 * @param matchedWords the new matched words
	 */
	public void setMatchedWords(List<String> matchedWords) {
		this.matchedWords = matchedWords;
	}

	/**
	 * Gets the matched words.
	 *
	 * @return the matched words
	 */
	public List<String> getMatchedWords() {
		return this.matchedWords;
	}
}
