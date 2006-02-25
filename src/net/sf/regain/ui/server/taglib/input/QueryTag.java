/*
 * regain - A file search engine providing plenty of formats
 * Copyright (C) 2004  Til Schneider
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Contact: Til Schneider, info@murfman.de
 *
 * CVS information:
 *  $RCSfile: QueryTag.java,v $
 *   $Source: /cvsroot/regain/regain/src/net/sf/regain/ui/server/taglib/input/QueryTag.java,v $
 *     $Date: 2005/02/24 15:31:35 $
 *   $Author: til132 $
 * $Revision: 1.1 $
 */
package net.sf.regain.ui.server.taglib.input;

import net.sf.regain.util.sharedtag.taglib.SharedTagWrapperTag;

/**
 * Taglib wrapper for the shared query tag.
 *
 * @see net.sf.regain.search.sharedlib.input.QueryTag
 *
 * @author Til Schneider, www.murfman.de
 */
public class QueryTag extends SharedTagWrapperTag {

  /**
   * Creates a new instance of QueryTag.
   */
  public QueryTag() {
    super(new net.sf.regain.search.sharedlib.input.QueryTag());
  }


  /**
   * Sets the size of the input field.
   * 
   * @param size The size of the input field.
   */
  public void setSize(String size) {
    getNestedTag().setParameter("size", size);
  }

}