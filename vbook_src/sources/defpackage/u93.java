package defpackage;

import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u93  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u93 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u93(uo3 uo3Var, mo3 mo3Var) {
        this.a = 5;
        this.c = uo3Var;
        this.b = mo3Var;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [zl9, java.lang.Object] */
    @Override // defpackage.vt4
    public final Object invoke() {
        dub b;
        Object obj;
        gj6 gj6Var;
        gj6 gj6Var2;
        gj6 gj6Var3;
        long a;
        int i;
        String[] names;
        String str;
        int i2 = 3;
        boolean z = false;
        Http2Stream[] http2StreamArr = null;
        switch (this.a) {
            case 0:
                bic bicVar = (bic) this.b;
                List list = ((uo3) this.c).e().a;
                list.getClass();
                aic aicVar = (aic) bicVar.f.getValue();
                String obj2 = k4b.N0(aicVar.a).toString();
                if (!aicVar.b && obj2.length() != 0) {
                    hk1 a2 = jdd.a(bicVar);
                    sw2 sw2Var = ab3.a;
                    bicVar.f(a2, ru2.c, new bd9(bicVar, list, obj2, null));
                }
                return pvc.a;
            case 1:
                ym0 ym0Var = (ym0) this.b;
                String str2 = ((ar4) this.c).c;
                if (str2 != null && (b = ym0Var.b(str2)) != null) {
                    long r = b23.r(b);
                    frb g = b.g();
                    try {
                        g.c(fxb.g(r) + 1, fxb.f(r) + 1, "/");
                        int g2 = fxb.g(r) + 2;
                        g.g(sze.a(g2, g2));
                        b.b(g);
                    } finally {
                        b.c();
                    }
                }
                return pvc.a;
            case 2:
                Integer num = (Integer) this.c;
                fj6 j = ((kj6) this.b).j();
                j.getClass();
                if (num == null) {
                    return null;
                }
                List list2 = j.k;
                if (list2.isEmpty()) {
                    return null;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((gj6) obj).a == num.intValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                if (((gj6) obj) != null) {
                    return Float.valueOf(gj6Var.p);
                }
                if (num.intValue() <= ((gj6) sl1.c0(list2)).a) {
                    return Float.valueOf(gj6Var2.p);
                }
                if (num.intValue() <= ((gj6) sl1.j0(list2)).a) {
                    return null;
                }
                return Float.valueOf(gj6Var3.p + gj6Var3.q);
            case 3:
                kn6 kn6Var = kn6.e;
                vt4 vt4Var = (vt4) this.c;
                if (((un6) this.b).k().h.compareTo(kn6Var) >= 0) {
                    vt4Var.invoke();
                }
                return pvc.a;
            case 4:
                vt4 vt4Var2 = (vt4) this.c;
                if (((fw7) this.b).Y()) {
                    vt4Var2.invoke();
                }
                return pvc.a;
            case 5:
                ((uo3) this.c).d((mo3) this.b);
                return pvc.a;
            case 6:
                String str3 = (String) sl1.f0(((qg6) this.b).h(), (List) ((aw7) this.c).getValue());
                if (str3 == null) {
                    return "";
                }
                return str3;
            case 7:
                Enum[] enumArr = (Enum[]) ((ru3) this.b).b;
                ou3 ou3Var = new ou3((String) this.c, enumArr.length);
                for (Enum r3 : enumArr) {
                    ou3Var.k(r3.name(), false);
                }
                return ou3Var;
            case 8:
                ((xt4) this.b).invoke((g14) this.c);
                return pvc.a;
            case 9:
                tc4.r((cz7) this.b, ((l54) this.c).e);
                return pvc.a;
            case 10:
                e13 e13Var = (e13) this.b;
                l54 l54Var = (l54) this.c;
                String str4 = l54Var.a;
                String str5 = l54Var.b;
                e13Var.getClass();
                str4.getClass();
                str5.getClass();
                e13Var.b.setValue(str4);
                e13Var.c.setValue(str5);
                e13Var.a(true);
                return pvc.a;
            case 11:
                i44 i44Var = (i44) this.b;
                hk1 a3 = jdd.a(i44Var);
                sw2 sw2Var2 = ab3.a;
                i44Var.f(a3, ru2.c, new gx(i44Var, !((l54) this.c).q, (m42) null, 3));
                return pvc.a;
            case 12:
                r54 r54Var = (r54) this.c;
                ((lu4) this.b).invoke(r54Var.a, r54Var.b);
                return pvc.a;
            case 13:
                ((xt4) this.b).invoke(((r54) this.c).a);
                return pvc.a;
            case 14:
                ((FirebaseAuth) ((mce) this.b).a).c.remove((rf4) this.c);
                return pvc.a;
            case 15:
                ((zl9) this.b).a = nye.q((mn4) this.c, mv8.a);
                return pvc.a;
            case 16:
                ((xt4) this.b).invoke(Boolean.valueOf(!((qn4) this.c).g));
                return pvc.a;
            case 17:
                xt4 xt4Var = (xt4) this.b;
                if (((rj8) this.c).k() == 0) {
                    z = true;
                }
                xt4Var.invoke(Boolean.valueOf(z));
                return pvc.a;
            case 18:
                rq4 rq4Var = (rq4) this.b;
                String str6 = (String) ((aw7) this.c).getValue();
                str6.getClass();
                hk1 a4 = jdd.a(rq4Var);
                sw2 sw2Var3 = ab3.a;
                rq4Var.f(a4, ru2.c, new qq4(rq4Var, str6, null, 0));
                return pvc.a;
            case 19:
                ls7 ls7Var = (ls7) this.c;
                ((rv4) this.b).G(ls7Var.a, ls7Var.g, ls7Var.b, true);
                return pvc.a;
            case 20:
                xw4 xw4Var = (xw4) this.c;
                ((lu4) this.b).invoke(xw4Var.a, xw4Var.b);
                return pvc.a;
            case 21:
                w65 w65Var = (w65) this.b;
                hk1 a5 = jdd.a(w65Var);
                sw2 sw2Var4 = ab3.a;
                w65Var.f(a5, ru2.c, new u65(w65Var, null, 2));
                ((aw7) this.c).setValue(Boolean.FALSE);
                return pvc.a;
            case 22:
                ((xt4) this.b).invoke(Integer.valueOf(((uia) this.c).a));
                return pvc.a;
            case 23:
                ((j34) this.b).invoke((String) this.c);
                return pvc.a;
            case 24:
                Http2Connection http2Connection = (Http2Connection) this.b;
                Http2Stream http2Stream = (Http2Stream) this.c;
                try {
                    http2Connection.a.b(http2Stream);
                } catch (IOException e) {
                    Platform platform = Platform.a;
                    Platform.a.j(4, "Http2Connection.Listener failure for " + http2Connection.c, e);
                    try {
                        http2Stream.e(ErrorCode.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return pvc.a;
            case 25:
                Settings settings = (Settings) this.c;
                ?? obj3 = new Object();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.S) {
                    synchronized (http2Connection2) {
                        Settings settings2 = http2Connection2.N;
                        Settings settings3 = new Settings();
                        settings2.getClass();
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & settings2.a) != 0) {
                                settings3.b(i3, settings2.b[i3]);
                            }
                        }
                        for (int i4 = 0; i4 < 10; i4++) {
                            if (((1 << i4) & settings.a) != 0) {
                                settings3.b(i4, settings.b[i4]);
                            }
                        }
                        obj3.a = settings3;
                        a = settings3.a() - settings2.a();
                        i = (a > 0L ? 1 : (a == 0L ? 0 : -1));
                        if (i != 0 && !http2Connection2.b.isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection2.b.values().toArray(new Http2Stream[0]);
                        }
                        Settings settings4 = (Settings) obj3.a;
                        settings4.getClass();
                        http2Connection2.N = settings4;
                        TaskQueue.c(http2Connection2.F, http2Connection2.c + " onSettings", 0L, new u93(26, http2Connection2, obj3), 6);
                    }
                    try {
                        http2Connection2.S.o((Settings) obj3.a);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection2.o(errorCode, errorCode, e2);
                    }
                }
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream2 : http2StreamArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.e += a;
                            if (i > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                    }
                }
                return pvc.a;
            case 26:
                Http2Connection http2Connection3 = (Http2Connection) this.b;
                http2Connection3.a.a(http2Connection3, (Settings) ((zl9) this.c).a);
                return pvc.a;
            case 27:
                ur5 ur5Var = (ur5) this.b;
                int i5 = ((dm5) ((aw7) this.c).getValue()).e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 3) {
                            i2 = 0;
                        } else {
                            i2 = 4;
                        }
                    }
                } else {
                    i2 = 1;
                }
                ur5Var.getClass();
                hk1 a6 = jdd.a(ur5Var);
                sw2 sw2Var5 = ab3.a;
                ur5Var.f(a6, ru2.c, new hr5(ur5Var, i2, null, 1));
                return pvc.a;
            case 28:
                ((aw7) this.c).setValue(Boolean.FALSE);
                ((ja0) this.b).j();
                return pvc.a;
            default:
                o9a o9aVar = (o9a) this.b;
                r36 r36Var = (r36) this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                a46 a46Var = r36Var.a;
                z46.d(r36Var, o9aVar);
                int f = o9aVar.f();
                for (int i6 = 0; i6 < f; i6++) {
                    List h = o9aVar.h(i6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : h) {
                        if (obj4 instanceof y46) {
                            arrayList.add(obj4);
                        }
                    }
                    y46 y46Var = (y46) sl1.s0(arrayList);
                    if (y46Var != null && (names = y46Var.names()) != null) {
                        for (String str7 : names) {
                            if (c16.i(o9aVar.e(), t9a.f)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str7)) {
                                linkedHashMap.put(str7, Integer.valueOf(i6));
                            } else {
                                throw new q46(am8.z("The suggested name '" + str7 + "' for " + str + ' ' + o9aVar.g(i6) + " is already one of the names for " + str + ' ' + o9aVar.g(((Number) o17.p(str7, linkedHashMap)).intValue()) + " in " + o9aVar, -1, null, null, null));
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return ls3.a;
                }
                return linkedHashMap;
        }
    }

    public /* synthetic */ u93(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ u93(un6 un6Var, vt4 vt4Var) {
        this.a = 3;
        this.b = un6Var;
        this.c = vt4Var;
    }
}
