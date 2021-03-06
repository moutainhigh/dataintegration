package com.data.common.jdbc.row;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>description</p>
 * @author hourz
 * @since 2018-09-21
 */
public interface RowMapper<T> {
	//
	public abstract T mapRow(ResultSet rs) throws SQLException;
}