package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xjf  reason: default package */
/* loaded from: classes.dex */
public final class xjf extends uff {
    public static final xjf a = new xjf();

    private xjf() {
    }

    public static void a(uyd uydVar, tef tefVar) {
        boolean parseBoolean;
        if (tefVar != null && !(tefVar instanceof xef)) {
            boolean z = tefVar instanceof dff;
            if (z) {
                if (z) {
                    dff dffVar = (dff) tefVar;
                    Serializable serializable = dffVar.a;
                    if (serializable instanceof Number) {
                        uydVar.p0(dffVar.a());
                        return;
                    } else if (serializable instanceof Boolean) {
                        if (serializable instanceof Boolean) {
                            parseBoolean = ((Boolean) serializable).booleanValue();
                        } else {
                            parseBoolean = Boolean.parseBoolean(dffVar.b());
                        }
                        uydVar.m0(parseBoolean);
                        return;
                    } else {
                        uydVar.j0(dffVar.b());
                        return;
                    }
                }
                vs.k("Not a JSON Primitive: ".concat(tefVar.toString()));
                return;
            }
            boolean z2 = tefVar instanceof qef;
            if (z2) {
                uydVar.G();
                if (z2) {
                    ArrayList arrayList = ((qef) tefVar).a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        a(uydVar, (tef) obj);
                    }
                    uydVar.Q();
                    return;
                }
                vs.k("Not a JSON Array: ".concat(tefVar.toString()));
                return;
            }
            boolean z3 = tefVar instanceof zef;
            if (z3) {
                uydVar.S();
                if (z3) {
                    Iterator it = ((yhf) ((zef) tefVar).a.entrySet()).iterator();
                    while (((vhf) it).hasNext()) {
                        fif a2 = ((vhf) it).a();
                        uydVar.g0((String) a2.getKey());
                        a(uydVar, (tef) a2.getValue());
                    }
                    uydVar.V();
                    return;
                }
                vs.k("Not a JSON Object: ".concat(tefVar.toString()));
                return;
            }
            vs.m("Couldn't write ".concat(String.valueOf(tefVar.getClass())));
            return;
        }
        uydVar.y0();
    }

    public static final tef b(tyd tydVar, int i) {
        int i2 = i - 1;
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 == 8) {
                        tydVar.V0();
                        return xef.a;
                    }
                    vs.k("Unexpected token: ".concat(n4f.t(i)));
                    return null;
                }
                return new dff(Boolean.valueOf(tydVar.N0()));
            }
            return new dff(new qhf(tydVar.I0()));
        }
        return new dff(tydVar.I0());
    }

    @Override // defpackage.uff
    public final Object read(tyd tydVar) {
        tef qefVar;
        String str;
        tef qefVar2;
        tef tefVar;
        if (tydVar instanceof akf) {
            akf akfVar = (akf) tydVar;
            int l1 = akfVar.l1();
            if (l1 != 5 && l1 != 2 && l1 != 4 && l1 != 10) {
                tef tefVar2 = (tef) akfVar.J[akfVar.K - 1];
                int l12 = akfVar.l1() - 1;
                if (l12 != 1) {
                    if (l12 != 9) {
                        if (l12 != 3) {
                            if (l12 != 4) {
                                akfVar.t1();
                                int i = akfVar.K;
                                if (i > 0) {
                                    int[] iArr = akfVar.M;
                                    int i2 = i - 1;
                                    iArr[i2] = iArr[i2] + 1;
                                    return tefVar2;
                                }
                            } else {
                                akfVar.p1(true);
                                return tefVar2;
                            }
                        } else {
                            akfVar.m0();
                        }
                    }
                    return tefVar2;
                }
                akfVar.g0();
                return tefVar2;
            }
            String t = n4f.t(l1);
            vs.k(nk2.v(new StringBuilder(t.length() + 39), "Unexpected ", t, " when reading a JsonElement."));
            return null;
        }
        int l13 = tydVar.l1();
        int i3 = l13 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                qefVar = null;
            } else {
                tydVar.j0();
                qefVar = new zef();
            }
        } else {
            tydVar.V();
            qefVar = new qef();
        }
        if (qefVar == null) {
            return b(tydVar, l13);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (tydVar.p0()) {
                if (qefVar instanceof zef) {
                    str = tydVar.y0();
                } else {
                    str = null;
                }
                int l14 = tydVar.l1();
                int i4 = l14 - 1;
                if (i4 != 0) {
                    if (i4 != 2) {
                        qefVar2 = null;
                    } else {
                        tydVar.j0();
                        qefVar2 = new zef();
                    }
                } else {
                    tydVar.V();
                    qefVar2 = new qef();
                }
                if (qefVar2 == null) {
                    tefVar = b(tydVar, l14);
                } else {
                    tefVar = qefVar2;
                }
                if (qefVar instanceof qef) {
                    ((qef) qefVar).a.add(tefVar);
                } else {
                    ((zef) qefVar).a.put(str, tefVar);
                }
                if (qefVar2 != null) {
                    arrayDeque.addLast(qefVar);
                    qefVar = tefVar;
                }
            } else {
                if (qefVar instanceof qef) {
                    tydVar.g0();
                } else {
                    tydVar.m0();
                }
                if (arrayDeque.isEmpty()) {
                    return qefVar;
                }
                qefVar = (tef) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.uff
    public final /* bridge */ /* synthetic */ void write(uyd uydVar, Object obj) {
        a(uydVar, (tef) obj);
    }
}
