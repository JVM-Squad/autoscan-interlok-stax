package com.adaptris.stax;

import java.io.Writer;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Builds an {@link XMLStreamWriter} using {@link XMLOutputFactory}.
 * 
 * @config stax-default-writer-factory
 *
 */
@XStreamAlias("stax-default-stream-writer")
public class DefaultWriterFactory extends StreamWriterFactoryImpl {

  @Override
  public XMLStreamWriter create(Writer w) throws XMLStreamException {
    return XMLOutputFactory.newInstance().createXMLStreamWriter(w);
  }

}
