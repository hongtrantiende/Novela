package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a3d  reason: default package */
/* loaded from: classes3.dex */
public final class a3d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ d3d c;
    public final /* synthetic */ String d;
    public final /* synthetic */ gn8 e;
    public final /* synthetic */ cs9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3d(d3d d3dVar, String str, gn8 gn8Var, cs9 cs9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = d3dVar;
        this.d = str;
        this.e = gn8Var;
        this.f = cs9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new a3d(this.c, this.d, this.e, this.f, m42Var, 0);
            case 1:
                return new a3d(this.c, this.d, this.e, this.f, m42Var, 1);
            case 2:
                return new a3d(this.c, this.d, this.e, this.f, m42Var, 2);
            case 3:
                return new a3d(this.c, this.d, this.e, this.f, m42Var, 3);
            case 4:
                return new a3d(this.c, this.d, this.e, this.f, m42Var, 4);
            default:
                return new a3d(this.c, this.d, this.e, this.f, m42Var, 5);
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
                return ((a3d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((a3d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((a3d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((a3d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((a3d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((a3d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        wj9 wj9Var;
        int i = this.a;
        gn8 gn8Var = this.e;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str = this.d;
                    cs9 cs9Var = this.f;
                    this.b = 1;
                    d3d d3dVar = this.c;
                    d3dVar.getClass();
                    gn8 b = d3d.b(gn8Var, "chapters.json");
                    abf abfVar = qe4.a;
                    abfVar.getClass();
                    if (b.a.exists()) {
                        wj9Var = new wj9(abfVar.A(b));
                        try {
                            l0e.z(d3dVar.a, new b3d(cs9Var, d3dVar, wj9Var, d3dVar, str, str, str, 1));
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str2 = this.d;
                    cs9 cs9Var2 = this.f;
                    this.b = 1;
                    d3d d3dVar2 = this.c;
                    d3dVar2.getClass();
                    gn8 b2 = d3d.b(gn8Var, "bookmarks.json");
                    abf abfVar2 = qe4.a;
                    abfVar2.getClass();
                    if (b2.a.exists()) {
                        wj9Var = new wj9(abfVar2.A(b2));
                        try {
                            l0e.z(d3dVar2.a, new b3d(cs9Var2, d3dVar2, wj9Var, d3dVar2, str2, str2, str2, 0));
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str3 = this.d;
                    cs9 cs9Var3 = this.f;
                    this.b = 1;
                    d3d d3dVar3 = this.c;
                    d3dVar3.getClass();
                    gn8 b3 = d3d.b(gn8Var, "toc_links.json");
                    abf abfVar3 = qe4.a;
                    abfVar3.getClass();
                    if (b3.a.exists()) {
                        wj9Var = new wj9(abfVar3.A(b3));
                        try {
                            l0e.z(d3dVar3.a, new b3d(cs9Var3, d3dVar3, wj9Var, d3dVar3, str3, str3, str3, 5));
                            dxe.r(wj9Var, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 3:
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
                    this.b = 1;
                    d3d d3dVar4 = this.c;
                    ii2 ii2Var = d3dVar4.a;
                    gn8 b4 = d3d.b(gn8Var, "contents");
                    abf abfVar4 = qe4.a;
                    abfVar4.getClass();
                    boolean exists = b4.a.exists();
                    String str4 = this.d;
                    cs9 cs9Var4 = this.f;
                    if (exists) {
                        gn8 b5 = sye.b(gn8Var, "contents.json");
                        if (b5.a.exists()) {
                            wj9Var = new wj9(abfVar4.A(b5));
                            try {
                                s46 s46Var = d3dVar4.b;
                                s46Var.getClass();
                                List list = (List) ie2.o(s46Var, new sz(obb.Companion.serializer(), 0), wj9Var);
                                dxe.r(wj9Var, null);
                                l0e.z(ii2Var, new p6(cs9Var4, d3dVar4, str4, list, b4, 21));
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                    } else {
                        gn8 b6 = sye.b(gn8Var, "contents.json");
                        if (b6.a.exists()) {
                            wj9Var = new wj9(abfVar4.A(b6));
                            try {
                                l0e.z(ii2Var, new b3d(cs9Var4, d3dVar4, wj9Var, d3dVar4, str4, str4, str4, 2));
                                dxe.r(wj9Var, null);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str5 = this.d;
                    cs9 cs9Var5 = this.f;
                    this.b = 1;
                    d3d d3dVar5 = this.c;
                    d3dVar5.getClass();
                    gn8 b7 = d3d.b(gn8Var, "names.json");
                    abf abfVar5 = qe4.a;
                    abfVar5.getClass();
                    if (b7.a.exists()) {
                        wj9Var = new wj9(abfVar5.A(b7));
                        try {
                            l0e.z(d3dVar5.a, new b3d(cs9Var5, d3dVar5, wj9Var, d3dVar5, str5, str5, str5, 3));
                            dxe.r(wj9Var, null);
                        } finally {
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    String str6 = this.d;
                    cs9 cs9Var6 = this.f;
                    this.b = 1;
                    d3d d3dVar6 = this.c;
                    d3dVar6.getClass();
                    gn8 b8 = d3d.b(gn8Var, "qt_words.json");
                    abf abfVar6 = qe4.a;
                    abfVar6.getClass();
                    if (b8.a.exists()) {
                        wj9Var = new wj9(abfVar6.A(b8));
                        try {
                            l0e.z(d3dVar6.a, new b3d(cs9Var6, d3dVar6, wj9Var, d3dVar6, str6, str6, str6, 4));
                            dxe.r(wj9Var, null);
                        } finally {
                        }
                    }
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
