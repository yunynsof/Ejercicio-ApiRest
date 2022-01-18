package com.ingerencia.cl.hackernewapi.response;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class HackerNewApiResponse.
 */
public class HackerNewApiResponse {
	
	/** The hits. */
	private List<Hits> hits;

	/** The nb hits. */
	private int nbHits;

	/** The page. */
	private int page;

	/** The nb pages. */
	private int nbPages;

	/** The hits per page. */
	private int hitsPerPage;

	/** The exhaustive nb hits. */
	private boolean exhaustiveNbHits;

	/** The exhaustive typo. */
	private boolean exhaustiveTypo;

	/** The query. */
	private String query;

	/** The params. */
	private String params;

	/** The rendering content. */
	private RenderingContent renderingContent;

	/** The processing time MS. */
	private int processingTimeMS;

	/**
	 * Sets the hits.
	 *
	 * @param hits the new hits
	 */
	public void setHits(List<Hits> hits) {
		this.hits = hits;
	}

	/**
	 * Gets the hits.
	 *
	 * @return the hits
	 */
	public List<Hits> getHits() {
		return this.hits;
	}

	/**
	 * Sets the nb hits.
	 *
	 * @param nbHits the new nb hits
	 */
	public void setNbHits(int nbHits) {
		this.nbHits = nbHits;
	}

	/**
	 * Gets the nb hits.
	 *
	 * @return the nb hits
	 */
	public int getNbHits() {
		return this.nbHits;
	}

	/**
	 * Sets the page.
	 *
	 * @param page the new page
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public int getPage() {
		return this.page;
	}

	/**
	 * Sets the nb pages.
	 *
	 * @param nbPages the new nb pages
	 */
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	/**
	 * Gets the nb pages.
	 *
	 * @return the nb pages
	 */
	public int getNbPages() {
		return this.nbPages;
	}

	/**
	 * Sets the hits per page.
	 *
	 * @param hitsPerPage the new hits per page
	 */
	public void setHitsPerPage(int hitsPerPage) {
		this.hitsPerPage = hitsPerPage;
	}

	/**
	 * Gets the hits per page.
	 *
	 * @return the hits per page
	 */
	public int getHitsPerPage() {
		return this.hitsPerPage;
	}

	/**
	 * Sets the exhaustive nb hits.
	 *
	 * @param exhaustiveNbHits the new exhaustive nb hits
	 */
	public void setExhaustiveNbHits(boolean exhaustiveNbHits) {
		this.exhaustiveNbHits = exhaustiveNbHits;
	}

	/**
	 * Gets the exhaustive nb hits.
	 *
	 * @return the exhaustive nb hits
	 */
	public boolean getExhaustiveNbHits() {
		return this.exhaustiveNbHits;
	}

	/**
	 * Sets the exhaustive typo.
	 *
	 * @param exhaustiveTypo the new exhaustive typo
	 */
	public void setExhaustiveTypo(boolean exhaustiveTypo) {
		this.exhaustiveTypo = exhaustiveTypo;
	}

	/**
	 * Gets the exhaustive typo.
	 *
	 * @return the exhaustive typo
	 */
	public boolean getExhaustiveTypo() {
		return this.exhaustiveTypo;
	}

	/**
	 * Sets the query.
	 *
	 * @param query the new query
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * Gets the query.
	 *
	 * @return the query
	 */
	public String getQuery() {
		return this.query;
	}

	/**
	 * Sets the params.
	 *
	 * @param params the new params
	 */
	public void setParams(String params) {
		this.params = params;
	}

	/**
	 * Gets the params.
	 *
	 * @return the params
	 */
	public String getParams() {
		return this.params;
	}

	/**
	 * Sets the rendering content.
	 *
	 * @param renderingContent the new rendering content
	 */
	public void setRenderingContent(RenderingContent renderingContent) {
		this.renderingContent = renderingContent;
	}

	/**
	 * Gets the rendering content.
	 *
	 * @return the rendering content
	 */
	public RenderingContent getRenderingContent() {
		return this.renderingContent;
	}

	/**
	 * Sets the processing time MS.
	 *
	 * @param processingTimeMS the new processing time MS
	 */
	public void setProcessingTimeMS(int processingTimeMS) {
		this.processingTimeMS = processingTimeMS;
	}

	/**
	 * Gets the processing time MS.
	 *
	 * @return the processing time MS
	 */
	public int getProcessingTimeMS() {
		return this.processingTimeMS;
	}
}
