package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b1d  reason: default package */
/* loaded from: classes3.dex */
public final class b1d implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1d b;

    public /* synthetic */ b1d(d1d d1dVar, int i) {
        this.a = i;
        this.b = d1dVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        y0d y0dVar;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        boolean z3;
        int i;
        Object value3;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        d1d d1dVar = this.b;
        switch (i2) {
            case 0:
                wzc wzcVar = (wzc) obj;
                cza czaVar = d1dVar.f;
                if (czaVar != null) {
                    do {
                        value2 = czaVar.getValue();
                        y0dVar = (y0d) value2;
                        z = false;
                        if (wzcVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String str5 = null;
                        if (wzcVar != null) {
                            str = wzcVar.a;
                        } else {
                            str = null;
                        }
                        str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        if (wzcVar != null) {
                            str3 = wzcVar.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (wzcVar != null) {
                            list = wzcVar.h;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = ks3.a;
                        }
                        if (wzcVar != null) {
                            str4 = wzcVar.d;
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (wzcVar != null) {
                            str5 = wzcVar.c;
                        }
                        if (str5 != null) {
                            str2 = str5;
                        }
                        if (wzcVar != null) {
                            z3 = wzcVar.f;
                        } else {
                            z3 = false;
                        }
                        if (wzcVar != null) {
                            i = wzcVar.e;
                        } else {
                            i = 0;
                        }
                        if (wzcVar != null) {
                            z = wzcVar.g;
                        }
                    } while (!czaVar.l(value2, y0d.a(y0dVar, z2, str, str3, str2, list, z3, i, str4, z, 0, 0, 1536)));
                    if (wzcVar != null && czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, y0d.a((y0d) value, false, null, null, null, null, false, 0, null, false, 0, 0, 1535)));
                        return pvcVar;
                    }
                    return pvcVar;
                }
                if (wzcVar != null) {
                }
                return pvcVar;
            default:
                long longValue = ((Number) obj).longValue();
                cza czaVar2 = d1dVar.f;
                if (czaVar2 != null) {
                    do {
                        value3 = czaVar2.getValue();
                    } while (!czaVar2.l(value3, y0d.a((y0d) value3, false, null, null, null, null, false, 0, null, false, 0, (int) longValue, 1023)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
