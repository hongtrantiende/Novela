package org.mozilla.javascript;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class UniqueTag implements Serializable {
    private static final int ID_DOUBLE_MARK = 3;
    private static final int ID_NOT_FOUND = 1;
    private static final int ID_NULL_VALUE = 2;
    private static final long serialVersionUID = -4320556826714577259L;
    private final int tagId;
    public static final UniqueTag NOT_FOUND = new UniqueTag(1);
    public static final UniqueTag NULL_VALUE = new UniqueTag(2);
    public static final UniqueTag DOUBLE_MARK = new UniqueTag(3);

    private UniqueTag(int i) {
        this.tagId = i;
    }

    public Object readResolve() {
        int i = this.tagId;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return DOUBLE_MARK;
                }
                vs.k(String.valueOf(i));
                return null;
            }
            return NULL_VALUE;
        }
        return NOT_FOUND;
    }

    public String toString() {
        String str;
        int i = this.tagId;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "DOUBLE_MARK";
                } else {
                    throw Kit.codeBug();
                }
            } else {
                str = "NULL_VALUE";
            }
        } else {
            str = "NOT_FOUND";
        }
        return eub.o(super.toString(), ": ", str);
    }
}
