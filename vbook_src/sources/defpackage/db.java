package defpackage;

import android.content.Intent;
import android.support.v4.media.session.a;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import androidx.media.session.MediaButtonReceiver;
import baidu.lac.jni.LacLib;
import baidu.lac.jni.NativeToken;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db  reason: default package */
/* loaded from: classes3.dex */
public final class db extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                db dbVar = new db((eb) obj2, m42Var, 0);
                dbVar.b = obj;
                return dbVar;
            case 1:
                return new db((lj) this.b, (String) obj2, m42Var, 1);
            case 2:
                return new db((AndroidTextToSpeechService) this.b, (Intent) obj2, m42Var, 2);
            case 3:
                return new db((AndroidTextToSpeechService) this.b, (String) obj2, m42Var, 3);
            case 4:
                return new db((vt4) this.b, (aw7) obj2, m42Var, 4);
            case 5:
                return new db((t61) this.b, (p15) obj2, m42Var, 5);
            case 6:
                return new db((ee1) this.b, (aw7) obj2, m42Var, 6);
            case 7:
                return new db((na5) this.b, (aw7) obj2, m42Var, 7);
            case 8:
                db dbVar2 = new db((fq1) obj2, m42Var, 8);
                dbVar2.b = obj;
                return dbVar2;
            case 9:
                db dbVar3 = new db((ee2) obj2, m42Var, 9);
                dbVar3.b = obj;
                return dbVar3;
            case 10:
                db dbVar4 = new db((ef2) obj2, m42Var, 10);
                dbVar4.b = obj;
                return dbVar4;
            case 11:
                db dbVar5 = new db((xya) obj2, m42Var, 11);
                dbVar5.b = obj;
                return dbVar5;
            case 12:
                db dbVar6 = new db((String) obj2, m42Var, 12);
                dbVar6.b = obj;
                return dbVar6;
            case 13:
                return new db((h93) this.b, (aw7) obj2, m42Var, 13);
            case 14:
                return new db((ied) this.b, (iw2) obj2, m42Var, 14);
            case 15:
                return new db((sk1) this.b, (aw7) obj2, m42Var, 15);
            case 16:
                db dbVar7 = new db((c54) obj2, m42Var, 16);
                dbVar7.b = obj;
                return dbVar7;
            case 17:
                return new db((aw7) this.b, (aw7) obj2, m42Var, 17);
            case 18:
                return new db((vp4) this.b, (String) obj2, m42Var, 18);
            case 19:
                db dbVar8 = new db((ArrayList) obj2, m42Var, 19);
                dbVar8.b = obj;
                return dbVar8;
            case 20:
                return new db((pgd) this.b, (String) obj2, m42Var, 20);
            case 21:
                return new db((e95) this.b, (aw7) obj2, m42Var, 21);
            case 22:
                return new db((zc2) this.b, (ed2) obj2, m42Var, 22);
            case 23:
                db dbVar9 = new db((zc2) obj2, m42Var, 23);
                dbVar9.b = obj;
                return dbVar9;
            case 24:
                return new db((nx0) this.b, (aw7) obj2, m42Var, 24);
            case 25:
                db dbVar10 = new db((vt4) obj2, m42Var, 25);
                dbVar10.b = obj;
                return dbVar10;
            case 26:
                db dbVar11 = new db((rc6) obj2, m42Var, 26);
                dbVar11.b = obj;
                return dbVar11;
            case 27:
                db dbVar12 = new db((l37) obj2, m42Var, 27);
                dbVar12.b = obj;
                return dbVar12;
            case 28:
                return new db((d8) this.b, (String[]) obj2, m42Var, 28);
            default:
                return new db((zwb) this.b, (aw7) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((db) create((List) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 9:
                return ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 11:
                return ((db) create((xya) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                ((db) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 13:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 14:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 15:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 16:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 17:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 18:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 19:
                return ((db) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 21:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 22:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 23:
                return ((db) create((zc2) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 25:
                return ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((db) create((ie6) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                throw null;
            case 28:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((db) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ks3] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object gs9Var;
        Object value2;
        Object value3;
        Object obj2;
        Object gs9Var2;
        Object gs9Var3;
        Object gs9Var4;
        rk9 rk9Var;
        boolean z = true;
        int i = 0;
        String str = null;
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                hre.r(obj);
                cza czaVar = ((eb) this.c).d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, za.a((za) value, false, false, list, null, null, null, null, 247)));
                    return pvc.a;
                }
                return pvc.a;
            case 1:
                Object obj3 = ks3.a;
                hre.r(obj);
                lj ljVar = (lj) this.b;
                ReentrantLock reentrantLock = ljVar.c;
                String str2 = (String) this.c;
                reentrantLock.lock();
                try {
                    if (!ljVar.e) {
                        long j = ljVar.d;
                        if (j == 0) {
                            String str3 = ljVar.b.a;
                            if (str3 != null) {
                                j = LacLib.create(ljVar.a, str3, 1);
                                if (j != 0) {
                                    ljVar.d = j;
                                } else {
                                    throw new IllegalStateException("LacLib.create returned 0 — model load failed");
                                }
                            } else {
                                throw new IllegalArgumentException("LacConfig.modelPath must be set.");
                            }
                        }
                        NativeToken[] analyze = LacLib.analyze(j, str2);
                        if (analyze != null) {
                            obj3 = new ArrayList(analyze.length);
                            int length = analyze.length;
                            while (i < length) {
                                NativeToken nativeToken = analyze[i];
                                obj3.add(new eb6(nativeToken.word, nativeToken.tag));
                                i++;
                            }
                        }
                    }
                    return obj3;
                } finally {
                    reentrantLock.unlock();
                }
            case 2:
                hre.r(obj);
                boolean z2 = AndroidTextToSpeechService.R;
                y57 y57Var = (y57) ((AndroidTextToSpeechService) this.b).F.getValue();
                Intent intent = (Intent) this.c;
                int i2 = MediaButtonReceiver.a;
                if (y57Var != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    mu9 mu9Var = y57Var.b;
                    if (keyEvent != null) {
                        ((a) mu9Var.a).a.dispatchMediaButtonEvent(keyEvent);
                    } else {
                        mu9Var.getClass();
                        vs.m("KeyEvent may not be null");
                        return null;
                    }
                }
                return pvc.a;
            case 3:
                hre.r(obj);
                boolean z3 = AndroidTextToSpeechService.R;
                oo e = ((AndroidTextToSpeechService) this.b).e();
                String str4 = (String) this.c;
                e.getClass();
                str4.getClass();
                e.f = str4;
                synchronized (e.c()) {
                    o48 c = e.c();
                    c.getClass();
                    c.f = o48.c(str4);
                    e.e(e.c(), 6);
                    e.c.a(10001, e.c().b());
                }
                return pvc.a;
            case 4:
                hre.r(obj);
                if (!((ex) ((aw7) this.c).getValue()).a) {
                    ((vt4) this.b).invoke();
                }
                return pvc.a;
            case 5:
                hre.r(obj);
                ((t61) this.b).a = (p15) this.c;
                return pvc.a;
            case 6:
                hre.r(obj);
                aw7 aw7Var = (aw7) this.c;
                if (((Boolean) aw7Var.getValue()).booleanValue()) {
                    ee1 ee1Var = (ee1) this.b;
                    ee1Var.f = 1;
                    ee1Var.D = true;
                    ee1Var.E = false;
                    ee1Var.F.clear();
                    String str5 = ee1Var.C;
                    hk1 a = jdd.a(ee1Var);
                    sw2 sw2Var = ab3.a;
                    ee1Var.f(a, ru2.c, new de1(false, ee1Var, false, str5, null));
                } else {
                    aw7Var.setValue(Boolean.TRUE);
                }
                return pvc.a;
            case 7:
                hre.r(obj);
                ((aw7) this.c).setValue((na5) this.b);
                return pvc.a;
            case 8:
                m82 m82Var = (m82) this.b;
                hre.r(obj);
                fq1 fq1Var = (fq1) this.c;
                cza czaVar2 = fq1Var.E;
                try {
                    gs9Var = axe.s(bue.f(fq1Var.C, fq1Var.G));
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                if (!(gs9Var instanceof gs9)) {
                    List list2 = (List) gs9Var;
                    if (czaVar2 != null) {
                        do {
                            value3 = czaVar2.getValue();
                        } while (!czaVar2.l(value3, eq1.a((eq1) value3, false, false, list2, 3)));
                    }
                }
                Throwable a2 = hs9.a(gs9Var);
                if (a2 != null) {
                    a2.printStackTrace();
                    if (czaVar2 != null) {
                        do {
                            value2 = czaVar2.getValue();
                        } while (!czaVar2.l(value2, eq1.a((eq1) value2, false, false, null, 11)));
                    }
                }
                return pvc.a;
            case 9:
                hre.r(obj);
                ee2 ee2Var = (ee2) this.c;
                AtomicReference atomicReference = ee2Var.b;
                iya v = z87.v((m82) this.b, null, null, new cv0((w26) atomicReference.getAndSet(null), ee2Var, null, 23), 3);
                while (true) {
                    if (!atomicReference.compareAndSet(null, v)) {
                        if (atomicReference.get() != null) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 10:
                m82 m82Var2 = (m82) this.b;
                hre.r(obj);
                ef2 ef2Var = (ef2) this.c;
                z87.v(m82Var2, null, null, new nt0(ef2Var, null, 2), 3);
                z87.v(m82Var2, null, null, new nt0(ef2Var, null, 3), 3);
                z87.v(m82Var2, null, null, new nt0(ef2Var, null, 4), 3);
                return pvc.a;
            case 11:
                hre.r(obj);
                xya xyaVar = (xya) this.b;
                return Boolean.valueOf((!(xyaVar instanceof uf2) || ((uf2) xyaVar).a > ((uf2) ((xya) this.c)).a) ? false : false);
            case 12:
                hre.r(obj);
                ((pv7) this.b).d(s9e.y((String) this.c));
                return pvc.a;
            case 13:
                hre.r(obj);
                h93 h93Var = (h93) this.b;
                String str6 = (String) ((aw7) this.c).getValue();
                str6.getClass();
                if (!c16.i(h93Var.X, str6)) {
                    h93Var.X = str6;
                    w26 w26Var = h93Var.f0;
                    if (w26Var != null) {
                        w26Var.cancel(null);
                    }
                    hk1 a3 = jdd.a(h93Var);
                    sw2 sw2Var2 = ab3.a;
                    h93Var.f0 = h93Var.f(a3, ru2.c, new d93(h93Var, null, 3));
                }
                return pvc.a;
            case 14:
                hre.r(obj);
                ((ied) this.b).f(((Number) ((iw2) this.c).s.getValue()).intValue());
                return pvc.a;
            case 15:
                hre.r(obj);
                aw7 aw7Var2 = (aw7) this.c;
                Iterator it = ((n34) aw7Var2.getValue()).b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (c16.i(((b84) obj2).a, ((n34) aw7Var2.getValue()).a)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                b84 b84Var = (b84) obj2;
                sk1 sk1Var = (sk1) this.b;
                if (b84Var != null) {
                    str = b84Var.b;
                }
                if (str == null) {
                    str = "";
                }
                int length2 = str.length();
                sk1Var.getClass();
                sk1Var.b.setValue(new jub(str, sze.a(length2, length2), 4));
                return pvc.a;
            case 16:
                Collection collection = ks3.a;
                m82 m82Var3 = (m82) this.b;
                hre.r(obj);
                c54 c54Var = (c54) this.c;
                dx dxVar = c54Var.a;
                cza czaVar3 = c54Var.b;
                try {
                    q36 q36Var = r36.d;
                    q36Var.getClass();
                    gs9Var2 = (List) q36Var.a(new sz(c4b.a, 0), (String) dxVar.S.c(dx.W[45], dxVar));
                } catch (Throwable th2) {
                    gs9Var2 = new gs9(th2);
                }
                if (gs9Var2 instanceof gs9) {
                    gs9Var2 = null;
                }
                Collection collection2 = (List) gs9Var2;
                if (collection2 == null) {
                    collection2 = collection;
                }
                czaVar3.getClass();
                czaVar3.n(null, collection2);
                cza czaVar4 = c54Var.c;
                try {
                    q36 q36Var2 = r36.d;
                    q36Var2.getClass();
                    gs9Var3 = (List) q36Var2.a(new sz(c4b.a, 0), (String) dxVar.T.c(dx.W[46], dxVar));
                } catch (Throwable th3) {
                    gs9Var3 = new gs9(th3);
                }
                if (gs9Var3 instanceof gs9) {
                    gs9Var3 = null;
                }
                Collection collection3 = (List) gs9Var3;
                if (collection3 == null) {
                    collection3 = collection;
                }
                czaVar4.getClass();
                czaVar4.n(null, collection3);
                cza czaVar5 = c54Var.d;
                try {
                    q36 q36Var3 = r36.d;
                    q36Var3.getClass();
                    gs9Var4 = (List) q36Var3.a(new sz(xy5.a, 0), (String) dxVar.U.c(dx.W[47], dxVar));
                } catch (Throwable th4) {
                    gs9Var4 = new gs9(th4);
                }
                if (gs9Var4 instanceof gs9) {
                    gs9Var4 = null;
                }
                Collection collection4 = (List) gs9Var4;
                if (collection4 != null) {
                    collection = collection4;
                }
                czaVar5.getClass();
                czaVar5.n(null, collection);
                cza czaVar6 = c54Var.e;
                Boolean bool = (Boolean) dxVar.V.c(dx.W[48], dxVar);
                bool.getClass();
                czaVar6.getClass();
                czaVar6.n(null, bool);
                return pvc.a;
            case 17:
                hre.r(obj);
                ((xt4) ((aw7) this.b).getValue()).invoke(((jub) ((aw7) this.c).getValue()).a.b);
                return pvc.a;
            case 18:
                hre.r(obj);
                i6c i6cVar = ((vp4) this.b).c;
                String str7 = (String) this.c;
                n6c n6cVar = (n6c) i6cVar;
                n6cVar.getClass();
                str7.getClass();
                n6cVar.a.o.e(dx.W[13], str7);
                cza czaVar7 = n6cVar.l;
                czaVar7.getClass();
                czaVar7.n(null, str7);
                return pvc.a;
            case 19:
                hre.r(obj);
                pv7 g = ((pv7) this.b).g();
                ArrayList arrayList = (ArrayList) this.c;
                e49 e49Var = sy4.g;
                ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    arrayList2.add(((GlanceAppWidgetReceiver) obj4).getClass().getName());
                }
                g.e(e49Var, sl1.H0(arrayList2));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj5 = arrayList.get(i);
                    i++;
                    GlanceAppWidgetReceiver glanceAppWidgetReceiver = (GlanceAppWidgetReceiver) obj5;
                    ny4 ny4Var = sy4.d;
                    ny4Var.getClass();
                    String canonicalName = glanceAppWidgetReceiver.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        e49 a4 = ny4.a(ny4Var, canonicalName);
                        glanceAppWidgetReceiver.b();
                        String canonicalName2 = aib.class.getCanonicalName();
                        if (canonicalName2 != null) {
                            g.f(a4, canonicalName2);
                        } else {
                            vs.m("no provider name");
                            return null;
                        }
                    } else {
                        vs.m("no receiver name");
                        return null;
                    }
                }
                return g.h();
            case 20:
                hre.r(obj);
                ((WebView) ((pgd) this.b).d.a).getSettings().setUserAgentString((String) this.c);
                return pvc.a;
            case 21:
                hre.r(obj);
                e95 e95Var = (e95) this.b;
                String str8 = (String) ((aw7) this.c).getValue();
                str8.getClass();
                if (!str8.equals(e95Var.C)) {
                    e95Var.C = str8;
                    LinkedHashMap linkedHashMap = e95Var.G;
                    for (w26 w26Var2 : linkedHashMap.values()) {
                        w26Var2.cancel(null);
                    }
                    linkedHashMap.clear();
                    hk1 a5 = jdd.a(e95Var);
                    sw2 sw2Var3 = ab3.a;
                    e95Var.f(a5, ru2.c, new o54(e95Var, (m42) null, 10));
                }
                return pvc.a;
            case 22:
                hre.r(obj);
                zc2 zc2Var = (zc2) this.b;
                ed2 ed2Var = (ed2) this.c;
                ed2Var.getClass();
                List list3 = ed2Var.e;
                wc2 wc2Var = (wc2) sl1.e0(ed2Var.d);
                if (wc2Var == null) {
                    wc2Var = zc2Var.b;
                }
                wc2Var.getClass();
                zc2Var.j.setValue(wc2Var);
                zc2Var.b = wc2Var;
                e00 e00Var = (e00) sl1.e0(list3);
                if (e00Var != null) {
                    rk9Var = lpe.x(zc2Var.b(), e00Var);
                } else {
                    rk9Var = zc2Var.f;
                }
                zc2Var.g = rk9Var;
                zc2Var.h.setValue(rk9Var);
                if (list3.size() != 1) {
                    z = false;
                }
                zc2Var.l.setValue(Boolean.valueOf(z));
                zc2Var.c = z;
                return pvc.a;
            case 23:
                hre.r(obj);
                if (((zc2) this.b) != ((zc2) this.c)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                hre.r(obj);
                nx0 nx0Var = (nx0) this.b;
                String str9 = ((jub) ((aw7) this.c).getValue()).a.b;
                str9.getClass();
                w26 w26Var3 = nx0Var.f;
                if (w26Var3 != null) {
                    w26Var3.cancel(null);
                }
                hk1 a6 = jdd.a(nx0Var);
                sw2 sw2Var4 = ab3.a;
                nx0Var.f = nx0Var.f(a6, ru2.c, new ba((fdd) nx0Var, str9, (m42) null, 1));
                return pvc.a;
            case 25:
                hre.r(obj);
                d82 q = ((m82) this.b).q();
                vt4 vt4Var = (vt4) this.c;
                try {
                    h7c h7cVar = new h7c();
                    h7cVar.E = k27.t(k27.r(q), true, h7cVar);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h7c.F;
                    while (true) {
                        int i4 = atomicIntegerFieldUpdater.get(h7cVar);
                        if (i4 != 0) {
                            if (i4 != 2 && i4 != 3) {
                                h7c.t(i4);
                                throw null;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(h7cVar, i4, 0)) {
                        }
                    }
                    Object invoke = vt4Var.invoke();
                    h7cVar.s();
                    return invoke;
                } catch (InterruptedException e2) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
                }
            case 26:
                hre.r(obj);
                ie6 ie6Var = (ie6) this.b;
                iw4 iw4Var = (iw4) ie6Var.b(5);
                if (!iw4Var.a.equals(ie6Var)) {
                    iw4Var.c();
                    iw4.d(iw4Var.b, ie6Var);
                }
                rc6 rc6Var = (rc6) this.c;
                he6 he6Var = (he6) iw4Var;
                int p = ((ie6) he6Var.b).p();
                he6Var.c();
                ie6.m((ie6) he6Var.b, p);
                he6Var.c();
                ie6.l((ie6) he6Var.b);
                for (Map.Entry entry : rc6Var.b.entrySet()) {
                    me6 me6Var = (me6) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (rc6Var.e.contains(new Integer(intValue))) {
                        je6 o = ke6.o();
                        o.c();
                        ke6.k((ke6) o.b, me6Var);
                        o.c();
                        ke6.l((ke6) o.b, intValue);
                        he6Var.c();
                        ie6.k((ie6) he6Var.b, (ke6) o.a());
                    }
                }
                return he6Var.a();
            case 27:
                hre.r(obj);
                m82 m82Var4 = (m82) this.b;
                throw null;
            case 28:
                hre.r(obj);
                d8 d8Var = (d8) this.b;
                if (d8Var.a().length() == 0) {
                    String str10 = (String) b00.m0((String[]) this.c);
                    str10.getClass();
                    d8Var.h.setValue(str10);
                }
                return pvc.a;
            default:
                zwb zwbVar = (zwb) this.b;
                hre.r(obj);
                aw7 aw7Var3 = (aw7) this.c;
                if (((String) aw7Var3.getValue()).length() == 0 && !zwbVar.d.isEmpty()) {
                    aw7Var3.setValue(((oc9) sl1.c0(zwbVar.d)).a);
                }
                return pvc.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
    }
}
