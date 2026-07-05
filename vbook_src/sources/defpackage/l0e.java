package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l0e  reason: default package */
/* loaded from: classes.dex */
public abstract class l0e {
    public static final tu1 a = new tu1(new nv1(17), false, -51699941);
    public static final String[] b = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] c = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] d = {"items"};
    public static final String[] e = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", ES6Iterator.VALUE_PROPERTY, "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static void A(zma zmaVar, byte[] bArr) {
        int length = bArr.length;
        zmaVar.getClass();
        bArr.getClass();
        zmaVar.n(bArr, length);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.h0e D() {
        /*
            java.lang.String r0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            java.lang.Class<l0e> r1 = defpackage.l0e.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<h0e> r2 = defpackage.h0e.class
            boolean r3 = r2.equals(r2)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L13
            goto L2f
        L13:
            java.lang.Class r0 = java.lang.Class.forName(r0, r4, r1)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.reflect.Constructor r0 = r0.getConstructor(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            java.lang.Object r0 = r0.newInstance(r5)     // Catch: java.lang.ReflectiveOperationException -> L28
            if (r0 != 0) goto L22
            throw r5
        L22:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.ReflectiveOperationException -> L28
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L28
            throw r0     // Catch: java.lang.ReflectiveOperationException -> L28
        L28:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.ClassNotFoundException -> L2f
            r1.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            throw r1     // Catch: java.lang.ClassNotFoundException -> L2f
        L2f:
            r1 = 0
            l0e[] r0 = new defpackage.l0e[r1]     // Catch: java.lang.Throwable -> La4
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L75
            int r0 = r6.size()
            if (r0 != r4) goto L52
            java.lang.Object r0 = r6.get(r1)
            h0e r0 = (defpackage.h0e) r0
            return r0
        L52:
            int r0 = r6.size()
            if (r0 != 0) goto L59
            return r5
        L59:
            java.lang.String r0 = "combine"
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.reflect.Method r0 = r2.getMethod(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object[] r1 = new java.lang.Object[]{r6}     // Catch: java.lang.ReflectiveOperationException -> L70
            java.lang.Object r0 = r0.invoke(r5, r1)     // Catch: java.lang.ReflectiveOperationException -> L70
            h0e r0 = (defpackage.h0e) r0     // Catch: java.lang.ReflectiveOperationException -> L70
            return r0
        L70:
            r0 = move-exception
            defpackage.p1a.n(r0)
            return r5
        L75:
            java.lang.Object r0 = r3.next()     // Catch: java.util.ServiceConfigurationError -> L84
            if (r0 != 0) goto L7c
            throw r5
        L7c:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.util.ServiceConfigurationError -> L84
            r0.<init>()     // Catch: java.util.ServiceConfigurationError -> L84
            throw r0     // Catch: java.util.ServiceConfigurationError -> L84
        L82:
            r12 = r0
            goto L86
        L84:
            r0 = move-exception
            goto L82
        L86:
            java.lang.Class<g0e> r0 = defpackage.g0e.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r7 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r10 = "load"
            java.lang.String r9 = "Unable to load "
            java.lang.String r11 = r9.concat(r0)
            java.lang.String r9 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            r7.logp(r8, r9, r10, r11, r12)
            goto L3f
        La4:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0e.D():h0e");
    }

    public static final void a(String str, int i, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(505962160);
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i4 = i2 | i3;
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            tza tzaVar = j27.a;
            v72 v72Var = ((h27) rv4Var2.j(tzaVar)).c.b;
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(kq7Var, v72Var);
            if ((i4 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new ge5(25, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 A = zbe.A(lbe.f(15, (vt4) P, k, null, false), 4.0f, nae.e, 2);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.k;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            cvb.c(str, zbe.y(pu0Var.a(kq7Var, nk0Var), 4.0f), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var2, 6, 0, 131064);
            if (i > 0) {
                rv4Var2.e0(-964300540);
                cvb.c(String.valueOf(i), pu0Var.a(kq7Var, kh5.c), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.o, rv4Var2, 0, 0, 131064);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var2;
                rv4Var2.e0(-964056136);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new fg7(str, i, vt4Var, i2, 0);
        }
    }

    public static final void b(boolean z, String str, String str2, t86 t86Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        p1a p1aVar = hq7.T;
        q86 q86Var = q86.c;
        rv4Var.g0(263665226);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(str)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(str2)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(p1aVar)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(t86Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(q86Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        boolean z3 = false;
        if ((4793491 & i11) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            if ((i11 & 896) == 256) {
                z3 = true;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                int length = str2.length();
                P = yae.z(new jub(str2, sze.a(length, length), 4));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            xb.d(z, xt4Var, jce.E(-859233890, new yd7(2, xt4Var2, xt4Var, aw7Var, str2), rv4Var), null, mwe.x(kq7.a, 14), jce.E(1473172257, new zd7(2, xt4Var, aw7Var, str2), rv4Var), jce.E(-612670558, new jd1(str, 28), rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(-1362899466, new f58(aw7Var, t86Var), rv4Var), rv4Var, (i11 & 14) | 1769856 | ((i11 >> 15) & Token.ASSIGN_MOD), 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sg1(z, str, str2, t86Var, xt4Var, xt4Var2, i);
        }
    }

    public static final void c(io3 io3Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        io3Var.getClass();
        nu4Var.getClass();
        rv4Var.g0(984946548);
        if (rv4Var.f(io3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(nu4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            boolean booleanValue = ((Boolean) io3Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new ag7(io3Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(1718871752, new dg7(io3Var, nu4Var), rv4Var), null, x, jce.E(-1997301941, new bg7(io3Var, 1), rv4Var), pye.b, null, 0L, 0L, nae.e, false, false, jce.E(-1777087712, new bg7(io3Var, 2), rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dg7(io3Var, nu4Var, i);
        }
    }

    public static final void d(int i, tu1 tu1Var, tu1 tu1Var2, xt4 xt4Var, rv4 rv4Var, boolean z) {
        int i2;
        boolean z2;
        int i3;
        rv4Var.g0(1770091892);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i4 |= i3;
        }
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-800687009);
                g(i4 & 8190, tu1Var, tu1Var2, xt4Var, rv4Var, z);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-800475682);
                f(i4 & 8190, tu1Var, tu1Var2, xt4Var, rv4Var, z);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nh7(z, tu1Var, tu1Var2, xt4Var, i, 5);
        }
    }

    public static final void e(boolean z, omb ombVar, String str, Set set, List list, List list2, xt4 xt4Var, vt4 vt4Var, lu4 lu4Var, xt4 xt4Var2, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        int i12;
        boolean z2;
        ombVar.getClass();
        str.getClass();
        set.getClass();
        list.getClass();
        list2.getClass();
        xt4Var.getClass();
        vt4Var.getClass();
        lu4Var.getClass();
        xt4Var2.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        xt4Var6.getClass();
        rv4Var.g0(1568615471);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        char c3 = ' ';
        if (rv4Var.f(ombVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i14 = i13 | i3;
        if (rv4Var.f(str)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i15 = i14 | i4;
        char c4 = 1024;
        if (rv4Var.f(set)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i16 = i15 | i5;
        char c5 = 8192;
        if (rv4Var.f(list)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i17 = i16 | i6;
        char c6 = 0;
        if (rv4Var.f(list2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i18 = i17 | i7;
        char c7 = 0;
        if (rv4Var.h(xt4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i19 = i18 | i8;
        if (rv4Var.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i20 = i19 | i9;
        if (rv4Var.h(lu4Var)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i21 = i20 | i10;
        if (rv4Var.h(xt4Var2)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i22 = i21 | i11;
        if (rv4Var.h(vt4Var2)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (!rv4Var.h(vt4Var3)) {
            c3 = 16;
        }
        int i23 = c2 | c3;
        if (rv4Var.h(vt4Var4)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i24 = i23 | i12;
        if (rv4Var.h(xt4Var3)) {
            c4 = 2048;
        }
        int i25 = i24 | c4;
        if (rv4Var.h(xt4Var4)) {
            c5 = 16384;
        }
        int i26 = i25 | c5;
        if (rv4Var.h(xt4Var5)) {
            c6 = 0;
        }
        int i27 = i26 | c6;
        if (rv4Var.h(xt4Var6)) {
            c7 = 0;
        }
        int i28 = i27 | c7;
        if ((i22 & 306783379) == 306783378 && (599187 & i28) == 599186) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i22 & 1, z2)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new k24(14);
                rv4Var.o0(P);
            }
            d((i22 & 14) | 432 | ((i22 >> 9) & 7168), jce.E(1385565873, new bn7((Object) ombVar, vt4Var, vt4Var2, vt4Var3, vt4Var4, xt4Var6, 9), rv4Var), jce.E(-68759408, new sh7(list, list2, uj8.b(0, (vt4) P, rv4Var, 384, 3), str, set, lu4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, 1), rv4Var), xt4Var, rv4Var, z);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zh7(z, ombVar, str, set, list, list2, xt4Var, vt4Var, lu4Var, xt4Var2, vt4Var2, vt4Var3, vt4Var4, xt4Var3, xt4Var4, xt4Var5, xt4Var6, i);
        }
    }

    public static final void f(int i, tu1 tu1Var, tu1 tu1Var2, xt4 xt4Var, rv4 rv4Var, boolean z) {
        int i2;
        boolean z2;
        int i3;
        rv4Var.g0(140711235);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i4 |= i3;
        }
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            nmd.f(z, xt4Var, null, false, 0L, 0L, nae.e, 0L, nae.e, jce.E(2075276338, new mh7(tu1Var, tu1Var2, 2), rv4Var), rv4Var, (i4 & 14) | 805309440 | ((i4 >> 6) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nh7(z, tu1Var, tu1Var2, xt4Var, i, 3);
        }
    }

    public static final void g(int i, tu1 tu1Var, tu1 tu1Var2, xt4 xt4Var, rv4 rv4Var, boolean z) {
        int i2;
        boolean z2;
        int i3;
        rv4Var.g0(738123157);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i4 |= i3;
        }
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            hc2.b(pna.c, null, jce.E(-1522105749, new qh7(z, xt4Var, tu1Var, tu1Var2, 2), rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nh7(z, tu1Var, tu1Var2, xt4Var, i, 4);
        }
    }

    public static final void h(final ar5 ar5Var, final String str, final String str2, final nq7 nq7Var, long j, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        final long j2;
        long j3;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        ar5Var.getClass();
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        rv4Var2.g0(944462630);
        if (rv4Var2.f(ar5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var2.f(str2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var2.f(nq7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5 | 8192;
        if ((i & 196608) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i11 |= i7;
        }
        if ((74899 & i11) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            rv4Var2.Z();
            if ((i & 1) != 0 && !rv4Var2.B()) {
                rv4Var2.X();
                i6 = i11 & (-57345);
                j3 = j;
            } else {
                j3 = ((h27) rv4Var2.j(j27.a)).a.q;
                i6 = i11 & (-57345);
            }
            rv4Var2.r();
            kq7 kq7Var = kq7.a;
            nq7 a0 = lbe.f(15, vt4Var, kq7Var, null, false).a0(nq7Var);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            long j4 = j3;
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            int i12 = i6 >> 3;
            int i13 = i6;
            nk5.a(ar5Var, null, pna.n(kq7Var, 24.0f), j4, rv4Var2, (i6 & 14) | 432, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 16.0f));
            nq7 e2 = rs8.e(1.0f, pna.f(kq7Var, 1.0f), true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, e2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            int i14 = i13 >> 6;
            cvb.c(str, f, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, (i12 & 14) | 48, 24576, 114680);
            rv4Var2 = rv4Var;
            if (str2.length() > 0) {
                rv4Var2.e0(-602467886);
                cvb.c(str2, null, zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, i14 & 14, 24960, 109562);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-602131102);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
            j2 = j4;
        } else {
            rv4Var2.X();
            j2 = j;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: c49
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l0e.h(ar5.this, str, str2, nq7Var, j2, vt4Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(String str, String str2, nq7 nq7Var, boolean z, boolean z2, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        xt4Var.getClass();
        rv4Var2.g0(-1367444156);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.g(z2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((73875 & i2) != 73874) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i2 & 1, z3)) {
            if ((458752 & i2) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((57344 & i2) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = z5 | z6;
            Object P = rv4Var2.P();
            if (z7 || P == ax1.a) {
                P = new up0(17, xt4Var, z2);
                rv4Var2.o0(P);
            }
            kq7 kq7Var = kq7.a;
            nq7 a0 = lbe.f(15, (vt4) P, kq7Var, null, false).a0(nq7Var);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            we6 f = s21.f(rv4Var2, p, npVar4, 1.0f, true);
            int i8 = i2;
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            cvb.c(str, f2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, (i8 & 14) | 48, 24576, 114684);
            rv4Var2 = rv4Var;
            if (str2.length() > 0) {
                rv4Var2.e0(-1880926286);
                cvb.c(str2, null, zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, (i8 >> 3) & 14, 0, 131066);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1880705256);
                rv4Var2.q(false);
            }
            s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            ase.b(z2, null, null, false, null, rv4Var2, ((i8 >> 12) & 14) | 48);
            rv4Var2.q(true);
            z4 = true;
        } else {
            rv4Var2.X();
            z4 = z;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new sb3(str, str2, nq7Var, z4, z2, xt4Var, i);
        }
    }

    public static final void j(String str, List list, int i, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        list.getClass();
        xt4Var.getClass();
        rv4Var2.g0(-1064869317);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.d(i)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new ao7(aw7Var, 17);
                rv4Var2.o0(P2);
            }
            kq7 kq7Var = kq7.a;
            nq7 a0 = lbe.f(15, (vt4) P2, kq7Var, null, false).a0(nq7Var);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            int i9 = i3;
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            we6 f = s21.f(rv4Var2, p2, npVar4, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            cvb.c(str, f2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, (i9 & 14) | 48, 24576, 114684);
            cvb.c((String) list.get(dce.n(i, 0, list.size() - 1)), null, zl1.b(0.5f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, 0, 0, 131066);
            s21.x(rv4Var, true, kq7Var, 8.0f, rv4Var);
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var, 0), null, pna.n(kq7Var, 24.0f), 0L, rv4Var, 432, 8);
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new ao7(aw7Var, 18);
                rv4Var.o0(P3);
            }
            iue.e(booleanValue, null, 0L, kq7Var, nae.e, null, (vt4) P3, jce.E(708221237, new qm7(list, i, xt4Var, aw7Var, 2), rv4Var), rv4Var, 14158848, 54);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new xj7(i, i2, xt4Var, nq7Var, str, list);
        }
    }

    public static final void k(String str, String str2, ted tedVar, t86 t86Var, q86 q86Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        p1a p1aVar;
        q86 q86Var2;
        String str3;
        int i5;
        int i6;
        str.getClass();
        str2.getClass();
        xt4Var.getClass();
        rv4Var.g0(-1485382870);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.f(t86Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i8 |= i6;
        }
        int i9 = i8 | 24576;
        if ((196608 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i9 |= i5;
        }
        if (rv4Var.h(xt4Var)) {
            i4 = 1048576;
        } else {
            i4 = 524288;
        }
        int i10 = i9 | i4;
        if ((599187 & i10) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            p1a p1aVar2 = hq7.T;
            q86 q86Var3 = q86.c;
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = new sc8(28);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            rv4Var.e0(-1523780163);
            if (str2.length() == 0) {
                str3 = yqe.A((y3b) o2b.w.getValue(), rv4Var);
            } else {
                str3 = str2;
            }
            rv4Var.q(false);
            boolean f = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f || P2 == obj) {
                P2 = new ao7(aw7Var, 16);
                rv4Var.o0(P2);
            }
            int i11 = i10 << 3;
            l(null, str, str3, nq7Var, (vt4) P2, rv4Var, ((i10 >> 6) & 7168) | (i11 & Token.ASSIGN_MOD), 1);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            boolean f2 = rv4Var.f(aw7Var);
            Object P3 = rv4Var.P();
            if (f2 || P3 == obj) {
                P3 = new qo7(aw7Var, 14);
                rv4Var.o0(P3);
            }
            b(booleanValue, str, str2, t86Var, (xt4) P3, xt4Var, rv4Var, i11 & 29884400);
            p1aVar = p1aVar2;
            q86Var2 = q86Var3;
        } else {
            rv4Var.X();
            p1aVar = tedVar;
            q86Var2 = q86Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i81(str, str2, p1aVar, t86Var, q86Var2, nq7Var, xt4Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.ar5 r53, java.lang.String r54, java.lang.String r55, defpackage.nq7 r56, defpackage.vt4 r57, defpackage.rv4 r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0e.l(ar5, java.lang.String, java.lang.String, nq7, vt4, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.lang.String r50, java.lang.String r51, final defpackage.nq7 r52, boolean r53, final boolean r54, final defpackage.xt4 r55, defpackage.rv4 r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0e.m(java.lang.String, java.lang.String, nq7, boolean, boolean, xt4, rv4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static final void n(ar5 ar5Var, final String str, final String str2, final nq7 nq7Var, boolean z, final boolean z2, final xt4 xt4Var, rv4 rv4Var, final int i, final int i2) {
        Object obj;
        int i3;
        int i4;
        boolean z3;
        final boolean z4;
        final ar5 ar5Var2;
        ar5 ar5Var3;
        boolean z5;
        boolean z6;
        int i5;
        ar5 ar5Var4;
        np npVar;
        kq7 kq7Var;
        np npVar2;
        kg kgVar;
        np npVar3;
        np npVar4;
        ?? r15;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4 rv4Var2 = rv4Var;
        xt4Var.getClass();
        rv4Var2.g0(1039563508);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            obj = ar5Var;
        } else if ((i & 6) == 0) {
            Object obj2 = ar5Var;
            if (rv4Var2.f(obj2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
            obj = obj2;
        } else {
            obj = ar5Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(str2)) {
                i9 = 256;
            } else {
                i9 = Token.CASE;
            }
            i3 |= i9;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.g(z2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((590995 & i3) != 590994) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i3 & 1, z3)) {
            if (i11 != 0) {
                ar5Var3 = null;
            } else {
                ar5Var3 = obj;
            }
            if ((3670016 & i3) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((458752 & i3) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7 = z5 | z6;
            Object P = rv4Var2.P();
            if (z7 || P == ax1.a) {
                P = new up0(19, xt4Var, z2);
                rv4Var2.o0(P);
            }
            kq7 kq7Var2 = kq7.a;
            nq7 a0 = lbe.f(15, (vt4) P, kq7Var2, null, false).a0(nq7Var);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar5 = qw1.f;
            jce.F(npVar5, rv4Var2, a2);
            np npVar6 = qw1.e;
            jce.F(npVar6, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar7 = qw1.g;
            jce.F(npVar7, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar8 = qw1.d;
            jce.F(npVar8, rv4Var2, p);
            if (ar5Var3 != null) {
                rv4Var2.e0(-1654385289);
                i5 = i3;
                kq7Var = kq7Var2;
                kgVar = kgVar2;
                npVar = npVar8;
                r15 = 0;
                npVar3 = npVar7;
                npVar2 = npVar5;
                npVar4 = npVar6;
                nk5.a(ar5Var3, null, pna.n(kq7Var2, 24.0f), ((zl1) rv4Var2.j(r12.a)).a, rv4Var2, (i3 & 14) | 432, 0);
                ar5Var4 = ar5Var3;
                rv4Var2 = rv4Var2;
                rs8.v(kq7Var, 16.0f, rv4Var2, false);
            } else {
                i5 = i3;
                ar5Var4 = ar5Var3;
                npVar = npVar8;
                kq7Var = kq7Var2;
                npVar2 = npVar5;
                kgVar = kgVar2;
                npVar3 = npVar7;
                npVar4 = npVar6;
                r15 = 0;
                rv4Var2.e0(-1654121014);
                rv4Var2.q(false);
            }
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, r15);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar2, rv4Var2, a3);
            jce.F(npVar4, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar, rv4Var2, p2);
            nq7 f = pna.f(kq7Var, 1.0f);
            tza tzaVar = j27.a;
            boolean z8 = r15;
            cvb.c(str, f, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, oyb.a(((h27) rv4Var2.j(tzaVar)).b.j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, ((i5 >> 3) & 14) | 48, 24576, 114684);
            rv4Var2 = rv4Var;
            if (str2.length() > 0) {
                rv4Var2.e0(-1147608946);
                cvb.c(str2, null, zl1.b(0.5f, ((zl1) rv4Var2.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var2, (i5 >> 6) & 14, 0, 131066);
                rv4Var2 = rv4Var2;
                rv4Var2.q(z8);
            } else {
                rv4Var2.e0(-1147387916);
                rv4Var2.q(z8);
            }
            s21.x(rv4Var2, true, kq7Var, 8.0f, rv4Var2);
            tte.g(z2, false, null, null, rv4Var2, ((i5 >> 15) & 14) | 3072, 6);
            rv4Var2.q(true);
            z4 = true;
            ar5Var2 = ar5Var4;
        } else {
            rv4Var2.X();
            z4 = z;
            ar5Var2 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: d49
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    l0e.n(ar5.this, str, str2, nq7Var, z4, z2, xt4Var, (rv4) obj3, xoe.p(i | 1), i2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void o(String str, boolean z, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long g;
        boolean z3;
        rv4Var.g0(1947045250);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            if (z) {
                rv4Var.e0(891892676);
                g = zl1.b(0.2f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(891989985);
                g = rm1.g(((h27) rv4Var.j(j27.a)).a, 1.0f);
                rv4Var.q(false);
            }
            ba5 ba5Var = lre.g;
            kq7 kq7Var = kq7.a;
            nq7 v = nmd.v(kq7Var, g, ba5Var);
            if ((i7 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = new ge5(24, vt4Var);
                rv4Var.o0(P);
            }
            nq7 z4 = zbe.z(lbe.f(15, (vt4) P, v, null, false), 8.0f, 4.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z4);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tza tzaVar = j27.a;
            cvb.c(str, pu0.a.a(kq7Var, kh5.e), ((h27) rv4Var.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, i7 & 14, 0, 131064);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new eg7(i, 0, vt4Var, str, z);
        }
    }

    public static final cna p(int i, int i2) {
        xpe.b(i);
        w63 w63Var = new w63(i);
        xpe.b(i2);
        return new cna(w63Var, new w63(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x034e, code lost:
        if (r15 == r14) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(java.lang.String r45, java.util.List r46, java.util.Set r47, defpackage.th8 r48, defpackage.nq7 r49, defpackage.lu4 r50, defpackage.xt4 r51, defpackage.rv4 r52, int r53) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0e.q(java.lang.String, java.util.List, java.util.Set, th8, nq7, lu4, xt4, rv4, int):void");
    }

    public static final void r(m82 m82Var, aw7 aw7Var, kj6 kj6Var, int i) {
        if (i >= 0 && i < ((List) aw7Var.getValue()).size()) {
            z87.v(m82Var, null, null, new qm5(kj6Var, i, (m42) null, 4), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final void s(omb ombVar, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        omb ombVar2;
        boolean z2;
        float f;
        zx1 zx1Var;
        np npVar;
        kg kgVar;
        np npVar2;
        float f2;
        ba5 ba5Var;
        lh9 lh9Var;
        ?? r2;
        kq7 kq7Var;
        lh9 lh9Var2;
        float f3;
        kq7 kq7Var2;
        boolean z3;
        boolean z4;
        vt4 vt4Var5;
        wk3 wk3Var;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        lh9 lh9Var3;
        Object obj = vt4Var3;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var2 = lre.g;
        rv4Var2.g0(-126655026);
        if (rv4Var2.f(ombVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i9 = i8 | i3;
        if (rv4Var2.h(vt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (rv4Var2.h(obj)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (rv4Var2.h(vt4Var4)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i12 = i11 | i6;
        if (rv4Var2.h(xt4Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i13 = i12 | i7;
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i13 & 1, z)) {
            nq7 C = zbe.C(nq7Var, 24.0f, nae.e, 24.0f, nae.e, 10);
            mk0 mk0Var = kh5.F;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, C);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var2, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var2, p);
            String str = ombVar.a;
            String str2 = ombVar.b;
            boolean z9 = ombVar.q;
            String str3 = ombVar.d;
            String str4 = ombVar.e;
            u22 u22Var = r0f.d;
            kq7 kq7Var3 = kq7.a;
            nq7 h = pna.h(pna.s(kq7Var3, 50.0f), 75.0f);
            boolean z10 = !ombVar.o;
            if ((i13 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var4 = ax1.a;
            if (z2 || P == lh9Var4) {
                P = new on7(6, vt4Var);
                rv4Var2.o0(P);
            }
            do5.c(str, str2, str3, str4, u22Var, tte.k(q1d.b(h, z10, nae.e, (vt4) P, 2), r0f.z(rv4Var2).a), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.s(kq7Var3, 12.0f));
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            we6 we6Var = new we6(f, true);
            xn1 a3 = wn1.a(lz.e, kh5.I, rv4Var2, 6);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            zx1 zx1Var3 = zx1Var;
            jce.F(npVar3, rv4Var2, a3);
            jce.F(npVar4, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar5, rv4Var2, kgVar2);
            jce.F(npVar6, rv4Var2, p2);
            float f4 = 1.0f;
            int i14 = i13;
            cvb.c(str2, pna.f(kq7Var3, 1.0f), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).j, rv4Var, 48, 24960, 109560);
            nq7 f5 = pna.f(kq7Var3, 1.0f);
            gv9 a4 = ev9.a(dzVar, kh5.G, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f5);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a4);
            jce.F(npVar4, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar5, rv4Var, kgVar2);
            jce.F(npVar6, rv4Var, p3);
            String str5 = ombVar.c;
            long j = r0f.y(rv4Var).q;
            oyb oybVar = r0f.A(rv4Var).l;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f4 = Float.MAX_VALUE;
            }
            ombVar2 = ombVar;
            cvb.c(str5, lpe.m(new we6(f4, true), 0.8f), j, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, oybVar, rv4Var, 0, 24960, 109560);
            rv4Var2 = rv4Var;
            if (ombVar2.s) {
                rv4Var2.e0(-901289855);
                ar5 c2 = rp5.c((wk3) ok3.d0.getValue(), rv4Var2, 0);
                nq7 k = tte.k(zbe.y(pna.n(kq7Var3, 36.0f), 4.0f), uu9.a);
                if ((i14 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Object P2 = rv4Var2.P();
                if (!z8) {
                    lh9Var3 = lh9Var4;
                    if (P2 != lh9Var3) {
                        i14 = i14;
                        npVar = npVar6;
                        kgVar = kgVar2;
                        npVar2 = npVar5;
                        ba5Var = ba5Var2;
                        lh9Var = lh9Var3;
                        r2 = 0;
                        f2 = 36.0f;
                        nk5.a(c2, "", zbe.y(nmd.v(lbe.f(15, (vt4) P2, k, null, false), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var2), 4.0f), 0L, rv4Var2, 48, 8);
                        rv4Var2.q(false);
                    }
                } else {
                    lh9Var3 = lh9Var4;
                }
                i14 = i14;
                P2 = new on7(7, vt4Var2);
                rv4Var2.o0(P2);
                npVar = npVar6;
                kgVar = kgVar2;
                npVar2 = npVar5;
                ba5Var = ba5Var2;
                lh9Var = lh9Var3;
                r2 = 0;
                f2 = 36.0f;
                nk5.a(c2, "", zbe.y(nmd.v(lbe.f(15, (vt4) P2, k, null, false), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var2), 4.0f), 0L, rv4Var2, 48, 8);
                rv4Var2.q(false);
            } else {
                npVar = npVar6;
                kgVar = kgVar2;
                npVar2 = npVar5;
                f2 = 36.0f;
                ba5Var = ba5Var2;
                lh9Var = lh9Var4;
                r2 = 0;
                rv4Var2.e0(-900794382);
                rv4Var2.q(false);
            }
            if (!ombVar2.n) {
                rv4Var2.e0(-900707396);
                ar5 c3 = rp5.c((wk3) ok3.c0.getValue(), rv4Var2, r2);
                nq7 k2 = tte.k(zbe.y(pna.n(kq7Var3, f2), 4.0f), uu9.a);
                if ((i14 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = r2;
                }
                Object P3 = rv4Var2.P();
                lh9 lh9Var5 = lh9Var;
                if (z7 || P3 == lh9Var5) {
                    P3 = new on7(8, vt4Var4);
                    rv4Var2.o0(P3);
                }
                kq7Var = kq7Var3;
                f3 = 0.1f;
                lh9Var2 = lh9Var5;
                nk5.a(c3, yqe.A((y3b) v1b.u.getValue(), rv4Var2), zbe.y(nmd.v(lbe.f(15, (vt4) P3, k2, null, r2), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var), 4.0f), 0L, rv4Var2, 0, 8);
                rv4Var2.q(r2);
            } else {
                kq7Var = kq7Var3;
                lh9Var2 = lh9Var;
                f3 = 0.1f;
                rv4Var2.e0(-900176366);
                rv4Var2.q(r2);
            }
            if (ombVar2.m) {
                rv4Var2.e0(-900093658);
                if (ombVar2.p) {
                    wk3Var = (wk3) ok3.S.getValue();
                } else {
                    wk3Var = (wk3) ok3.T.getValue();
                }
                ar5 c4 = rp5.c(wk3Var, rv4Var2, r2);
                kq7 kq7Var4 = kq7Var;
                nq7 k3 = tte.k(zbe.y(pna.n(kq7Var4, 36.0f), 4.0f), uu9.a);
                if ((i14 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = r2;
                }
                if ((i14 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = r2;
                }
                boolean z11 = z6 | z5;
                Object P4 = rv4Var2.P();
                if (z11 || P4 == lh9Var2) {
                    P4 = new mm7(2, xt4Var, ombVar2);
                    rv4Var2.o0(P4);
                }
                nq7 y = zbe.y(nmd.v(lbe.f(15, (vt4) P4, k3, null, r2), zl1.b(f3, r0f.y(rv4Var2).q), ba5Var), 4.0f);
                kq7Var2 = kq7Var4;
                nk5.a(c4, yqe.A((y3b) s2b.g0.getValue(), rv4Var2), y, 0L, rv4Var2, 0, 8);
                rv4Var2.q(r2);
            } else {
                kq7Var2 = kq7Var;
                rv4Var2.e0(-899479982);
                rv4Var2.q(r2);
            }
            if (ombVar2.r) {
                rv4Var2.e0(-899397894);
                b37 d2 = fu0.d(kh5.a, r2);
                int hashCode4 = Long.hashCode(rv4Var2.T);
                xt8 l4 = rv4Var2.l();
                nq7 p4 = lye.p(rv4Var2, kq7Var2);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var3);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar3, rv4Var2, d2);
                jce.F(npVar4, rv4Var2, l4);
                s21.t(hashCode4, rv4Var2, npVar2, rv4Var2, kgVar);
                jce.F(npVar, rv4Var2, p4);
                ar5 c5 = rp5.c((wk3) jk3.x.getValue(), rv4Var2, r2);
                nq7 k4 = tte.k(zbe.y(pna.n(kq7Var2, 36.0f), 4.0f), uu9.a);
                boolean z12 = !z9;
                if ((i14 & 57344) == 16384) {
                    z4 = true;
                } else {
                    z4 = r2;
                }
                Object P5 = rv4Var2.P();
                if (!z4 && P5 != lh9Var2) {
                    vt4Var5 = vt4Var3;
                } else {
                    vt4Var5 = vt4Var3;
                    P5 = new on7(4, vt4Var5);
                    rv4Var2.o0(P5);
                }
                nk5.a(c5, yqe.A((y3b) o2b.V.getValue(), rv4Var2), zbe.y(nmd.v(lbe.f(14, (vt4) P5, k4, null, z12), zl1.b(0.1f, r0f.y(rv4Var2).q), ba5Var), 4.0f), 0L, rv4Var2, 0, 8);
                if (z9) {
                    rv4Var2.e0(-1514119140);
                    ts6.a(nae.e, 384, 2, r0f.y(rv4Var2).q, rv4Var2, zbe.y(pna.n(kq7Var2, 36.0f), 4.0f));
                    rv4Var2.q(r2);
                } else {
                    rv4Var2.e0(-1513862708);
                    rv4Var2.q(r2);
                }
                z3 = true;
                rv4Var2.q(true);
                rv4Var2.q(r2);
                obj = vt4Var5;
            } else {
                obj = vt4Var3;
                z3 = true;
                rv4Var2.e0(-898390766);
                rv4Var2.q(r2);
            }
            hl5.v(rv4Var2, z3, z3, z3);
        } else {
            ombVar2 = ombVar;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bx(ombVar2, nq7Var, vt4Var, vt4Var2, obj, vt4Var4, xt4Var, i, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0324, code lost:
        if (r9 == r8) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(defpackage.u2c r57, boolean r58, boolean r59, defpackage.nq7 r60, defpackage.vt4 r61, defpackage.rv4 r62, int r63) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0e.t(u2c, boolean, boolean, nq7, vt4, rv4, int):void");
    }

    public static nq7 u(nq7 nq7Var) {
        xk5 xk5Var = w92.b;
        float f = w92.c;
        return nq7Var.a0(new r17(1200, xk5Var, 30.0f));
    }

    public static final byte[] v(byte[] bArr, boolean z) {
        long j;
        char c2;
        char c3;
        int i;
        int[] iArr = yz1.b;
        int i2 = 4;
        if (4 <= bArr.length) {
            int i3 = 0;
            int i4 = 16;
            long j2 = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
            long j3 = j2 & 4294967295L;
            int i5 = (int) (j2 & 1023);
            long j4 = (j3 >>> 20) & 4095;
            if (j4 == 4095) {
                if (8 <= bArr.length) {
                    j = 255;
                    c2 = 1;
                    c3 = 2;
                    j4 = ((bArr[4] & 255) | ((bArr[5] & 255) << 8) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 24)) & 4294967295L;
                    i = 8;
                } else {
                    throw new Exception("extended record size parsing failed: insufficient data");
                }
            } else {
                j = 255;
                c2 = 1;
                c3 = 2;
                i = 4;
            }
            long j5 = j4;
            if (i5 == 28) {
                int i6 = ((int) j5) + i;
                if (i6 <= bArr.length && j5 >= 256) {
                    byte[] d0 = b00.d0(bArr, i, i + 256);
                    if (d0.length >= 256) {
                        long j6 = ((d0[0] & j) | ((d0[c2] & j) << 8) | ((d0[c3] & j) << 16) | ((d0[3] & j) << 24)) & 4294967295L;
                        byte[] d02 = b00.d0(d0, 0, 256);
                        int i7 = 0;
                        int i8 = 0;
                        byte b2 = 0;
                        for (int i9 = 256; i7 < i9; i9 = 256) {
                            if (i8 == 0) {
                                long j7 = ((j6 * 214013) + 2531011) & 4294967295L;
                                j6 = ((j7 * 214013) + 2531011) & 4294967295L;
                                i8 = (((int) ((j6 >>> 16) & 32767)) & 15) + 1;
                                b2 = ((int) ((j7 >>> 16) & 32767)) & 255;
                            }
                            if (i7 >= 4) {
                                d02[i7] = (byte) (d02[i7] ^ b2);
                            }
                            i7++;
                            i8--;
                        }
                        int i10 = d02[0] & 15;
                        int i11 = i10 + 4;
                        int i12 = i10 + 20;
                        if (i12 <= d02.length) {
                            byte[] d03 = b00.d0(d02, i11, i12);
                            byte[] d04 = b00.d0(bArr, i6, bArr.length);
                            if (d04.length != 0) {
                                int length = d04.length - (d04.length % 16);
                                if (length != 0) {
                                    byte[] d05 = b00.d0(d04, 0, length);
                                    if (d03.length == 16) {
                                        if (d05.length % 16 == 0) {
                                            int[] iArr2 = new int[16];
                                            for (int i13 = 0; i13 < 16; i13++) {
                                                iArr2[i13] = d03[i13] & 255;
                                            }
                                            int[] iArr3 = new int[44];
                                            for (int i14 = 0; i14 < 4; i14++) {
                                                int i15 = i14 * 4;
                                                iArr3[i14] = iArr2[i15 + 3] | (iArr2[i15] << 24) | (iArr2[i15 + 1] << 16) | (iArr2[i15 + 2] << 8);
                                            }
                                            for (int i16 = 4; i16 < 44; i16++) {
                                                int i17 = iArr3[i16 - 1];
                                                if (i16 % 4 == 0) {
                                                    int i18 = (i17 >>> 24) | (i17 << 8);
                                                    int[] iArr4 = yz1.a;
                                                    i17 = (iArr4[i18 & 255] | (((iArr4[(i18 >>> 24) & 255] << 24) | (iArr4[(i18 >>> 16) & 255] << 16)) | (iArr4[(i18 >>> 8) & 255] << 8))) ^ (yz1.c[(i16 / 4) - 1] << 24);
                                                }
                                                iArr3[i16] = i17 ^ iArr3[i16 - 4];
                                            }
                                            byte[] bArr2 = new byte[d05.length];
                                            int i19 = 0;
                                            while (i19 < d05.length) {
                                                int[] iArr5 = new int[i4];
                                                for (int i20 = i3; i20 < i4; i20++) {
                                                    iArr5[i20] = d05[i19 + i20] & 255;
                                                }
                                                yz1.g(iArr5, iArr3, 10);
                                                int i21 = 9;
                                                int i22 = 9;
                                                while (i22 > 0) {
                                                    yz1.n(iArr5);
                                                    for (int i23 = i3; i23 < i4; i23++) {
                                                        iArr5[i23] = iArr[iArr5[i23]];
                                                    }
                                                    yz1.g(iArr5, iArr3, i22);
                                                    int i24 = i3;
                                                    while (i24 < i2) {
                                                        int i25 = i24 * 4;
                                                        int i26 = iArr5[i25];
                                                        int i27 = i25 + 1;
                                                        int i28 = iArr5[i27];
                                                        int i29 = i25 + 2;
                                                        int i30 = iArr5[i29];
                                                        int i31 = i25 + 3;
                                                        int i32 = iArr5[i31];
                                                        iArr5[i25] = ((yz1.m(i26, 14) ^ yz1.m(i28, 11)) ^ yz1.m(i30, 13)) ^ yz1.m(i32, i21);
                                                        iArr5[i27] = ((yz1.m(i26, i21) ^ yz1.m(i28, 14)) ^ yz1.m(i30, 11)) ^ yz1.m(i32, 13);
                                                        iArr5[i29] = ((yz1.m(i26, 13) ^ yz1.m(i28, 9)) ^ yz1.m(i30, 14)) ^ yz1.m(i32, 11);
                                                        iArr5[i31] = yz1.m(i32, 14) ^ (yz1.m(i30, 9) ^ (yz1.m(i26, 11) ^ yz1.m(i28, 13)));
                                                        i24++;
                                                        i21 = 9;
                                                        i2 = 4;
                                                    }
                                                    i22--;
                                                    i3 = 0;
                                                    i2 = 4;
                                                    i4 = 16;
                                                }
                                                yz1.n(iArr5);
                                                for (int i33 = 0; i33 < 16; i33++) {
                                                    iArr5[i33] = iArr[iArr5[i33]];
                                                }
                                                i3 = 0;
                                                yz1.g(iArr5, iArr3, 0);
                                                for (int i34 = 0; i34 < 16; i34++) {
                                                    bArr2[i19 + i34] = (byte) iArr5[i34];
                                                }
                                                i19 += 16;
                                                i4 = 16;
                                                i2 = 4;
                                            }
                                            if (z) {
                                                try {
                                                    gm9 gm9Var = lk9.a;
                                                    return zj0.j(bArr2);
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            return bArr2;
                                        }
                                        vs.m("AES ECB input must be a multiple of 16 bytes");
                                        return null;
                                    }
                                    vs.m("AES-128 key must be 16 bytes");
                                    return null;
                                }
                                throw new Exception("encrypted data is too short (less than 16 bytes)");
                            }
                            throw new Exception("distribution document has no encrypted body data");
                        }
                        throw new Exception("AES key extraction failed: offset exceeds payload range");
                    }
                    throw new Exception("distribution payload is less than 256 bytes");
                }
                throw new Exception("distribution payload is invalid");
            }
            throw new Exception(hl5.l("first record of distribution document is not DISTRIBUTE_DOC_DATA(28) (actual: ", ")", i5));
        }
        throw new Exception("record header parsing failed: insufficient data");
    }

    public static Map w(String str) {
        try {
            r36 r36Var = (r36) s66.a.getValue();
            r36Var.getClass();
            Map map = (Map) r36Var.a(new b45(c4b.a, k46.Companion.serializer(), 1), str);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new yk8(entry.getKey(), y((k46) entry.getValue(), (String) entry.getKey())));
            }
            return o17.x(arrayList);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Could not parse JWT";
            }
            throw new bd8(message, e2);
        }
    }

    public static final io3 x(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = io3.h;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(27);
            rv4Var.o0(P);
        }
        io3 io3Var = (io3) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
        io3Var.f.setValue(true);
        return io3Var;
    }

    public static Object y(k46 k46Var, String str) {
        if (k46Var instanceof t36) {
            Iterable iterable = (Iterable) k46Var;
            ArrayList arrayList = new ArrayList(tl1.s(iterable, 10));
            int i = 0;
            for (Object obj : iterable) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(y((k46) obj, str + "-" + i));
                    i = i2;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            return arrayList;
        } else if (k46Var instanceof d56) {
            Map map = (Map) k46Var;
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList2.add(new yk8(str2, y((k46) entry.getValue(), str2)));
            }
            return o17.x(arrayList2);
        } else if (k46Var instanceof i56) {
            i56 i56Var = (i56) k46Var;
            if (i56Var.b()) {
                return i56Var.a();
            }
            Object U = r4b.U(i56Var.a());
            if (U == null && (U = q4b.B(i56Var.a())) == null && (U = k4b.M0(i56Var.a())) == null) {
                return i56Var.a();
            }
            return U;
        } else if (k46Var instanceof a56) {
            return null;
        } else {
            xk5.o();
            return null;
        }
    }

    public static void z(ujc ujcVar, xt4 xt4Var) {
        Object obj;
        c3e c3eVar = (c3e) ujcVar;
        c3eVar.getClass();
        mm mmVar = (mm) c3eVar.a;
        ThreadLocal threadLocal = mmVar.b;
        km kmVar = (km) threadLocal.get();
        km kmVar2 = new km(mmVar, kmVar);
        threadLocal.set(kmVar2);
        if (kmVar == null) {
            mmVar.Q().q();
        }
        km kmVar3 = kmVar2.h;
        Throwable th = null;
        try {
            obj = xt4Var.invoke(new Object());
            try {
                kmVar2.f = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = null;
        }
        kmVar2.a();
        c3eVar.D(kmVar2, kmVar3, th, obj);
    }

    public Task B(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        yv yvVar;
        boolean z;
        xk9 xk9Var = new xk9(19);
        xk9Var.b = this;
        synchronized (firebaseAuth) {
            yvVar = firebaseAuth.j;
        }
        if (yvVar != null) {
            synchronized (yvVar.a) {
                try {
                    r4e r4eVar = (r4e) yvVar.c;
                    if (r4eVar != null && r4eVar.a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                return yvVar.I(str, Boolean.FALSE, recaptchaAction).continueWithTask(xk9Var).continueWithTask(new odd(str, yvVar, recaptchaAction, xk9Var, 7));
            }
        }
        Task C = C(null);
        odd oddVar = new odd(6, false);
        oddVar.b = recaptchaAction;
        oddVar.c = firebaseAuth;
        oddVar.d = str;
        oddVar.e = xk9Var;
        return C.continueWithTask(oddVar);
    }

    public abstract Task C(String str);
}
