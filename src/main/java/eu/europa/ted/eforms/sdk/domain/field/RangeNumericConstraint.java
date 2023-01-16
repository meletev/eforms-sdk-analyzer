package eu.europa.ted.eforms.sdk.domain.field;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * TEDEFO-546: Implements a range / interval constraint item.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RangeNumericConstraint extends AbstractConstraint<RangeNumericPropertyValue> {
}
