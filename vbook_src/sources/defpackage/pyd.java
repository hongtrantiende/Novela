package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pyd  reason: default package */
/* loaded from: classes.dex */
public final class pyd extends xb1 {
    public static final Map e;
    public final nkf d;

    static {
        nkf[] values;
        EnumMap enumMap = new EnumMap(nkf.class);
        for (nkf nkfVar : nkf.values()) {
            pyd[] pydVarArr = new pyd[10];
            for (int i = 0; i < 10; i++) {
                pydVarArr[i] = new pyd(i, nkfVar, tkf.e);
            }
            enumMap.put((EnumMap) nkfVar, (nkf) pydVarArr);
        }
        e = Collections.unmodifiableMap(enumMap);
    }

    public pyd(int i, nkf nkfVar, tkf tkfVar) {
        super(tkfVar, i);
        uaf.D(nkfVar, "format char");
        this.d = nkfVar;
        if (!tkfVar.a()) {
            int i2 = nkfVar.a;
            i2 = tkfVar.c() ? i2 & 65503 : i2;
            StringBuilder sb = new StringBuilder("%");
            tkfVar.d(sb);
            sb.append((char) i2);
        }
    }

    @Override // defpackage.xb1
    public final void R(cr3 cr3Var, Object obj) {
        cr3Var.e(obj, this.d, (tkf) this.c);
    }
}
