/*
 * 3D City Database - The Open Source CityGML Database
 * http://www.3dcitydb.org/
 * 
 * Copyright 2013 - 2017
 * Chair of Geoinformatics
 * Technical University of Munich, Germany
 * https://www.gis.bgu.tum.de/
 * 
 * The 3D City Database is jointly developed with the following
 * cooperation partners:
 * 
 * virtualcitySYSTEMS GmbH, Berlin <http://www.virtualcitysystems.de/>
 * M.O.S.S. Computer Grafik Systeme GmbH, Taufkirchen <http://www.moss.de/>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.citydb.database.adapter;

import java.sql.Connection;
import java.sql.SQLException;

import org.citydb.config.geometry.GeometryObject;

public abstract class AbstractGeometryConverterAdapter {
	protected final AbstractDatabaseAdapter databaseAdapter;

	protected AbstractGeometryConverterAdapter(AbstractDatabaseAdapter databaseAdapter) {
		this.databaseAdapter = databaseAdapter;
	}
	
	public abstract GeometryObject getEnvelope(Object geomObj) throws SQLException;
	public abstract GeometryObject getPoint(Object geomObj) throws SQLException;
	public abstract GeometryObject getMultiPoint(Object geomObj) throws SQLException;
	public abstract GeometryObject getCurve(Object geomObj) throws SQLException;
	public abstract GeometryObject getMultiCurve(Object geomObj) throws SQLException;
	public abstract GeometryObject getPolygon(Object geomObj) throws SQLException;
	public abstract GeometryObject getMultiPolygon(Object geomObj) throws SQLException;
	public abstract GeometryObject getGeometry(Object geomObj) throws SQLException;
	public abstract Object getDatabaseObject(GeometryObject geomObj, Connection connection) throws SQLException;
	public abstract int getNullGeometryType();
	public abstract String getNullGeometryTypeName();
}