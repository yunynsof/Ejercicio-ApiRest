package com.ingerencia.cl.hackernewapi.response;

// TODO: Auto-generated Javadoc
/**
 * The Class HighlightResult.
 */
public class HighlightResult {

	/** The author. */
	private Author author;

	/** The comment text. */
	private Comment_text comment_text;

	/** The story title. */
	private Story_title story_title;

	/** The story url. */
	private Story_url story_url;

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public Author getAuthor() {
		return this.author;
	}

	/**
	 * Sets the comment text.
	 *
	 * @param comment_text the new comment text
	 */
	public void setComment_text(Comment_text comment_text) {
		this.comment_text = comment_text;
	}

	/**
	 * Gets the comment text.
	 *
	 * @return the comment text
	 */
	public Comment_text getComment_text() {
		return this.comment_text;
	}

	/**
	 * Sets the story title.
	 *
	 * @param story_title the new story title
	 */
	public void setStory_title(Story_title story_title) {
		this.story_title = story_title;
	}

	/**
	 * Gets the story title.
	 *
	 * @return the story title
	 */
	public Story_title getStory_title() {
		return this.story_title;
	}

	/**
	 * Sets the story url.
	 *
	 * @param story_url the new story url
	 */
	public void setStory_url(Story_url story_url) {
		this.story_url = story_url;
	}

	/**
	 * Gets the story url.
	 *
	 * @return the story url
	 */
	public Story_url getStory_url() {
		return this.story_url;
	}
}
