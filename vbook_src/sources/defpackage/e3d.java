package defpackage;

import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e3d  reason: default package */
/* loaded from: classes3.dex */
public final class e3d extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ s3d c;
    public final /* synthetic */ gn8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3d(s3d s3dVar, gn8 gn8Var, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = s3dVar;
        this.d = gn8Var;
    }

    private final Object o(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d s3dVar = this.c;
        lm2 lm2Var = s3dVar.a.T;
        lm2Var.getClass();
        rp2 rp2Var = rp2.a;
        mm mmVar = (mm) lm2Var.a;
        yo2 yo2Var = new yo2(24);
        mmVar.getClass();
        List<qp2> c = new xla(1876706263, new String[]{"DbTTSWord"}, mmVar, "DbTTSWord.sq", "getAll", "SELECT DbTTSWord.id, DbTTSWord.word, DbTTSWord.replace, DbTTSWord.ignoreCase, DbTTSWord.createAt, DbTTSWord.updateAt\nFROM DbTTSWord\nORDER BY createAt ASC", yo2Var).c();
        ArrayList arrayList = new ArrayList(tl1.s(c, 10));
        for (qp2 qp2Var : c) {
            qp2Var.getClass();
            arrayList.add(new bfb(qp2Var.a, qp2Var.b, qp2Var.c, qp2Var.d, qp2Var.e, qp2Var.f));
        }
        uj9 uj9Var = new uj9(abf.z(qe4.a, sye.b(this.d, "tts_words.json")));
        try {
            s46 s46Var = s3dVar.b;
            s46Var.getClass();
            ie2.q(s46Var, new sz(bfb.Companion.serializer(), 0), arrayList, uj9Var);
            dxe.r(uj9Var, null);
            n82 n82Var = n82.a;
            if (pvcVar == n82Var) {
                return n82Var;
            }
            return pvcVar;
        } finally {
        }
    }

    private final Object p(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d s3dVar = this.c;
        gk2 gk2Var = s3dVar.a.M;
        gk2Var.getClass();
        uo2 uo2Var = uo2.a;
        mm mmVar = (mm) gk2Var.a;
        bo2 bo2Var = new bo2(gk2Var);
        mmVar.getClass();
        List<to2> c = new xla(-866601853, new String[]{"DbNotification"}, mmVar, "DbNotification.sq", "getAll", "SELECT DbNotification.id, DbNotification.type, DbNotification.content, DbNotification.createAt, DbNotification.read FROM DbNotification\nORDER BY read ASC, createAt DESC", bo2Var).c();
        ArrayList arrayList = new ArrayList(tl1.s(c, 10));
        for (to2 to2Var : c) {
            to2Var.getClass();
            String str = to2Var.a;
            arrayList.add(new fdb(to2Var.b, to2Var.d, str, to2Var.c, to2Var.e));
        }
        uj9 uj9Var = new uj9(abf.z(qe4.a, sye.b(this.d, "notifications.json")));
        try {
            s46 s46Var = s3dVar.b;
            s46Var.getClass();
            ie2.q(s46Var, new sz(fdb.Companion.serializer(), 0), arrayList, uj9Var);
            dxe.r(uj9Var, null);
            n82 n82Var = n82.a;
            if (pvcVar == n82Var) {
                return n82Var;
            }
            return pvcVar;
        } finally {
        }
    }

    private final Object q(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d.f(sye.b(this.d, "app_settings.json"), "app_settings");
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    private final Object r(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d.f(sye.b(this.d, "browser_settings.json"), "browser_settings");
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    private final Object s(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d.f(sye.b(this.d, "image_settings.json"), "image_settings");
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    private final Object t(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d.f(sye.b(this.d, "text_settings.json"), "text_settings");
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    private final Object u(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d.f(sye.b(this.d, "tts_settings.json"), "tts_settings");
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    private final Object v(Object obj) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        this.b = 1;
        s3d.f(sye.b(this.d, "reader_settings.json"), "reader_settings");
        n82 n82Var = n82.a;
        if (pvcVar == n82Var) {
            return n82Var;
        }
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        gn8 gn8Var = this.d;
        s3d s3dVar = this.c;
        switch (i) {
            case 0:
                return new e3d(s3dVar, gn8Var, m42Var, 0);
            case 1:
                return new e3d(s3dVar, gn8Var, m42Var, 1);
            case 2:
                return new e3d(s3dVar, gn8Var, m42Var, 2);
            case 3:
                return new e3d(s3dVar, gn8Var, m42Var, 3);
            case 4:
                return new e3d(s3dVar, gn8Var, m42Var, 4);
            case 5:
                return new e3d(s3dVar, gn8Var, m42Var, 5);
            case 6:
                return new e3d(s3dVar, gn8Var, m42Var, 6);
            case 7:
                return new e3d(s3dVar, gn8Var, m42Var, 7);
            case 8:
                return new e3d(s3dVar, gn8Var, m42Var, 8);
            case 9:
                return new e3d(s3dVar, gn8Var, m42Var, 9);
            case 10:
                return new e3d(s3dVar, gn8Var, m42Var, 10);
            case 11:
                return new e3d(s3dVar, gn8Var, m42Var, 11);
            case 12:
                return new e3d(s3dVar, gn8Var, m42Var, 12);
            case 13:
                return new e3d(s3dVar, gn8Var, m42Var, 13);
            case 14:
                return new e3d(s3dVar, gn8Var, m42Var, 14);
            case 15:
                return new e3d(s3dVar, gn8Var, m42Var, 15);
            case 16:
                return new e3d(s3dVar, gn8Var, m42Var, 16);
            case 17:
                return new e3d(s3dVar, gn8Var, m42Var, 17);
            case 18:
                return new e3d(s3dVar, gn8Var, m42Var, 18);
            case 19:
                return new e3d(s3dVar, gn8Var, m42Var, 19);
            case 20:
                return new e3d(s3dVar, gn8Var, m42Var, 20);
            case 21:
                return new e3d(s3dVar, gn8Var, m42Var, 21);
            case 22:
                return new e3d(s3dVar, gn8Var, m42Var, 22);
            case 23:
                return new e3d(s3dVar, gn8Var, m42Var, 23);
            case 24:
                return new e3d(s3dVar, gn8Var, m42Var, 24);
            case 25:
                return new e3d(s3dVar, gn8Var, m42Var, 25);
            default:
                return new e3d(s3dVar, gn8Var, m42Var, 26);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 8:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 9:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 10:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 11:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 12:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 13:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 14:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 15:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 16:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 17:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 18:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 19:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 20:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 21:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 22:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 23:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 24:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            case 25:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((e3d) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        uj9 uj9Var;
        int i = this.a;
        s3d s3dVar = this.c;
        gn8 gn8Var = this.d;
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
                    this.b = 1;
                    s3d.f(sye.b(gn8Var, "translate_settings.json"), "translate_settings");
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
                    this.b = 1;
                    gk2 gk2Var = s3dVar.a.I;
                    gk2Var.getClass();
                    fo2 fo2Var = fo2.a;
                    mm mmVar = (mm) gk2Var.a;
                    zn2 zn2Var = new zn2(gk2Var, 10);
                    mmVar.getClass();
                    List c = new xla(-1519730247, new String[]{"DbExtension"}, mmVar, "DbExtension.sq", "getAll", "SELECT DbExtension.id, DbExtension.name, DbExtension.author, DbExtension.version, DbExtension.source, DbExtension.path, DbExtension.regex, DbExtension.icon, DbExtension.description, DbExtension.language, DbExtension.type, DbExtension.nsfw, DbExtension.development, DbExtension.draft, DbExtension.encrypt, DbExtension.scriptMetadata, DbExtension.settingMetadata, DbExtension.scriptData, DbExtension.settingData, DbExtension.translateData, DbExtension.pinedAt, DbExtension.lastUse, DbExtension.createAt, DbExtension.updateAt FROM DbExtension", zn2Var).c();
                    ArrayList arrayList = new ArrayList(tl1.s(c, 10));
                    for (Iterator it = c.iterator(); it.hasNext(); it = it) {
                        un2 un2Var = (un2) it.next();
                        un2Var.getClass();
                        arrayList.add(new mcb(un2Var.a, un2Var.b, un2Var.c, un2Var.d, un2Var.e, un2Var.f, un2Var.g, un2Var.h, un2Var.i, un2Var.j, un2Var.k, un2Var.l, un2Var.m, un2Var.n, un2Var.o, un2Var.p, un2Var.q, un2Var.r, un2Var.s, un2Var.t, un2Var.u, un2Var.v, un2Var.w, un2Var.x));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "extensions.json")));
                    try {
                        s46 s46Var = s3dVar.b;
                        s46Var.getClass();
                        ie2.q(s46Var, new sz(mcb.Companion.serializer(), 0), arrayList, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
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
                    this.b = 1;
                    List<mo2> c2 = s3dVar.a.K.h0().c();
                    ArrayList arrayList2 = new ArrayList(tl1.s(c2, 10));
                    for (mo2 mo2Var : c2) {
                        mo2Var.getClass();
                        arrayList2.add(new scb(mo2Var.a, mo2Var.b, mo2Var.c, mo2Var.d, mo2Var.e));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "extension_sources.json")));
                    try {
                        s46 s46Var2 = s3dVar.b;
                        s46Var2.getClass();
                        ie2.q(s46Var2, new sz(scb.Companion.serializer(), 0), arrayList2, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
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
                    lm2 lm2Var = s3dVar.a.J;
                    lm2Var.getClass();
                    xn2 xn2Var = xn2.a;
                    mm mmVar2 = (mm) lm2Var.a;
                    hn2 hn2Var = new hn2(22);
                    mmVar2.getClass();
                    List<vn2> c3 = new xla(1963271785, new String[]{"DbExtensionLocalStorage"}, mmVar2, "DbExtensionLocalStorage.sq", "getAll", "SELECT DbExtensionLocalStorage.id, DbExtensionLocalStorage.extensionId, DbExtensionLocalStorage.key, DbExtensionLocalStorage.content FROM DbExtensionLocalStorage", hn2Var).c();
                    ArrayList arrayList3 = new ArrayList(tl1.s(c3, 10));
                    for (vn2 vn2Var : c3) {
                        vn2Var.getClass();
                        arrayList3.add(new pcb(vn2Var.a, vn2Var.b, vn2Var.c, vn2Var.d));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "extension_local_storages.json")));
                    try {
                        s46 s46Var3 = s3dVar.b;
                        s46Var3.getClass();
                        ie2.q(s46Var3, new sz(pcb.Companion.serializer(), 0), arrayList3, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
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
                    this.b = 1;
                    List<mm2> c4 = s3dVar.a.f.h0().c();
                    ArrayList arrayList4 = new ArrayList(tl1.s(c4, 10));
                    for (mm2 mm2Var : c4) {
                        mm2Var.getClass();
                        arrayList4.add(new fbb(mm2Var.c, mm2Var.a, mm2Var.b));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "categories.json")));
                    try {
                        s46 s46Var4 = s3dVar.b;
                        s46Var4.getClass();
                        ie2.q(s46Var4, new sz(fbb.Companion.serializer(), 0), arrayList4, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 5:
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
                    this.b = 1;
                    lm2 lm2Var2 = s3dVar.a.R;
                    lm2Var2.getClass();
                    mp2 mp2Var = mp2.a;
                    mm mmVar3 = (mm) lm2Var2.a;
                    yo2 yo2Var = new yo2(14);
                    mmVar3.getClass();
                    List<lp2> c5 = new xla(642483352, new String[]{"DbReadHistory"}, mmVar3, "DbReadHistory.sq", "getAll", "SELECT DbReadHistory.id, DbReadHistory.readTime, DbReadHistory.listenTime, DbReadHistory.createAt FROM DbReadHistory", yo2Var).c();
                    ArrayList arrayList5 = new ArrayList(tl1.s(c5, 10));
                    for (lp2 lp2Var : c5) {
                        lp2Var.getClass();
                        arrayList5.add(new sdb(lp2Var.a, lp2Var.b, lp2Var.c, lp2Var.d));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "read_histories.json")));
                    try {
                        s46 s46Var5 = s3dVar.b;
                        s46Var5.getClass();
                        ie2.q(s46Var5, new sz(sdb.Companion.serializer(), 0), arrayList5, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    List c6 = s3dVar.a.F.l0().c();
                    ArrayList arrayList6 = new ArrayList(tl1.s(c6, 10));
                    for (Iterator it2 = c6.iterator(); it2.hasNext(); it2 = it2) {
                        en2 en2Var = (en2) it2.next();
                        en2Var.getClass();
                        arrayList6.add(new ubb(en2Var.a, en2Var.b, en2Var.c, en2Var.d, en2Var.e, en2Var.f, en2Var.g, en2Var.h, en2Var.i, en2Var.j, en2Var.k, en2Var.l));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "downloads.json")));
                    try {
                        s46 s46Var6 = s3dVar.b;
                        s46Var6.getClass();
                        ie2.q(s46Var6, new sz(ubb.Companion.serializer(), 0), arrayList6, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 7:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    lm2 lm2Var3 = s3dVar.a.e;
                    lm2Var3.getClass();
                    jm2 jm2Var = jm2.a;
                    mm mmVar4 = (mm) lm2Var3.a;
                    fm2 fm2Var = new fm2(1);
                    mmVar4.getClass();
                    List<em2> c7 = new xla(1499221264, new String[]{"DbBrowserHistory"}, mmVar4, "DbBrowserHistory.sq", "getAllHistory", "SELECT DbBrowserHistory.url, DbBrowserHistory.title, DbBrowserHistory.createAt FROM DbBrowserHistory\nORDER BY createAt DESC", fm2Var).c();
                    ArrayList arrayList7 = new ArrayList(tl1.s(c7, 10));
                    for (em2 em2Var : c7) {
                        em2Var.getClass();
                        arrayList7.add(new cbb(em2Var.c, em2Var.a, em2Var.b));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "browser_histories.json")));
                    try {
                        s46 s46Var7 = s3dVar.b;
                        s46Var7.getClass();
                        ie2.q(s46Var7, new sz(cbb.Companion.serializer(), 0), arrayList7, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 8:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    lm2 lm2Var4 = s3dVar.a.G;
                    lm2Var4.getClass();
                    rn2 rn2Var = rn2.a;
                    mm mmVar5 = (mm) lm2Var4.a;
                    hn2 hn2Var2 = new hn2(15);
                    mmVar5.getClass();
                    List<on2> c8 = new xla(-1849163392, new String[]{"DbEmoji"}, mmVar5, "DbEmoji.sq", "getAll", "SELECT DbEmoji.id, DbEmoji.category, DbEmoji.url, DbEmoji.lastUse FROM DbEmoji", hn2Var2).c();
                    ArrayList arrayList8 = new ArrayList(tl1.s(c8, 10));
                    for (on2 on2Var : c8) {
                        on2Var.getClass();
                        arrayList8.add(new xbb(on2Var.d, on2Var.a, on2Var.b, on2Var.c));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "emojis.json")));
                    try {
                        s46 s46Var8 = s3dVar.b;
                        s46Var8.getClass();
                        ie2.q(s46Var8, new sz(xbb.Companion.serializer(), 0), arrayList8, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 9:
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    lm2 lm2Var5 = s3dVar.a.H;
                    lm2Var5.getClass();
                    qn2 qn2Var = qn2.a;
                    mm mmVar6 = (mm) lm2Var5.a;
                    hn2 hn2Var3 = new hn2(12);
                    mmVar6.getClass();
                    List<pn2> c9 = new xla(619904542, new String[]{"DbEmojiCategory"}, mmVar6, "DbEmojiCategory.sq", "getAll", "SELECT DbEmojiCategory.id, DbEmojiCategory.thumb, DbEmojiCategory.count, DbEmojiCategory.position\nFROM DbEmojiCategory\nORDER BY position ASC", hn2Var3).c();
                    ArrayList arrayList9 = new ArrayList(tl1.s(c9, 10));
                    for (pn2 pn2Var : c9) {
                        pn2Var.getClass();
                        arrayList9.add(new acb(pn2Var.c, pn2Var.d, pn2Var.a, pn2Var.b));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "emoji_categories.json")));
                    try {
                        s46 s46Var9 = s3dVar.b;
                        s46Var9.getClass();
                        ie2.q(s46Var9, new sz(acb.Companion.serializer(), 0), arrayList9, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 10:
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    lm2 lm2Var6 = s3dVar.a.S;
                    lm2Var6.getClass();
                    pp2 pp2Var = pp2.a;
                    mm mmVar7 = (mm) lm2Var6.a;
                    yo2 yo2Var2 = new yo2(16);
                    mmVar7.getClass();
                    List<np2> c10 = new xla(776422464, new String[]{"DbSearch"}, mmVar7, "DbSearch.sq", "getAll", "SELECT DbSearch.key, DbSearch.createAt FROM DbSearch", yo2Var2).c();
                    ArrayList arrayList10 = new ArrayList(tl1.s(c10, 10));
                    for (np2 np2Var : c10) {
                        np2Var.getClass();
                        arrayList10.add(new reb(np2Var.a, np2Var.b));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "searches.json")));
                    try {
                        s46 s46Var10 = s3dVar.b;
                        s46Var10.getClass();
                        ie2.q(s46Var10, new sz(reb.Companion.serializer(), 0), arrayList10, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 11:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    List<cn2> c11 = s3dVar.a.E.h0().c();
                    ArrayList arrayList11 = new ArrayList(tl1.s(c11, 10));
                    for (cn2 cn2Var : c11) {
                        cn2Var.getClass();
                        arrayList11.add(new rbb(cn2Var.a, cn2Var.b, cn2Var.c, cn2Var.d, cn2Var.e, cn2Var.f, cn2Var.g));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "domains.json")));
                    try {
                        s46 s46Var11 = s3dVar.b;
                        s46Var11.getClass();
                        ie2.q(s46Var11, new sz(rbb.Companion.serializer(), 0), arrayList11, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 12:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    gk2 gk2Var2 = s3dVar.a.V;
                    gk2Var2.getClass();
                    eq2 eq2Var = eq2.a;
                    mm mmVar8 = (mm) gk2Var2.a;
                    aq2 aq2Var = new aq2(gk2Var2, 4);
                    mmVar8.getClass();
                    List<zp2> c12 = new xla(-467145230, new String[]{"DbTrash"}, mmVar8, "DbTrash.sq", "getAll", "SELECT DbTrash.id, DbTrash.bookId, DbTrash.word, DbTrash.type, DbTrash.regex, DbTrash.createAt, DbTrash.updateAt\nFROM DbTrash\nORDER BY createAt ASC", aq2Var).c();
                    ArrayList arrayList12 = new ArrayList(tl1.s(c12, 10));
                    for (zp2 zp2Var : c12) {
                        zp2Var.getClass();
                        String str = zp2Var.a;
                        String str2 = zp2Var.b;
                        String str3 = zp2Var.c;
                        arrayList12.add(new jfb(zp2Var.d, zp2Var.f, zp2Var.g, str, str2, str3, zp2Var.e));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "trashes.json")));
                    try {
                        s46 s46Var12 = s3dVar.b;
                        s46Var12.getClass();
                        ie2.q(s46Var12, new sz(jfb.Companion.serializer(), 0), arrayList12, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 13:
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    lm2 lm2Var7 = s3dVar.a.O;
                    lm2Var7.getClass();
                    zo2 zo2Var = zo2.a;
                    mm mmVar9 = (mm) lm2Var7.a;
                    ao2 ao2Var = new ao2(29);
                    mmVar9.getClass();
                    List<xo2> c13 = new xla(1261311281, new String[]{"DbQtDictionary"}, mmVar9, "DbQtDictionary.sq", "getAll", "SELECT DbQtDictionary.id, DbQtDictionary.name, DbQtDictionary.nameDictionary, DbQtDictionary.vpDictionary, DbQtDictionary.createAt, DbQtDictionary.updateAt\nFROM DbQtDictionary\nORDER BY createAt DESC", ao2Var).c();
                    ArrayList arrayList13 = new ArrayList(tl1.s(c13, 10));
                    for (xo2 xo2Var : c13) {
                        xo2Var.getClass();
                        arrayList13.add(new jdb(xo2Var.a, xo2Var.b, xo2Var.c, xo2Var.d, xo2Var.e, xo2Var.f));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "qt_dictionaries.json")));
                    try {
                        s46 s46Var13 = s3dVar.b;
                        s46Var13.getClass();
                        ie2.q(s46Var13, new sz(jdb.Companion.serializer(), 0), arrayList13, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 14:
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    List<cp2> c14 = s3dVar.a.Q.m0("general").c();
                    ArrayList arrayList14 = new ArrayList(tl1.s(c14, 10));
                    for (cp2 cp2Var : c14) {
                        cp2Var.getClass();
                        arrayList14.add(new pdb(cp2Var.a, cp2Var.c, cp2Var.d, cp2Var.e, cp2Var.f, cp2Var.g, cp2Var.h));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "qt_words.json")));
                    try {
                        s46 s46Var14 = s3dVar.b;
                        s46Var14.getClass();
                        ie2.q(s46Var14, new sz(pdb.Companion.serializer(), 0), arrayList14, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 15:
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    List<ap2> c15 = s3dVar.a.P.h0().c();
                    ArrayList arrayList15 = new ArrayList(tl1.s(c15, 10));
                    for (ap2 ap2Var : c15) {
                        ap2Var.getClass();
                        arrayList15.add(new mdb(ap2Var.c, ap2Var.d, ap2Var.a, ap2Var.b));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "qt_name_skips.json")));
                    try {
                        s46 s46Var15 = s3dVar.b;
                        s46Var15.getClass();
                        ie2.q(s46Var15, new sz(mdb.Companion.serializer(), 0), arrayList15, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return pvcVar;
            case 16:
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    List<oo2> c16 = s3dVar.a.L.i0("general").c();
                    ArrayList arrayList16 = new ArrayList(tl1.s(c16, 10));
                    for (oo2 oo2Var : c16) {
                        oo2Var.getClass();
                        arrayList16.add(new cdb(oo2Var.a, oo2Var.c, oo2Var.d, oo2Var.e, oo2Var.f));
                    }
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "names.json")));
                    try {
                        s46 s46Var16 = s3dVar.b;
                        s46Var16.getClass();
                        ie2.q(s46Var16, new sz(cdb.Companion.serializer(), 0), arrayList16, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                    }
                }
                return pvcVar;
            case 17:
                return o(obj);
            case 18:
                return p(obj);
            case 19:
                int i19 = this.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    String b = l53.b();
                    String c17 = l53.c();
                    l53.d();
                    Object value = ((xe) jy.a.getValue()).b.getValue();
                    value.getClass();
                    String str4 = ((PackageInfo) value).versionName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    vcb vcbVar = new vcb(by5.a.k().b(), b, c17, str4);
                    uj9Var = new uj9(abf.z(qe4.a, sye.b(gn8Var, "manifest.json")));
                    try {
                        s46 s46Var17 = s3dVar.b;
                        s46Var17.getClass();
                        ie2.q(s46Var17, vcb.Companion.serializer(), vcbVar, uj9Var);
                        dxe.r(uj9Var, null);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    } finally {
                    }
                }
                return pvcVar;
            case 20:
                return q(obj);
            case 21:
                return r(obj);
            case 22:
                return s(obj);
            case 23:
                return t(obj);
            case 24:
                return u(obj);
            case 25:
                return v(obj);
            default:
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    s3d.f(sye.b(gn8Var, "qt_settings.json"), "qt_settings");
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
