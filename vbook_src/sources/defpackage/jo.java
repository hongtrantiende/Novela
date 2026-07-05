package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jo  reason: default package */
/* loaded from: classes3.dex */
public final class jo extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(float f, dt8 dt8Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.c = f;
        this.d = dt8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        float f = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new jo((AndroidTextToSpeechService) obj2, f, m42Var, 0);
            case 1:
                return new jo((s42) obj2, f, m42Var, 1);
            case 2:
                return new jo((ss8) obj2, f, m42Var, 2);
            case 3:
                return new jo(f, (dt8) obj2, m42Var);
            default:
                return new jo((o5d) obj2, f, m42Var, 4);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((jo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((jo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((jo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((jo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((jo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object p;
        Map map;
        Object value;
        zc6 zc6Var;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        Object obj2 = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        p = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) obj2;
                    androidTextToSpeechService.M = false;
                    tqc tqcVar = androidTextToSpeechService.J;
                    if (tqcVar != null) {
                        this.b = 1;
                        p = tqcVar.p(f, this);
                        if (p == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                pvc pvcVar2 = (pvc) p;
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                kj6 kj6Var = ((s42) obj2).b;
                this.b = 1;
                if (jxe.p(kj6Var, f, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                ss8 ss8Var = (ss8) obj2;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                vl6 vl6Var = ss8Var.M;
                if (vl6Var != null) {
                    Map map2 = vl6Var.B;
                    String valueOf = String.valueOf(f);
                    map2.getClass();
                    if (map2.isEmpty()) {
                        map = Collections.singletonMap("pdf_zoom", valueOf);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put("pdf_zoom", valueOf);
                        map = linkedHashMap;
                    }
                    wo5 wo5Var = ss8Var.e;
                    String str = ss8Var.c;
                    this.b = 1;
                    gk2 gk2Var = ((ep5) wo5Var).a.c;
                    gk2Var.getClass();
                    str.getClass();
                    ((mm) gk2Var.a).q(1740558351, "UPDATE DbBook\nSET extras = ?\nWHERE id = ?", new jk2(gk2Var, map, str, 0));
                    gk2Var.C(1740558351, new bk2(3));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                c16.w("book");
                throw null;
            case 3:
                ied iedVar = ((dt8) obj2).a;
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    if (f != 1.0f) {
                        cza czaVar = iedVar.d;
                        do {
                            value = czaVar.getValue();
                            zc6Var = (zc6) value;
                        } while (!czaVar.l(value, zc6.c(zc6Var, 0L, nae.e, null, 0L, null, null, 0L, dce.m(f, zc6Var.i().a, zc6Var.i().b), null, null, 8063)));
                        cza czaVar2 = iedVar.d;
                        bo0 bo0Var = new bo0(2, 7, null);
                        this.b = 1;
                        if (z1d.D(czaVar2, bo0Var, this) == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                cd6 cd6Var = iedVar.c;
                cd6Var.getClass();
                if (cd6Var == cd6.a) {
                    iedVar.g.a();
                }
                for (xh8 xh8Var : ((zc6) iedVar.d.getValue()).e) {
                    cza czaVar3 = xh8Var.f.h;
                    do {
                        value2 = czaVar3.getValue();
                    } while (!czaVar3.l(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
                }
                return pvcVar;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                kj6 kj6Var2 = ((o5d) obj2).b;
                this.b = 1;
                if (jxe.p(kj6Var2, f, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo(Object obj, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.c = f;
    }
}
