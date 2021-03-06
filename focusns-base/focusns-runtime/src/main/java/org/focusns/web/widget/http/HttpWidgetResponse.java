package org.focusns.web.widget.http;

/*
 * #%L
 * FocusSNS Runtime
 * %%
 * Copyright (C) 2011 - 2013 FocusSNS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import org.focusns.web.widget.WidgetResponse;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class HttpWidgetResponse implements WidgetResponse {

    private boolean commited;
	private PrintWriter writer;
	private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	
	public HttpWidgetResponse() {
	}

	public PrintWriter getWriter() {
		if(writer==null) {
			this.writer = new ResponsePrintWriter(new PrintWriter(outputStream));
		}
		//
		return writer; 
	}

	public OutputStream getOutputStream() {
		return outputStream;
	}

    @Override
    public void commit() {
        this.commited = true;
    }

    @Override
    public boolean isCommitted() {
        return commited;
    }

    @Override
	public String toString() {
		return outputStream.toString();
	}
	
	private class ResponsePrintWriter extends PrintWriter {

		public ResponsePrintWriter(Writer out) {
			super(out, true);
		}

        @Override
		public void write(char buf[], int off, int len) {
			super.write(buf, off, len);
			super.flush();
		}

        @Override
		public void write(String s, int off, int len) {
			super.write(s, off, len);
			super.flush();
		}

        @Override
		public void write(int c) {
			super.write(c);
			super.flush();
		}

        @Override
		public void flush() {
			super.flush();
		}
	}

}
