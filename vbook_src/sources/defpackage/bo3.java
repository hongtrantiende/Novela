package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bo3  reason: default package */
/* loaded from: classes3.dex */
public final class bo3 extends rmc {
    public final String R;
    public final wl6 S;
    public final n64 T;
    public final cza U;
    public final s02 V;

    public bo3(String str, wl6 wl6Var, n64 n64Var, klc klcVar) {
        super(klcVar);
        this.R = str;
        this.S = wl6Var;
        this.T = n64Var;
        this.U = dza.a(new ao3("", true, "", ""));
        this.V = new s02();
        fdd.g(this, jdd.a(this), new d53(this, null, 5));
    }

    public static final String D(bo3 bo3Var, Map map) {
        String str;
        if (!bo3Var.v() || (str = (String) bo3Var.J.getValue()) == null) {
            str = "raw";
        }
        String str2 = (String) map.get(str);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = (String) map.get("raw");
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
