package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e37  reason: default package */
/* loaded from: classes.dex */
public interface e37 extends u06 {
    c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2);

    default c37 i0(int i, int i2, jc jcVar, y0 y0Var, Map map, dg dgVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            lv5.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new d37(i, i2, map, jcVar, y0Var, this, dgVar);
    }

    default c37 q0(int i, int i2, Map map, xt4 xt4Var) {
        return W0(i, i2, map, null, xt4Var);
    }
}
