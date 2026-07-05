package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vbook.android.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fz4  reason: default package */
/* loaded from: classes3.dex */
public class fz4 implements un5, g32, ad, mm1, na4, OnSuccessListener {
    public static volatile fz4 b;
    public static fz4 d;
    public Object a;
    public static final Object c = new Object();
    public static final mp8 e = new mp8(9);
    public static final Object f = new Object();

    public fz4(int i) {
        switch (i) {
            case 2:
                int i2 = kzd.a;
                this.a = new k57(new z1e[]{p40.K, e}, 21);
                return;
            case 5:
                this.a = new AudioAttributes.Builder();
                return;
            case 6:
                this.a = new gw7(new h22[16], 0);
                return;
            case 12:
                this.a = dza.a(bvc.b);
                return;
            case 20:
                this.a = new tt4(1.0f, 5, 0, false);
                return;
            case 21:
                this.a = new km8(10);
                return;
            default:
                this.a = new HashSet();
                return;
        }
    }

    public static String C0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fz4, java.lang.Object] */
    public static fz4 E() {
        fz4 fz4Var;
        synchronized (c) {
            try {
                if (d == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    ?? obj = new Object();
                    Handler handler = new Handler(looper);
                    Looper.getMainLooper();
                    obj.a = handler;
                    d = obj;
                }
                fz4Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fz4Var;
    }

    public static boolean Y(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static Task o0(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        eqe.a.execute(new bv4(19, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.pt
            if (r0 == 0) goto L13
            r0 = r8
            pt r0 = (defpackage.pt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pt r0 = new pt
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            goto L85
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            defpackage.hre.r(r8)
            goto L59
        L35:
            defpackage.hre.r(r8)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r8 = new gh5
            r8.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r8.a
            java.lang.String r6 = "https://vbookapp.com/api/chat/conversations/unread-count"
            defpackage.ytc.b(r1, r6)
            pg5 r1 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r8, r1, r8, r7)
            r0.c = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r5) goto L59
            goto L84
        L59:
            oh5 r8 = (defpackage.oh5) r8
            te5 r7 = r8.y0()
            java.lang.Class<or9> r8 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r8)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L76
            java.lang.Class<u62> r3 = defpackage.u62.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L76
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L76
            nsc r8 = defpackage.cm9.e(r8, r3)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r8 = r4
        L77:
            isc r3 = new isc
            r3.<init>(r1, r8)
            r0.c = r2
            java.lang.Object r8 = r7.a(r3, r0)
            if (r8 != r5) goto L85
        L84:
            return r5
        L85:
            if (r8 == 0) goto L8a
            or9 r8 = (defpackage.or9) r8
            return r8
        L8a:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationUnreadCountDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.A(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r9v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A0(java.lang.String r7, boolean r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.nu
            if (r0 == 0) goto L13
            r0 = r9
            nu r0 = (defpackage.nu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nu r0 = new nu
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L94
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            boolean r8 = r0.a
            defpackage.hre.r(r9)
            goto L66
        L37:
            defpackage.hre.r(r9)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r9 = defpackage.tl8.b
            vl8 r9 = new vl8
            r1 = 8
            r9.<init>(r1)
            java.lang.String r1 = "id"
            r9.h(r1, r7)
            java.lang.String r7 = "premium"
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r9.h(r7, r1)
            tl8 r7 = r9.Y()
            r0.a = r8
            r0.d = r3
            java.lang.String r9 = "https://vbookapp.com/api/admin/premium"
            java.lang.Object r9 = defpackage.cbe.u(r6, r9, r7, r0)
            if (r9 != r5) goto L66
            goto L93
        L66:
            oh5 r9 = (defpackage.oh5) r9
            te5 r6 = r9.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r9 = defpackage.cm9.a(r7)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L83
            java.lang.Class<r28> r1 = defpackage.r28.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L83
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L83
            nsc r7 = defpackage.cm9.e(r7, r1)     // Catch: java.lang.Throwable -> L83
            goto L84
        L83:
            r7 = r4
        L84:
            isc r1 = new isc
            r1.<init>(r9, r7)
            r0.a = r8
            r0.d = r2
            java.lang.Object r9 = r6.a(r1, r0)
            if (r9 != r5) goto L94
        L93:
            return r5
        L94:
            if (r9 == 0) goto L99
            or9 r9 = (defpackage.or9) r9
            return r9
        L99:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.A0(java.lang.String, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(long r8, int r10, int r11, defpackage.n42 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.qt
            if (r0 == 0) goto L13
            r0 = r12
            qt r0 = (defpackage.qt) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            qt r0 = new qt
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r12)
            goto Lbc
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r11 = r0.c
            int r10 = r0.b
            long r8 = r0.a
            defpackage.hre.r(r12)
            goto L80
        L3c:
            defpackage.hre.r(r12)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r12 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/users"
            java.lang.String r12 = defpackage.nk2.t(r8, r12, r1)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r10)
            java.lang.String r6 = "page"
            defpackage.kqe.v(r1, r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            java.lang.String r6 = "limit"
            defpackage.kqe.v(r1, r6, r12)
            pg5 r12 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r12, r1, r7)
            r0.a = r8
            r0.b = r10
            r0.c = r11
            r0.f = r3
            java.lang.Object r12 = r7.c(r0)
            if (r12 != r5) goto L80
            goto Lbb
        L80:
            oh5 r12 = (defpackage.oh5) r12
            te5 r7 = r12.y0()
            java.lang.Class<or9> r12 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r12)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> La7
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<r62> r6 = defpackage.r62.class
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> La7
            w76 r6 = defpackage.v9e.y(r6)     // Catch: java.lang.Throwable -> La7
            nsc r3 = defpackage.cm9.e(r3, r6)     // Catch: java.lang.Throwable -> La7
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> La7
            nsc r12 = defpackage.cm9.e(r12, r3)     // Catch: java.lang.Throwable -> La7
            goto La8
        La7:
            r12 = r4
        La8:
            isc r3 = new isc
            r3.<init>(r1, r12)
            r0.a = r8
            r0.b = r10
            r0.c = r11
            r0.f = r2
            java.lang.Object r12 = r7.a(r3, r0)
            if (r12 != r5) goto Lbc
        Lbb:
            return r5
        Lbc:
            if (r12 == 0) goto Lc1
            or9 r12 = (defpackage.or9) r12
            return r12
        Lc1:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.ConversationMemberDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.B(long, int, int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Type inference failed for: r9v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(java.lang.String r7, java.lang.String r8, defpackage.n42 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ou
            if (r0 == 0) goto L13
            r0 = r9
            ou r0 = (defpackage.ou) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ou r0 = new ou
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L8a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            defpackage.hre.r(r9)
            goto L5e
        L35:
            defpackage.hre.r(r9)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r9 = defpackage.tl8.b
            vl8 r9 = new vl8
            r1 = 8
            r9.<init>(r1)
            java.lang.String r1 = "name"
            r9.h(r1, r7)
            java.lang.String r7 = "data"
            r9.h(r7, r8)
            tl8 r7 = r9.Y()
            r0.c = r3
            java.lang.String r8 = "https://vbookapp.com/api/file/image/upload"
            java.lang.Object r9 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r9 != r5) goto L5e
            goto L89
        L5e:
            oh5 r9 = (defpackage.oh5) r9
            te5 r6 = r9.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r9 = defpackage.w76.c     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            nsc r9 = defpackage.cm9.d(r9)     // Catch: java.lang.Throwable -> L7b
            w76 r9 = defpackage.v9e.y(r9)     // Catch: java.lang.Throwable -> L7b
            nsc r7 = defpackage.cm9.e(r7, r9)     // Catch: java.lang.Throwable -> L7b
            goto L7c
        L7b:
            r7 = r4
        L7c:
            isc r9 = new isc
            r9.<init>(r8, r7)
            r0.c = r2
            java.lang.Object r9 = r6.a(r9, r0)
            if (r9 != r5) goto L8a
        L89:
            return r5
        L8a:
            if (r9 == 0) goto L8f
            or9 r9 = (defpackage.or9) r9
            return r9
        L8f:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.String>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.B0(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(3:30|(1:32)|(1:34))|35)|20|21|22|23))|37|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(int r8, int r9, defpackage.n42 r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.rt
            if (r0 == 0) goto L13
            r0 = r10
            rt r0 = (defpackage.rt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            rt r0 = new rt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r10)
            goto Lc1
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r9 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r10)
            goto L87
        L3a:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r10 = new gh5
            r10.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r10.a
            java.lang.String r6 = "https://vbookapp.com/api/chat/conversations"
            defpackage.ytc.b(r1, r6)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            java.lang.String r6 = "page"
            defpackage.kqe.v(r10, r6, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r6 = "limit"
            defpackage.kqe.v(r10, r6, r1)
            if (r11 == 0) goto L74
            boolean r1 = defpackage.k4b.j0(r11)
            if (r1 != 0) goto L6c
            goto L6d
        L6c:
            r11 = r4
        L6d:
            if (r11 == 0) goto L74
            java.lang.String r1 = "search"
            defpackage.kqe.v(r10, r1, r11)
        L74:
            pg5 r11 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r10, r11, r10, r7)
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L87
            goto Lc0
        L87:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r11 = defpackage.cm9.a(r10)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> Lae
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<m62> r3 = defpackage.m62.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> Lae
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> Lae
            nsc r1 = defpackage.cm9.e(r1, r3)     // Catch: java.lang.Throwable -> Lae
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> Lae
            nsc r10 = defpackage.cm9.e(r10, r1)     // Catch: java.lang.Throwable -> Lae
            goto Laf
        Lae:
            r10 = r4
        Laf:
            isc r1 = new isc
            r1.<init>(r11, r10)
            r0.a = r8
            r0.b = r9
            r0.e = r2
            java.lang.Object r10 = r7.a(r1, r0)
            if (r10 != r5) goto Lc1
        Lc0:
            return r5
        Lc1:
            if (r10 == 0) goto Lc6
            or9 r10 = (defpackage.or9) r10
            return r10
        Lc6:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.ConversationDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.C(int, int, n42, java.lang.String):java.lang.Object");
    }

    public xya D() {
        return (xya) ((cza) this.a).getValue();
    }

    public void D0(int i, Object obj, h0a h0aVar) {
        el1 el1Var = (el1) this.a;
        el1Var.y(i, 3);
        h0aVar.g((w2) obj, el1Var.a);
        el1Var.y(i, 4);
    }

    public synchronized hvc E0() {
        hvc o;
        g99 g99Var = (g99) this.a;
        synchronized (g99Var) {
            o = hvc.o((xgf) ((wgf) g99Var.b).b());
        }
        return o;
    }

    public Integer F(String str) {
        String Q = Q(str);
        if (!TextUtils.isEmpty(Q)) {
            try {
                return Integer.valueOf(Integer.parseInt(Q));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + C0(str) + "(" + Q + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray G(String str) {
        String Q = Q(str);
        if (!TextUtils.isEmpty(Q)) {
            try {
                return new JSONArray(Q);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + C0(str) + ": " + Q + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public int[] H() {
        JSONArray G = G("gcm.n.light_settings");
        if (G == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (G.length() == 3) {
                int parseColor = Color.parseColor(G.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = G.optInt(1);
                    iArr[2] = G.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e2) {
            Log.w("NotificationParams", "LightSettings is invalid: " + G + ". " + e2.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + G + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] I(String str) {
        JSONArray G = G(str.concat("_loc_args"));
        if (G == null) {
            return null;
        }
        int length = G.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = G.optString(i);
        }
        return strArr;
    }

    public String J(String str) {
        return Q(str.concat("_loc_key"));
    }

    public Long K() {
        String Q = Q("gcm.n.event_time");
        if (!TextUtils.isEmpty(Q)) {
            try {
                return Long.valueOf(Long.parseLong(Q));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + C0("gcm.n.event_time") + "(" + Q + ") into a long");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(long r8, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.st
            if (r0 == 0) goto L13
            r0 = r10
            st r0 = (defpackage.st) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            st r0 = new st
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r10)
            goto La0
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            long r8 = r0.a
            defpackage.hre.r(r10)
            goto L68
        L38:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r10 = new gh5
            r10.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r10.a
            java.lang.String r6 = "https://vbookapp.com/api/chat/new"
            defpackage.ytc.b(r1, r6)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r8)
            java.lang.String r6 = "from"
            defpackage.kqe.v(r10, r6, r1)
            pg5 r1 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r10, r1, r10, r7)
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L68
            goto L9f
        L68:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L8f
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<ia7> r6 = defpackage.ia7.class
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> L8f
            w76 r6 = defpackage.v9e.y(r6)     // Catch: java.lang.Throwable -> L8f
            nsc r3 = defpackage.cm9.e(r3, r6)     // Catch: java.lang.Throwable -> L8f
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L8f
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L8f
            goto L90
        L8f:
            r10 = r4
        L90:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r8
            r0.d = r2
            java.lang.Object r10 = r7.a(r3, r0)
            if (r10 != r5) goto La0
        L9f:
            return r5
        La0:
            if (r10 == 0) goto La5
            or9 r10 = (defpackage.or9) r10
            return r10
        La5:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.MessageDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.L(long, n42):java.lang.Object");
    }

    public String M(Resources resources, String str, String str2) {
        String Q = Q(str2);
        if (!TextUtils.isEmpty(Q)) {
            return Q;
        }
        String J = J(str2);
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        int identifier = resources.getIdentifier(J, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", C0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] I = I(str2);
        if (I == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, I);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + C0(str2) + ": " + Arrays.toString(I) + " Default value will be used.", e2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(long r8, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.tt
            if (r0 == 0) goto L13
            r0 = r10
            tt r0 = (defpackage.tt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            tt r0 = new tt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L8f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            long r8 = r0.a
            defpackage.hre.r(r10)
            goto L61
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r10 = "https://vbookapp.com/api/post/"
            java.lang.String r10 = defpackage.hl5.k(r8, r10)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r10)
            pg5 r10 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r10, r1, r7)
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L61
            goto L8e
        L61:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L7e
            java.lang.Class<r29> r3 = defpackage.r29.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L7e
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L7e
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
            r10 = r4
        L7f:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r8
            r0.d = r2
            java.lang.Object r10 = r7.a(r3, r0)
            if (r10 != r5) goto L8f
        L8e:
            return r5
        L8f:
            if (r10 == 0) goto L94
            or9 r10 = (defpackage.or9) r10
            return r10
        L94:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.PostDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.N(long, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(int r8, int r9, int r10, java.lang.String r11, defpackage.n42 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.ut
            if (r0 == 0) goto L13
            r0 = r12
            ut r0 = (defpackage.ut) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ut r0 = new ut
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r12)
            goto Lc1
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r10 = r0.c
            int r9 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r12)
            goto L85
        L3c:
            defpackage.hre.r(r12)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r12 = "https://vbookapp.com/api/post/"
            java.lang.String r1 = "/all"
            java.lang.String r12 = defpackage.hl5.l(r12, r1, r8)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r9)
            java.lang.String r6 = "page"
            defpackage.kqe.v(r1, r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r10)
            java.lang.String r6 = "limit"
            defpackage.kqe.v(r1, r6, r12)
            java.lang.String r12 = "order"
            defpackage.kqe.v(r1, r12, r11)
            pg5 r11 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r11, r1, r7)
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r3
            java.lang.Object r12 = r7.c(r0)
            if (r12 != r5) goto L85
            goto Lc0
        L85:
            oh5 r12 = (defpackage.oh5) r12
            te5 r7 = r12.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r12 = defpackage.cm9.a(r11)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> Lac
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<r29> r3 = defpackage.r29.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> Lac
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> Lac
            nsc r1 = defpackage.cm9.e(r1, r3)     // Catch: java.lang.Throwable -> Lac
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> Lac
            nsc r11 = defpackage.cm9.e(r11, r1)     // Catch: java.lang.Throwable -> Lac
            goto Lad
        Lac:
            r11 = r4
        Lad:
            isc r1 = new isc
            r1.<init>(r12, r11)
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.f = r2
            java.lang.Object r12 = r7.a(r1, r0)
            if (r12 != r5) goto Lc1
        Lc0:
            return r5
        Lc1:
            if (r12 == 0) goto Lc6
            or9 r12 = (defpackage.or9) r12
            return r12
        Lc6:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.PostDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.O(int, int, int, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(3:30|(1:32)|(1:34))|35)|20|21|22|23))|37|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P(java.lang.String r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vt
            if (r0 == 0) goto L13
            r0 = r9
            vt r0 = (defpackage.vt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vt r0 = new vt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r9)
            goto La1
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            defpackage.hre.r(r9)
            goto L6b
        L36:
            defpackage.hre.r(r9)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r9 = new gh5
            r9.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r9.a
            java.lang.String r6 = "https://vbookapp.com/api/chat/conversations/public"
            defpackage.ytc.b(r1, r6)
            if (r8 == 0) goto L5c
            boolean r1 = defpackage.k4b.j0(r8)
            if (r1 != 0) goto L54
            goto L55
        L54:
            r8 = r4
        L55:
            if (r8 == 0) goto L5c
            java.lang.String r1 = "search"
            defpackage.kqe.v(r9, r1, r8)
        L5c:
            pg5 r8 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r9, r8, r9, r7)
            r0.c = r3
            java.lang.Object r9 = r7.c(r0)
            if (r9 != r5) goto L6b
            goto La0
        L6b:
            oh5 r9 = (defpackage.oh5) r9
            te5 r7 = r9.y0()
            java.lang.Class<or9> r8 = defpackage.or9.class
            gi1 r9 = defpackage.cm9.a(r8)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L92
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<m62> r3 = defpackage.m62.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L92
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L92
            nsc r1 = defpackage.cm9.e(r1, r3)     // Catch: java.lang.Throwable -> L92
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L92
            nsc r8 = defpackage.cm9.e(r8, r1)     // Catch: java.lang.Throwable -> L92
            goto L93
        L92:
            r8 = r4
        L93:
            isc r1 = new isc
            r1.<init>(r9, r8)
            r0.c = r2
            java.lang.Object r9 = r7.a(r1, r0)
            if (r9 != r5) goto La1
        La0:
            return r5
        La1:
            if (r9 == 0) goto La6
            or9 r9 = (defpackage.or9) r9
            return r9
        La6:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.ConversationDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.P(java.lang.String, n42):java.lang.Object");
    }

    public String Q(String str) {
        String replace;
        Bundle bundle = (Bundle) this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object R(int r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.wt
            if (r0 == 0) goto L13
            r0 = r9
            wt r0 = (defpackage.wt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wt r0 = new wt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L8f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            int r8 = r0.a
            defpackage.hre.r(r9)
            goto L61
        L37:
            defpackage.hre.r(r9)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r9 = "https://vbookapp.com/api/topic/"
            java.lang.String r9 = defpackage.a82.j(r8, r9)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r9)
            pg5 r9 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r9, r1, r7)
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r7.c(r0)
            if (r9 != r5) goto L61
            goto L8e
        L61:
            oh5 r9 = (defpackage.oh5) r9
            te5 r7 = r9.y0()
            java.lang.Class<or9> r9 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r9)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L7e
            java.lang.Class<vhc> r3 = defpackage.vhc.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L7e
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L7e
            nsc r9 = defpackage.cm9.e(r9, r3)     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
            r9 = r4
        L7f:
            isc r3 = new isc
            r3.<init>(r1, r9)
            r0.a = r8
            r0.d = r2
            java.lang.Object r9 = r7.a(r3, r0)
            if (r9 != r5) goto L8f
        L8e:
            return r5
        L8f:
            if (r9 == 0) goto L94
            or9 r9 = (defpackage.or9) r9
            return r9
        L94:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.TopicDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.R(int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(5:28|(1:30)|(1:32)|(1:34)|35)|20|21|22|23))|37|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (r14 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
        if (r14 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13, defpackage.n42 r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.xt
            if (r0 == 0) goto L13
            r0 = r14
            xt r0 = (defpackage.xt) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            xt r0 = new xt
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r14)
            goto Ld5
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r13 = r0.c
            int r12 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r14)
            goto L99
        L3c:
            defpackage.hre.r(r14)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r14 = new gh5
            r14.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r14.a
            java.lang.String r6 = "https://vbookapp.com/api/topic"
            defpackage.ytc.b(r1, r6)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            java.lang.String r6 = "category"
            defpackage.kqe.v(r14, r6, r1)
            if (r9 == 0) goto L62
            java.lang.String r1 = "type"
            defpackage.kqe.v(r14, r1, r9)
        L62:
            if (r10 == 0) goto L69
            java.lang.String r9 = "status"
            defpackage.kqe.v(r14, r9, r10)
        L69:
            if (r11 == 0) goto L70
            java.lang.String r9 = "search"
            defpackage.kqe.v(r14, r9, r11)
        L70:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r12)
            java.lang.String r10 = "page"
            defpackage.kqe.v(r14, r10, r9)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r13)
            java.lang.String r10 = "limit"
            defpackage.kqe.v(r14, r10, r9)
            pg5 r9 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r14, r9, r14, r7)
            r0.a = r8
            r0.b = r12
            r0.c = r13
            r0.f = r3
            java.lang.Object r14 = r7.c(r0)
            if (r14 != r5) goto L99
            goto Ld4
        L99:
            oh5 r14 = (defpackage.oh5) r14
            te5 r7 = r14.y0()
            java.lang.Class<or9> r9 = defpackage.or9.class
            gi1 r10 = defpackage.cm9.a(r9)
            w76 r11 = defpackage.w76.c     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.Class<vhc> r14 = defpackage.vhc.class
            nsc r14 = defpackage.cm9.d(r14)     // Catch: java.lang.Throwable -> Lc0
            w76 r14 = defpackage.v9e.y(r14)     // Catch: java.lang.Throwable -> Lc0
            nsc r11 = defpackage.cm9.e(r11, r14)     // Catch: java.lang.Throwable -> Lc0
            w76 r11 = defpackage.v9e.y(r11)     // Catch: java.lang.Throwable -> Lc0
            nsc r9 = defpackage.cm9.e(r9, r11)     // Catch: java.lang.Throwable -> Lc0
            goto Lc1
        Lc0:
            r9 = r4
        Lc1:
            isc r11 = new isc
            r11.<init>(r10, r9)
            r0.a = r8
            r0.b = r12
            r0.c = r13
            r0.f = r2
            java.lang.Object r14 = r7.a(r11, r0)
            if (r14 != r5) goto Ld5
        Ld4:
            return r5
        Ld5:
            if (r14 == 0) goto Lda
            or9 r14 = (defpackage.or9) r14
            return r14
        Lda:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.TopicDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.S(int, java.lang.String, java.lang.String, java.lang.String, int, int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object T(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.yt
            if (r0 == 0) goto L13
            r0 = r8
            yt r0 = (defpackage.yt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yt r0 = new yt
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            goto L85
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            defpackage.hre.r(r8)
            goto L59
        L35:
            defpackage.hre.r(r8)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r8 = new gh5
            r8.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r8.a
            java.lang.String r6 = "https://vbookapp.com/api/user/info"
            defpackage.ytc.b(r1, r6)
            pg5 r1 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r8, r1, r8, r7)
            r0.c = r3
            java.lang.Object r8 = r7.c(r0)
            if (r8 != r5) goto L59
            goto L84
        L59:
            oh5 r8 = (defpackage.oh5) r8
            te5 r7 = r8.y0()
            java.lang.Class<or9> r8 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r8)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L76
            java.lang.Class<a0d> r3 = defpackage.a0d.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L76
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L76
            nsc r8 = defpackage.cm9.e(r8, r3)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r8 = r4
        L77:
            isc r3 = new isc
            r3.<init>(r1, r8)
            r0.c = r2
            java.lang.Object r8 = r7.a(r3, r0)
            if (r8 != r5) goto L85
        L84:
            return r5
        L85:
            if (r8 == 0) goto L8a
            or9 r8 = (defpackage.or9) r8
            return r8
        L8a:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.UserInfoDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.T(n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(int r8, int r9, defpackage.n42 r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.zt
            if (r0 == 0) goto L13
            r0 = r10
            zt r0 = (defpackage.zt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zt r0 = new zt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r10)
            goto Lb5
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r9 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r10)
            goto L7b
        L3a:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r10 = new gh5
            r10.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r10.a
            java.lang.String r6 = "https://vbookapp.com/api/admin/users"
            defpackage.ytc.b(r1, r6)
            java.lang.String r1 = "search"
            defpackage.kqe.v(r10, r1, r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r8)
            java.lang.String r1 = "page"
            defpackage.kqe.v(r10, r1, r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r9)
            java.lang.String r1 = "limit"
            defpackage.kqe.v(r10, r1, r11)
            pg5 r11 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r10, r11, r10, r7)
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L7b
            goto Lb4
        L7b:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r11 = defpackage.cm9.a(r10)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> La2
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<a0d> r3 = defpackage.a0d.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> La2
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> La2
            nsc r1 = defpackage.cm9.e(r1, r3)     // Catch: java.lang.Throwable -> La2
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> La2
            nsc r10 = defpackage.cm9.e(r10, r1)     // Catch: java.lang.Throwable -> La2
            goto La3
        La2:
            r10 = r4
        La3:
            isc r1 = new isc
            r1.<init>(r11, r10)
            r0.a = r8
            r0.b = r9
            r0.e = r2
            java.lang.Object r10 = r7.a(r1, r0)
            if (r10 != r5) goto Lb5
        Lb4:
            return r5
        Lb5:
            if (r10 == 0) goto Lba
            or9 r10 = (defpackage.or9) r10
            return r10
        Lba:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.UserInfoDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.U(int, int, n42, java.lang.String):java.lang.Object");
    }

    public long[] V() {
        JSONArray G = G("gcm.n.vibrate_timings");
        if (G == null) {
            return null;
        }
        try {
            if (G.length() > 1) {
                int length = G.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = G.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + G + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void W(int i, long j) {
        s27 s27Var = (s27) this.a;
        if (i != 240) {
            if (i != 241) {
                if (i != 20529) {
                    if (i != 20530) {
                        boolean z = false;
                        switch (i) {
                            case Token.DO /* 131 */:
                                int i2 = (int) j;
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 17) {
                                            if (i2 != 33) {
                                                s27Var.h(i);
                                                s27Var.y.e = -1;
                                                return;
                                            }
                                            s27Var.h(i);
                                            s27Var.y.e = 5;
                                            return;
                                        }
                                        s27Var.h(i);
                                        s27Var.y.e = 3;
                                        return;
                                    }
                                    s27Var.h(i);
                                    s27Var.y.e = 1;
                                    return;
                                }
                                s27Var.h(i);
                                s27Var.y.e = 2;
                                return;
                            case Token.WITH /* 136 */:
                                s27Var.h(i);
                                r27 r27Var = s27Var.y;
                                if (j == 1) {
                                    z = true;
                                }
                                r27Var.Y = z;
                                return;
                            case Token.LOCAL_BLOCK /* 155 */:
                                s27Var.Q = s27Var.n(j);
                                return;
                            case Token.XML /* 159 */:
                                s27Var.h(i);
                                s27Var.y.Q = (int) j;
                                return;
                            case Token.GENEXPR /* 176 */:
                                s27Var.h(i);
                                s27Var.y.n = (int) j;
                                return;
                            case Token.YIELD_STAR /* 179 */:
                                if (!s27Var.z) {
                                    s27Var.g(i);
                                    s27Var.E = s27Var.n(j);
                                    return;
                                }
                                return;
                            case Token.QUESTION_DOT /* 186 */:
                                s27Var.h(i);
                                s27Var.y.o = (int) j;
                                return;
                            case 215:
                                s27Var.h(i);
                                s27Var.y.d = (int) j;
                                return;
                            case 231:
                                s27Var.M = s27Var.n(j);
                                return;
                            case 238:
                                s27Var.X = (int) j;
                                return;
                            case 247:
                                if (!s27Var.z) {
                                    s27Var.g(i);
                                    s27Var.F = (int) j;
                                    return;
                                }
                                return;
                            case 251:
                                s27Var.Y = true;
                                return;
                            case 16871:
                                s27Var.h(i);
                                s27Var.y.h = (int) j;
                                return;
                            case 16980:
                                if (j != 3) {
                                    throw xm8.a(null, "ContentCompAlgo " + j + " not supported");
                                }
                                return;
                            case 17029:
                                if (j < 1 || j > 2) {
                                    throw xm8.a(null, "DocTypeReadVersion " + j + " not supported");
                                }
                                return;
                            case 17143:
                                if (j != 1) {
                                    throw xm8.a(null, "EBMLReadVersion " + j + " not supported");
                                }
                                return;
                            case 18401:
                                if (j != 5) {
                                    throw xm8.a(null, "ContentEncAlgo " + j + " not supported");
                                }
                                return;
                            case 18408:
                                if (j != 1) {
                                    throw xm8.a(null, "AESSettingsCipherMode " + j + " not supported");
                                }
                                return;
                            case 21420:
                                s27Var.B = j + s27Var.s;
                                return;
                            case 21432:
                                int i3 = (int) j;
                                s27Var.h(i);
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        if (i3 != 3) {
                                            if (i3 == 15) {
                                                s27Var.y.y = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        s27Var.y.y = 1;
                                        return;
                                    }
                                    s27Var.y.y = 2;
                                    return;
                                }
                                s27Var.y.y = 0;
                                return;
                            case 21680:
                                s27Var.h(i);
                                s27Var.y.q = (int) j;
                                return;
                            case 21682:
                                s27Var.h(i);
                                s27Var.y.s = (int) j;
                                return;
                            case 21690:
                                s27Var.h(i);
                                s27Var.y.r = (int) j;
                                return;
                            case 21930:
                                s27Var.h(i);
                                r27 r27Var2 = s27Var.y;
                                if (j == 1) {
                                    z = true;
                                }
                                r27Var2.X = z;
                                return;
                            case 21938:
                                s27Var.h(i);
                                r27 r27Var3 = s27Var.y;
                                r27Var3.z = true;
                                r27Var3.p = (int) j;
                                return;
                            case 21998:
                                s27Var.h(i);
                                s27Var.y.g = (int) j;
                                return;
                            case 22186:
                                s27Var.h(i);
                                s27Var.y.T = j;
                                return;
                            case 22203:
                                s27Var.h(i);
                                s27Var.y.U = j;
                                return;
                            case 25188:
                                s27Var.h(i);
                                s27Var.y.R = (int) j;
                                return;
                            case 30114:
                                s27Var.Z = j;
                                return;
                            case 30321:
                                s27Var.h(i);
                                int i4 = (int) j;
                                if (i4 != 0) {
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            if (i4 == 3) {
                                                s27Var.y.t = 3;
                                                return;
                                            }
                                            return;
                                        }
                                        s27Var.y.t = 2;
                                        return;
                                    }
                                    s27Var.y.t = 1;
                                    return;
                                }
                                s27Var.y.t = 0;
                                return;
                            case 2352003:
                                s27Var.h(i);
                                s27Var.y.f = (int) j;
                                return;
                            case 2807729:
                                s27Var.t = j;
                                return;
                            default:
                                switch (i) {
                                    case 21945:
                                        s27Var.h(i);
                                        int i5 = (int) j;
                                        if (i5 != 1) {
                                            if (i5 == 2) {
                                                s27Var.y.C = 1;
                                                return;
                                            }
                                            return;
                                        }
                                        s27Var.y.C = 2;
                                        return;
                                    case 21946:
                                        s27Var.h(i);
                                        int g = gm1.g((int) j);
                                        if (g != -1) {
                                            s27Var.y.B = g;
                                            return;
                                        }
                                        return;
                                    case 21947:
                                        s27Var.h(i);
                                        s27Var.y.z = true;
                                        int f2 = gm1.f((int) j);
                                        if (f2 != -1) {
                                            s27Var.y.A = f2;
                                            return;
                                        }
                                        return;
                                    case 21948:
                                        s27Var.h(i);
                                        s27Var.y.D = (int) j;
                                        return;
                                    case 21949:
                                        s27Var.h(i);
                                        s27Var.y.E = (int) j;
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } else if (j != 1) {
                        throw xm8.a(null, "ContentEncodingScope " + j + " not supported");
                    }
                } else if (j != 0) {
                    throw xm8.a(null, "ContentEncodingOrder " + j + " not supported");
                }
            } else if (!s27Var.z) {
                s27Var.g(i);
                if (s27Var.G == -1) {
                    s27Var.G = j;
                }
            }
        } else if (!s27Var.z) {
            s27Var.g(i);
            if (s27Var.H == -1) {
                s27Var.H = j;
            }
        }
    }

    public boolean X(int i) {
        if (i >= 0) {
            kj kjVar = (kj) this.a;
            if (i < kjVar.a) {
                q06 l = kjVar.l(i);
                xt4 xt4Var = ((vj6) l.c).c;
                int i2 = i - l.a;
                if (xt4Var != null && xt4Var.invoke(Integer.valueOf(i2)) == p40.I) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Z(long r9, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.au
            if (r0 == 0) goto L13
            r0 = r11
            au r0 = (defpackage.au) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            au r0 = new au
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            long r9 = r0.a
            defpackage.hre.r(r11)
            goto L69
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r11 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/join"
            java.lang.String r11 = defpackage.nk2.t(r9, r11, r1)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r11)
            r1.b = r6
            hi5 r11 = new hi5
            r11.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r5) goto L69
            goto L96
        L69:
            oh5 r11 = (defpackage.oh5) r11
            te5 r8 = r11.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r11)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<m62> r3 = defpackage.m62.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r11 = defpackage.cm9.e(r11, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r11 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r11)
            r0.a = r9
            r0.d = r2
            java.lang.Object r11 = r8.a(r3, r0)
            if (r11 != r5) goto L97
        L96:
            return r5
        L97:
            if (r11 == 0) goto L9c
            or9 r11 = (defpackage.or9) r11
            return r11
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.Z(long, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(6:28|(2:31|29)|32|33|(1:35)|36)|20|21|22|23))|38|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Type inference failed for: r1v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r10, defpackage.n42 r12, java.util.List r13) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ys
            if (r0 == 0) goto L13
            r0 = r12
            ys r0 = (defpackage.ys) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ys r0 = new ys
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r12)
            goto Lb0
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r4
        L32:
            long r10 = r0.a
            defpackage.hre.r(r12)
            goto L82
        L38:
            defpackage.hre.r(r12)
            java.lang.Object r9 = r9.a
            re5 r9 = (defpackage.re5) r9
            java.lang.String r12 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/members"
            java.lang.String r12 = defpackage.nk2.t(r10, r12, r1)
            sl8 r1 = defpackage.tl8.b
            vl8 r1 = new vl8
            r6 = 8
            r1.<init>(r6)
            java.util.Iterator r6 = r13.iterator()
        L54:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L66
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "user_ids"
            r1.h(r8, r7)
            goto L54
        L66:
            java.lang.Object r13 = defpackage.sl1.e0(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L73
            java.lang.String r6 = "user_id"
            r1.h(r6, r13)
        L73:
            tl8 r13 = r1.Y()
            r0.a = r10
            r0.d = r3
            java.lang.Object r12 = defpackage.cbe.u(r9, r12, r13, r0)
            if (r12 != r5) goto L82
            goto Laf
        L82:
            oh5 r12 = (defpackage.oh5) r12
            te5 r9 = r12.y0()
            java.lang.Class<or9> r12 = defpackage.or9.class
            gi1 r13 = defpackage.cm9.a(r12)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L9f
            java.lang.Class<m62> r1 = defpackage.m62.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L9f
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L9f
            nsc r12 = defpackage.cm9.e(r12, r1)     // Catch: java.lang.Throwable -> L9f
            goto La0
        L9f:
            r12 = r4
        La0:
            isc r1 = new isc
            r1.<init>(r13, r12)
            r0.a = r10
            r0.d = r2
            java.lang.Object r12 = r9.a(r1, r0)
            if (r12 != r5) goto Lb0
        Laf:
            return r5
        Lb0:
            if (r12 == 0) goto Lb5
            or9 r12 = (defpackage.or9) r12
            return r12
        Lb5:
            java.lang.String r9 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.a(long, n42, java.util.List):java.lang.Object");
    }

    public String a0(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = ((Resources) this.a).getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    public void b(int i, int i2, s94 s94Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        s27 s27Var = (s27) this.a;
        c4d c4dVar = s27Var.b;
        SparseArray sparseArray = s27Var.c;
        km8 km8Var = s27Var.k;
        km8 km8Var2 = s27Var.i;
        int i14 = 2;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i != 165) {
                if (i != 16877) {
                    if (i != 16981) {
                        if (i != 18402) {
                            if (i != 21419) {
                                if (i != 25506) {
                                    if (i == 30322) {
                                        s27Var.h(i);
                                        byte[] bArr2 = new byte[i2];
                                        s27Var.y.x = bArr2;
                                        s94Var.readFully(bArr2, 0, i2);
                                        return;
                                    }
                                    throw xm8.a(null, "Unexpected id: " + i);
                                }
                                s27Var.h(i);
                                byte[] bArr3 = new byte[i2];
                                s27Var.y.l = bArr3;
                                s94Var.readFully(bArr3, 0, i2);
                                return;
                            }
                            Arrays.fill(km8Var.a, (byte) 0);
                            s94Var.readFully(km8Var.a, 4 - i2, i2);
                            km8Var.M(0);
                            s27Var.A = (int) km8Var.B();
                            return;
                        }
                        byte[] bArr4 = new byte[i2];
                        s94Var.readFully(bArr4, 0, i2);
                        s27Var.h(i);
                        s27Var.y.k = new ejc(1, bArr4, 0, 0);
                        return;
                    }
                    s27Var.h(i);
                    byte[] bArr5 = new byte[i2];
                    s27Var.y.j = bArr5;
                    s94Var.readFully(bArr5, 0, i2);
                    return;
                }
                s27Var.h(i);
                r27 r27Var = s27Var.y;
                int i16 = r27Var.h;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    s94Var.q(i2);
                    return;
                }
                byte[] bArr6 = new byte[i2];
                r27Var.P = bArr6;
                s94Var.readFully(bArr6, 0, i2);
                return;
            } else if (s27Var.O == 2) {
                r27 r27Var2 = (r27) sparseArray.get(s27Var.U);
                int i17 = s27Var.X;
                km8 km8Var3 = s27Var.p;
                if (i17 == 4 && "V_VP9".equals(r27Var2.c)) {
                    km8Var3.J(i2);
                    s94Var.readFully(km8Var3.a, 0, i2);
                    return;
                }
                s94Var.q(i2);
                return;
            } else {
                return;
            }
        }
        int i18 = 8;
        if (s27Var.O == 0) {
            s27Var.U = (int) c4dVar.c(s94Var, false, true, 8);
            s27Var.V = c4dVar.c;
            s27Var.Q = -9223372036854775807L;
            s27Var.O = 1;
            km8Var2.J(0);
        }
        r27 r27Var3 = (r27) sparseArray.get(s27Var.U);
        if (r27Var3 == null) {
            s94Var.q(i2 - s27Var.V);
            s27Var.O = 0;
            return;
        }
        r27Var3.a0.getClass();
        if (s27Var.O == 1) {
            s27Var.l(s94Var, 3);
            int i19 = (km8Var2.a[2] & 6) >> 1;
            if (i19 == 0) {
                s27Var.S = 1;
                int[] iArr2 = s27Var.T;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                s27Var.T = iArr2;
                iArr2[0] = (i2 - s27Var.V) - 3;
            } else {
                s27Var.l(s94Var, 4);
                int i20 = (km8Var2.a[3] & 255) + 1;
                s27Var.S = i20;
                int[] iArr3 = s27Var.T;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                s27Var.T = iArr3;
                if (i19 == 2) {
                    int i21 = s27Var.S;
                    Arrays.fill(iArr3, 0, i21, ((i2 - s27Var.V) - 4) / i21);
                } else if (i19 == 1) {
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = i3;
                    while (true) {
                        i10 = s27Var.S - 1;
                        iArr = s27Var.T;
                        if (i22 >= i10) {
                            break;
                        }
                        iArr[i22] = 0;
                        while (true) {
                            i11 = i24 + 1;
                            s27Var.l(s94Var, i11);
                            int i25 = km8Var2.a[i24] & 255;
                            int[] iArr4 = s27Var.T;
                            i12 = iArr4[i22] + i25;
                            iArr4[i22] = i12;
                            if (i25 != 255) {
                                break;
                            }
                            i24 = i11;
                        }
                        i23 += i12;
                        i22++;
                        i24 = i11;
                    }
                    iArr[i10] = ((i2 - s27Var.V) - i24) - i23;
                } else if (i19 == 3) {
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = i3;
                    while (true) {
                        int i29 = s27Var.S - 1;
                        int[] iArr5 = s27Var.T;
                        if (i26 < i29) {
                            iArr5[i26] = i15;
                            int i30 = i28 + 1;
                            s27Var.l(s94Var, i30);
                            if (km8Var2.a[i28] != 0) {
                                int i31 = i15;
                                while (true) {
                                    if (i31 < i18) {
                                        i6 = i18;
                                        int i32 = 1 << (7 - i31);
                                        i8 = i15;
                                        if ((km8Var2.a[i28] & i32) != 0) {
                                            i9 = i30 + i31;
                                            s27Var.l(s94Var, i9);
                                            i7 = i14;
                                            j = (~i32) & km8Var2.a[i28] & 255;
                                            while (i30 < i9) {
                                                j = (j << i6) | (km8Var2.a[i30] & 255);
                                                i30++;
                                            }
                                            if (i26 > 0) {
                                                j -= (1 << ((i31 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i31++;
                                            i15 = i8;
                                            i18 = i6;
                                        }
                                    } else {
                                        i6 = i18;
                                        i7 = i14;
                                        i8 = i15;
                                        j = 0;
                                        i9 = i30;
                                        break;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i33 = (int) j;
                                int[] iArr6 = s27Var.T;
                                if (i26 != 0) {
                                    i33 += iArr6[i26 - 1];
                                }
                                iArr6[i26] = i33;
                                i27 += i33;
                                i26++;
                                i28 = i9;
                                i15 = i8;
                                i18 = i6;
                                i14 = i7;
                            } else {
                                throw xm8.a(null, "No valid varint length mask found");
                            }
                        } else {
                            i4 = i14;
                            i5 = i15;
                            iArr5[i29] = ((i2 - s27Var.V) - i28) - i27;
                            break;
                        }
                    }
                    throw xm8.a(null, "EBML lacing sample size out of range.");
                } else {
                    throw xm8.a(null, "Unexpected lacing value: " + i19);
                }
            }
            i4 = 2;
            i5 = 0;
            int i34 = km8Var2.a[1] & 255;
            s27Var.P = s27Var.n(i34 | (bArr[i5] << 8)) + s27Var.M;
            if (r27Var3.e != 1 && (i != 163 || (km8Var2.a[i4] & 128) != 128)) {
                i13 = i5;
            } else {
                i13 = 1;
            }
            s27Var.W = i13;
            s27Var.O = i4;
            s27Var.R = i5;
        }
        if (i == 163) {
            while (true) {
                int i35 = s27Var.R;
                if (i35 < s27Var.S) {
                    s27Var.i(r27Var3, ((s27Var.R * r27Var3.f) / 1000) + s27Var.P, s27Var.W, s27Var.o(s94Var, r27Var3, s27Var.T[i35], false), 0);
                    s27Var.R++;
                } else {
                    s27Var.O = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i36 = s27Var.R;
                if (i36 < s27Var.S) {
                    int[] iArr7 = s27Var.T;
                    iArr7[i36] = s27Var.o(s94Var, r27Var3, iArr7[i36], true);
                    s27Var.R++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b0(long r8, defpackage.n42 r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.bu
            if (r0 == 0) goto L13
            r0 = r10
            bu r0 = (defpackage.bu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bu r0 = new bu
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r10)
            goto Lab
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            long r8 = r0.a
            defpackage.hre.r(r10)
            goto L7d
        L38:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "https://vbookapp.com/api/chat/conversations/"
            r10.<init>(r1)
            r10.append(r8)
            java.lang.String r1 = "/members/"
            r10.append(r1)
            r10.append(r11)
            java.lang.String r11 = "/kick"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            gh5 r11 = new gh5
            r11.<init>()
            pg5 r1 = defpackage.pg5.c
            r11.d(r1)
            h40 r6 = defpackage.hh5.a
            xtc r6 = r11.a
            defpackage.ytc.b(r6, r10)
            r11.b = r1
            hi5 r10 = new hi5
            r10.<init>(r11, r7)
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r5) goto L7d
            goto Laa
        L7d:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r11 = defpackage.cm9.a(r10)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L9a
            java.lang.Class<m62> r1 = defpackage.m62.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L9a
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L9a
            nsc r10 = defpackage.cm9.e(r10, r1)     // Catch: java.lang.Throwable -> L9a
            goto L9b
        L9a:
            r10 = r4
        L9b:
            isc r1 = new isc
            r1.<init>(r11, r10)
            r0.a = r8
            r0.d = r2
            java.lang.Object r10 = r7.a(r1, r0)
            if (r10 != r5) goto Lab
        Laa:
            return r5
        Lab:
            if (r10 == 0) goto Lb0
            or9 r10 = (defpackage.or9) r10
            return r10
        Lb0:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.b0(long, n42, java.lang.String):java.lang.Object");
    }

    public AudioAttributesImpl c() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.a).build());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c0(long r9, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cu
            if (r0 == 0) goto L13
            r0 = r11
            cu r0 = (defpackage.cu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cu r0 = new cu
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            long r9 = r0.a
            defpackage.hre.r(r11)
            goto L69
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r11 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/leave"
            java.lang.String r11 = defpackage.nk2.t(r9, r11, r1)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r11)
            r1.b = r6
            hi5 r11 = new hi5
            r11.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r5) goto L69
            goto L96
        L69:
            oh5 r11 = (defpackage.oh5) r11
            te5 r8 = r11.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r11)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r11 = defpackage.cm9.e(r11, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r11 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r11)
            r0.a = r9
            r0.d = r2
            java.lang.Object r11 = r8.a(r3, r0)
            if (r11 != r5) goto L97
        L96:
            return r5
        L97:
            if (r11 == 0) goto L9c
            or9 r11 = (defpackage.or9) r11
            return r11
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.c0(long, n42):java.lang.Object");
    }

    @Override // defpackage.mm1
    public long d() {
        z03 z03Var = (z03) this.a;
        ft9 ft9Var = (ft9) nye.q(z03Var, jt9.b);
        return ((h27) nye.q(z03Var, j27.a)).a.g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d0(long r9, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.du
            if (r0 == 0) goto L13
            r0 = r11
            du r0 = (defpackage.du) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            du r0 = new du
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            long r9 = r0.a
            defpackage.hre.r(r11)
            goto L69
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r11 = "https://vbookapp.com/api/post/"
            java.lang.String r1 = "/like"
            java.lang.String r11 = defpackage.nk2.t(r9, r11, r1)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r11)
            r1.b = r6
            hi5 r11 = new hi5
            r11.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r5) goto L69
            goto L96
        L69:
            oh5 r11 = (defpackage.oh5) r11
            te5 r8 = r11.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r11)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L86
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r11 = defpackage.cm9.e(r11, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r11 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r11)
            r0.a = r9
            r0.d = r2
            java.lang.Object r11 = r8.a(r3, r0)
            if (r11 != r5) goto L97
        L96:
            return r5
        L97:
            if (r11 == 0) goto L9c
            or9 r11 = (defpackage.or9) r11
            return r11
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Boolean>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.d0(long, n42):java.lang.Object");
    }

    @Override // defpackage.g32
    public boolean e(e32 e32Var) {
        e32Var.getClass();
        return e32Var.a((e32) this.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e0(int r9, defpackage.n42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.eu
            if (r0 == 0) goto L13
            r0 = r10
            eu r0 = (defpackage.eu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            eu r0 = new eu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            int r9 = r0.a
            defpackage.hre.r(r10)
            goto L69
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r10 = "https://vbookapp.com/api/topic/"
            java.lang.String r1 = "/like"
            java.lang.String r10 = defpackage.hl5.l(r10, r1, r9)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r10)
            r1.b = r6
            hi5 r10 = new hi5
            r10.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r5) goto L69
            goto L96
        L69:
            oh5 r10 = (defpackage.oh5) r10
            te5 r8 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L86
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r10 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r9
            r0.d = r2
            java.lang.Object r10 = r8.a(r3, r0)
            if (r10 != r5) goto L97
        L96:
            return r5
        L97:
            if (r10 == 0) goto L9c
            or9 r10 = (defpackage.or9) r10
            return r10
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Boolean>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.e0(int, n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f(defpackage.vq4 r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.d
            java.lang.String r1 = r8.b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L2b
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L2b
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            java.lang.String r2 = defpackage.a2d.a
            java.util.Locale$Category r2 = java.util.Locale.Category.DISPLAY
            java.util.Locale r2 = java.util.Locale.getDefault(r2)
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L2d
        L2b:
            r0 = r3
            goto L4e
        L2d:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4e
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L4e
        L4e:
            java.lang.String r8 = r7.g(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r7 = r7.a0(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L68
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L67
            r1 = r3
        L67:
            r7 = r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.f(vq4):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f0(int r9, defpackage.n42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.fu
            if (r0 == 0) goto L13
            r0 = r10
            fu r0 = (defpackage.fu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fu r0 = new fu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            int r9 = r0.a
            defpackage.hre.r(r10)
            goto L69
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r10 = "https://vbookapp.com/api/topic/"
            java.lang.String r1 = "/lock"
            java.lang.String r10 = defpackage.hl5.l(r10, r1, r9)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r10)
            r1.b = r6
            hi5 r10 = new hi5
            r10.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r5) goto L69
            goto L96
        L69:
            oh5 r10 = (defpackage.oh5) r10
            te5 r8 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r10 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r9
            r0.d = r2
            java.lang.Object r10 = r8.a(r3, r0)
            if (r10 != r5) goto L97
        L96:
            return r5
        L97:
            if (r10 == 0) goto L9c
            or9 r10 = (defpackage.or9) r10
            return r10
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.f0(int, n42):java.lang.Object");
    }

    public String g(vq4 vq4Var) {
        String str;
        Resources resources = (Resources) this.a;
        int i = vq4Var.f;
        if ((i & 2) != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        if ((i & 4) != 0) {
            str = a0(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            str = a0(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i & 1088) != 0) {
            return a0(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public bc7 g0() {
        bc7 bc7Var = new bc7();
        bc7Var.a = (y67) this.a;
        return bc7Var;
    }

    @Override // defpackage.k99
    public Object get() {
        return new jx3((l99) ((nt2) this.a).a);
    }

    public void h(CancellationException cancellationException) {
        gw7 gw7Var = (gw7) this.a;
        int i = gw7Var.c;
        e61[] e61VarArr = new e61[i];
        for (int i2 = 0; i2 < i; i2++) {
            e61VarArr[i2] = ((h22) gw7Var.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            e61VarArr[i3].a(cancellationException);
        }
        if (gw7Var.c == 0) {
            return;
        }
        ov5.c("uncancelled requests present");
    }

    public void h0() {
        ((tr4) this.a).f.Q();
    }

    @Override // defpackage.ad
    public void i(Bundle bundle) {
        ((xc) ((wc) this.a)).a("clx", "_ae", bundle);
    }

    public void i0() {
        long j;
        of2 of2Var = (of2) this.a;
        synchronized (iwe.c) {
            try {
                if (iwe.d) {
                    j = iwe.e;
                } else {
                    j = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        of2Var.K = j;
        of2Var.x(true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(1:30)|31)|20|21|22|23))|33|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Type inference failed for: r8v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(int r7, defpackage.n42 r8, java.lang.Long r9, java.lang.String r10) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.zs
            if (r0 == 0) goto L13
            r0 = r8
            zs r0 = (defpackage.zs) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zs r0 = new zs
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r8)
            goto La4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            int r7 = r0.a
            defpackage.hre.r(r8)
            goto L76
        L38:
            defpackage.hre.r(r8)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r8 = defpackage.tl8.b
            vl8 r8 = new vl8
            r1 = 8
            r8.<init>(r1)
            java.lang.String r1 = "content"
            r8.h(r1, r10)
            java.lang.String r10 = "type"
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r8.h(r10, r1)
            if (r9 == 0) goto L65
            long r9 = r9.longValue()
            java.lang.String r1 = "quote_id"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.h(r1, r9)
        L65:
            tl8 r8 = r8.Y()
            r0.a = r7
            r0.d = r3
            java.lang.String r9 = "https://vbookapp.com/api/chat"
            java.lang.Object r8 = defpackage.cbe.u(r6, r9, r8, r0)
            if (r8 != r5) goto L76
            goto La3
        L76:
            oh5 r8 = (defpackage.oh5) r8
            te5 r6 = r8.y0()
            java.lang.Class<or9> r8 = defpackage.or9.class
            gi1 r9 = defpackage.cm9.a(r8)
            w76 r10 = defpackage.w76.c     // Catch: java.lang.Throwable -> L93
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L93
            nsc r10 = defpackage.cm9.d(r10)     // Catch: java.lang.Throwable -> L93
            w76 r10 = defpackage.v9e.y(r10)     // Catch: java.lang.Throwable -> L93
            nsc r8 = defpackage.cm9.e(r8, r10)     // Catch: java.lang.Throwable -> L93
            goto L94
        L93:
            r8 = r4
        L94:
            isc r10 = new isc
            r10.<init>(r9, r8)
            r0.a = r7
            r0.d = r2
            java.lang.Object r8 = r6.a(r10, r0)
            if (r8 != r5) goto La4
        La3:
            return r5
        La4:
            if (r8 == 0) goto La9
            or9 r8 = (defpackage.or9) r8
            return r8
        La9:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Long>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.j(int, n42, java.lang.Long, java.lang.String):java.lang.Object");
    }

    public void j0() {
        ((y67) this.a).d = x67.c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(1:30)|31)|20|21|22|23))|33|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r14 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        if (r14 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Type inference failed for: r1v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(long r9, java.lang.String r11, int r12, java.lang.Long r13, defpackage.n42 r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof defpackage.at
            if (r0 == 0) goto L13
            r0 = r14
            at r0 = (defpackage.at) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            at r0 = new at
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r14)
            goto Lb0
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L32:
            int r12 = r0.b
            long r9 = r0.a
            defpackage.hre.r(r14)
            goto L80
        L3a:
            defpackage.hre.r(r14)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r14 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/messages"
            java.lang.String r14 = defpackage.nk2.t(r9, r14, r1)
            sl8 r1 = defpackage.tl8.b
            vl8 r1 = new vl8
            r6 = 8
            r1.<init>(r6)
            java.lang.String r6 = "content"
            r1.h(r6, r11)
            java.lang.String r11 = "type"
            java.lang.String r6 = java.lang.String.valueOf(r12)
            r1.h(r11, r6)
            if (r13 == 0) goto L6f
            long r6 = r13.longValue()
            java.lang.String r11 = "quote_id"
            java.lang.String r13 = java.lang.String.valueOf(r6)
            r1.h(r11, r13)
        L6f:
            tl8 r11 = r1.Y()
            r0.a = r9
            r0.b = r12
            r0.e = r3
            java.lang.Object r14 = defpackage.cbe.u(r8, r14, r11, r0)
            if (r14 != r5) goto L80
            goto Laf
        L80:
            oh5 r14 = (defpackage.oh5) r14
            te5 r8 = r14.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r13 = defpackage.cm9.a(r11)
            w76 r14 = defpackage.w76.c     // Catch: java.lang.Throwable -> L9d
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9d
            nsc r14 = defpackage.cm9.d(r14)     // Catch: java.lang.Throwable -> L9d
            w76 r14 = defpackage.v9e.y(r14)     // Catch: java.lang.Throwable -> L9d
            nsc r11 = defpackage.cm9.e(r11, r14)     // Catch: java.lang.Throwable -> L9d
            goto L9e
        L9d:
            r11 = r4
        L9e:
            isc r14 = new isc
            r14.<init>(r13, r11)
            r0.a = r9
            r0.b = r12
            r0.e = r2
            java.lang.Object r14 = r8.a(r14, r0)
            if (r14 != r5) goto Lb0
        Laf:
            return r5
        Lb0:
            if (r14 == 0) goto Lb5
            or9 r14 = (defpackage.or9) r14
            return r14
        Lb5:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Long>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.k(long, java.lang.String, int, java.lang.Long, n42):java.lang.Object");
    }

    public Bundle k0() {
        Bundle bundle = (Bundle) this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.String r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.bt
            if (r0 == 0) goto L13
            r0 = r9
            bt r0 = (defpackage.bt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bt r0 = new bt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L8f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            defpackage.hre.r(r9)
            goto L63
        L35:
            defpackage.hre.r(r9)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r9 = "https://vbookapp.com/api/chat/conversations/direct/"
            java.lang.String r8 = defpackage.s21.m(r9, r8)
            gh5 r9 = new gh5
            r9.<init>()
            pg5 r1 = defpackage.pg5.c
            r9.d(r1)
            h40 r6 = defpackage.hh5.a
            xtc r6 = r9.a
            defpackage.ytc.b(r6, r8)
            r9.b = r1
            hi5 r8 = new hi5
            r8.<init>(r9, r7)
            r0.c = r3
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r5) goto L63
            goto L8e
        L63:
            oh5 r9 = (defpackage.oh5) r9
            te5 r7 = r9.y0()
            java.lang.Class<or9> r8 = defpackage.or9.class
            gi1 r9 = defpackage.cm9.a(r8)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L80
            java.lang.Class<m62> r1 = defpackage.m62.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L80
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L80
            nsc r8 = defpackage.cm9.e(r8, r1)     // Catch: java.lang.Throwable -> L80
            goto L81
        L80:
            r8 = r4
        L81:
            isc r1 = new isc
            r1.<init>(r9, r8)
            r0.c = r2
            java.lang.Object r9 = r7.a(r1, r0)
            if (r9 != r5) goto L8f
        L8e:
            return r5
        L8f:
            if (r9 == 0) goto L94
            or9 r9 = (defpackage.or9) r9
            return r9
        L94:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.l(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        r11.N(6);
        r4 = r11.y();
        r5 = r4 + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r3 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        r3 = new byte[r5];
        java.lang.System.arraycopy(r11.a, r8, r3, 0, 10);
        r12.x(r3, 10, r4);
        r3 = new defpackage.vk5(r13).M(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        r12.i(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.tb7 l0(defpackage.s94 r12, defpackage.tk5 r13, int r14) {
        /*
            r11 = this;
            java.lang.Object r11 = r11.a
            km8 r11 = (defpackage.km8) r11
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L8:
            r4 = r0
        L9:
            int r5 = r4 % 10
            int r6 = r5 + 10
            r7 = 10
            if (r5 != 0) goto L1a
            if (r4 == 0) goto L1a
            byte[] r8 = r11.a
            r9 = 9
            java.lang.System.arraycopy(r8, r7, r8, r0, r9)
        L1a:
            if (r4 != 0) goto L1e
            r8 = r7
            goto L1f
        L1e:
            r8 = 1
        L1f:
            byte[] r9 = r11.a     // Catch: java.io.EOFException -> L86
            int r10 = r6 - r8
            r12.x(r9, r10, r8)     // Catch: java.io.EOFException -> L86
            r11.M(r5)
            r11.L(r6)
            int r5 = r11.a()
            r6 = 3
            if (r5 < r6) goto L7e
            int r5 = r11.C()
            int r8 = r11.b
            int r8 = r8 - r6
            r11.b = r8
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r5 != r6) goto L66
            r4 = 6
            r11.N(r4)
            int r4 = r11.y()
            int r5 = r4 + 10
            if (r3 != 0) goto L61
            byte[] r3 = new byte[r5]
            byte[] r6 = r11.a
            java.lang.System.arraycopy(r6, r8, r3, r0, r7)
            r12.x(r3, r7, r4)
            vk5 r4 = new vk5
            r4.<init>(r13)
            tb7 r3 = r4.M(r3, r5)
            goto L64
        L61:
            r12.i(r4)
        L64:
            int r2 = r2 + r5
            goto L8
        L66:
            int r5 = r11.i()
            int r5 = defpackage.y9e.p(r5)
            r6 = -1
            if (r5 == r6) goto L72
            goto L86
        L72:
            if (r4 != 0) goto L79
            r5 = 20
            r11.c(r5)
        L79:
            int r4 = r4 + 1
            if (r4 <= r14) goto L9
            goto L86
        L7e:
            int r12 = r11.b
            int r11 = r11.c
            defpackage.xk5.h(r12, r11)
            return r1
        L86:
            r12.p()
            r12.i(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.l0(s94, tk5, int):tb7");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(6:28|(2:31|29)|32|33|(1:35)|36)|20|21|22|23))|38|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Type inference failed for: r11v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.lang.String r7, java.util.List r8, java.lang.String r9, java.lang.String r10, defpackage.n42 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.ct
            if (r0 == 0) goto L13
            r0 = r11
            ct r0 = (defpackage.ct) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ct r0 = new ct
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r11)
            goto La8
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            defpackage.hre.r(r11)
            goto L7c
        L36:
            defpackage.hre.r(r11)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r11 = defpackage.tl8.b
            vl8 r11 = new vl8
            r1 = 8
            r11.<init>(r1)
            java.lang.String r1 = "name"
            r11.h(r1, r7)
            java.util.Iterator r7 = r8.iterator()
        L4f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L61
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r1 = "member_ids"
            r11.h(r1, r8)
            goto L4f
        L61:
            java.lang.String r7 = "visibility"
            r11.h(r7, r9)
            if (r10 == 0) goto L6d
            java.lang.String r7 = "image"
            r11.h(r7, r10)
        L6d:
            tl8 r7 = r11.Y()
            r0.c = r3
            java.lang.String r8 = "https://vbookapp.com/api/chat/conversations/group"
            java.lang.Object r11 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r11 != r5) goto L7c
            goto La7
        L7c:
            oh5 r11 = (defpackage.oh5) r11
            te5 r6 = r11.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r9 = defpackage.w76.c     // Catch: java.lang.Throwable -> L99
            java.lang.Class<m62> r9 = defpackage.m62.class
            nsc r9 = defpackage.cm9.d(r9)     // Catch: java.lang.Throwable -> L99
            w76 r9 = defpackage.v9e.y(r9)     // Catch: java.lang.Throwable -> L99
            nsc r7 = defpackage.cm9.e(r7, r9)     // Catch: java.lang.Throwable -> L99
            goto L9a
        L99:
            r7 = r4
        L9a:
            isc r9 = new isc
            r9.<init>(r8, r7)
            r0.c = r2
            java.lang.Object r11 = r6.a(r9, r0)
            if (r11 != r5) goto La8
        La7:
            return r5
        La8:
            if (r11 == 0) goto Lad
            or9 r11 = (defpackage.or9) r11
            return r11
        Lad:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.m(java.lang.String, java.util.List, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(1:30)|31)|20|21|22|23))|33|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r1v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m0(long r8, java.lang.String r10, java.lang.String r11, defpackage.n42 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.gu
            if (r0 == 0) goto L13
            r0 = r12
            gu r0 = (defpackage.gu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gu r0 = new gu
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r12)
            goto L98
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            long r8 = r0.a
            defpackage.hre.r(r12)
            goto L6a
        L37:
            defpackage.hre.r(r12)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r12 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/rename"
            java.lang.String r12 = defpackage.nk2.t(r8, r12, r1)
            sl8 r1 = defpackage.tl8.b
            vl8 r1 = new vl8
            r6 = 8
            r1.<init>(r6)
            java.lang.String r6 = "name"
            r1.h(r6, r10)
            if (r11 == 0) goto L5b
            java.lang.String r10 = "image"
            r1.h(r10, r11)
        L5b:
            tl8 r10 = r1.Y()
            r0.a = r8
            r0.d = r3
            java.lang.Object r12 = defpackage.cbe.u(r7, r12, r10, r0)
            if (r12 != r5) goto L6a
            goto L97
        L6a:
            oh5 r12 = (defpackage.oh5) r12
            te5 r7 = r12.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r11 = defpackage.cm9.a(r10)
            w76 r12 = defpackage.w76.c     // Catch: java.lang.Throwable -> L87
            java.lang.Class<m62> r12 = defpackage.m62.class
            nsc r12 = defpackage.cm9.d(r12)     // Catch: java.lang.Throwable -> L87
            w76 r12 = defpackage.v9e.y(r12)     // Catch: java.lang.Throwable -> L87
            nsc r10 = defpackage.cm9.e(r10, r12)     // Catch: java.lang.Throwable -> L87
            goto L88
        L87:
            r10 = r4
        L88:
            isc r12 = new isc
            r12.<init>(r11, r10)
            r0.a = r8
            r0.d = r2
            java.lang.Object r12 = r7.a(r12, r0)
            if (r12 != r5) goto L98
        L97:
            return r5
        L98:
            if (r12 == 0) goto L9d
            or9 r12 = (defpackage.or9) r12
            return r12
        L9d:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.m0(long, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(1:30)|31)|20|21|22|23))|33|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Type inference failed for: r1v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(int r8, defpackage.n42 r9, java.lang.Long r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dt
            if (r0 == 0) goto L13
            r0 = r9
            dt r0 = (defpackage.dt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dt r0 = new dt
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r9)
            goto La1
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r8 = r0.a
            defpackage.hre.r(r9)
            goto L73
        L38:
            defpackage.hre.r(r9)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r9 = "https://vbookapp.com/api/post/"
            java.lang.String r1 = "/answer"
            java.lang.String r9 = defpackage.hl5.l(r9, r1, r8)
            sl8 r1 = defpackage.tl8.b
            vl8 r1 = new vl8
            r6 = 8
            r1.<init>(r6)
            java.lang.String r6 = "content"
            r1.h(r6, r11)
            if (r10 == 0) goto L64
            long r10 = r10.longValue()
            java.lang.String r6 = "quote_id"
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r1.h(r6, r10)
        L64:
            tl8 r10 = r1.Y()
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.cbe.u(r7, r9, r10, r0)
            if (r9 != r5) goto L73
            goto La0
        L73:
            oh5 r9 = (defpackage.oh5) r9
            te5 r7 = r9.y0()
            java.lang.Class<or9> r9 = defpackage.or9.class
            gi1 r10 = defpackage.cm9.a(r9)
            w76 r11 = defpackage.w76.c     // Catch: java.lang.Throwable -> L90
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L90
            nsc r11 = defpackage.cm9.d(r11)     // Catch: java.lang.Throwable -> L90
            w76 r11 = defpackage.v9e.y(r11)     // Catch: java.lang.Throwable -> L90
            nsc r9 = defpackage.cm9.e(r9, r11)     // Catch: java.lang.Throwable -> L90
            goto L91
        L90:
            r9 = r4
        L91:
            isc r11 = new isc
            r11.<init>(r10, r9)
            r0.a = r8
            r0.d = r2
            java.lang.Object r9 = r7.a(r11, r0)
            if (r9 != r5) goto La1
        La0:
            return r5
        La1:
            if (r9 == 0) goto La6
            or9 r9 = (defpackage.or9) r9
            return r9
        La6:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Long>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.n(int, n42, java.lang.Long, java.lang.String):java.lang.Object");
    }

    public void n0() {
        gw7 gw7Var = (gw7) this.a;
        ty5 F = dce.F(0, gw7Var.c);
        int i = F.a;
        int i2 = F.b;
        if (i <= i2) {
            while (true) {
                ((h22) gw7Var.a[i]).b.resumeWith(pvc.a);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        gw7Var.g();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(5:28|(1:30)|(1:32)|(1:34)|35)|20|21|22|23))|37|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Type inference failed for: r11v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, defpackage.n42 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.et
            if (r0 == 0) goto L13
            r0 = r11
            et r0 = (defpackage.et) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            et r0 = new et
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r11)
            goto Laf
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L32:
            int r10 = r0.a
            defpackage.hre.r(r11)
            goto L81
        L38:
            defpackage.hre.r(r11)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r11 = defpackage.tl8.b
            vl8 r11 = new vl8
            r1 = 8
            r11.<init>(r1)
            if (r7 == 0) goto L4f
            java.lang.String r1 = "title"
            r11.h(r1, r7)
        L4f:
            if (r8 == 0) goto L56
            java.lang.String r7 = "content"
            r11.h(r7, r8)
        L56:
            if (r9 == 0) goto L5d
            java.lang.String r7 = "tag"
            r11.h(r7, r9)
        L5d:
            java.lang.String r7 = "category"
            java.lang.String r8 = java.lang.String.valueOf(r10)
            r11.h(r7, r8)
            java.lang.String r7 = "type"
            r8 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r11.h(r7, r8)
            tl8 r7 = r11.Y()
            r0.a = r10
            r0.d = r3
            java.lang.String r8 = "https://vbookapp.com/api/topic"
            java.lang.Object r11 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r11 != r5) goto L81
            goto Lae
        L81:
            oh5 r11 = (defpackage.oh5) r11
            te5 r6 = r11.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r9 = defpackage.w76.c     // Catch: java.lang.Throwable -> L9e
            java.lang.Class r9 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L9e
            nsc r9 = defpackage.cm9.d(r9)     // Catch: java.lang.Throwable -> L9e
            w76 r9 = defpackage.v9e.y(r9)     // Catch: java.lang.Throwable -> L9e
            nsc r7 = defpackage.cm9.e(r7, r9)     // Catch: java.lang.Throwable -> L9e
            goto L9f
        L9e:
            r7 = r4
        L9f:
            isc r9 = new isc
            r9.<init>(r8, r7)
            r0.a = r10
            r0.d = r2
            java.lang.Object r11 = r6.a(r9, r0)
            if (r11 != r5) goto Laf
        Lae:
            return r5
        Laf:
            if (r11 == 0) goto Lb4
            or9 r11 = (defpackage.or9) r11
            return r11
        Lb4:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Long>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.o(java.lang.String, java.lang.String, java.lang.String, int, n42):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((tz6) this.a).invoke(obj);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(long r9, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ft
            if (r0 == 0) goto L13
            r0 = r11
            ft r0 = (defpackage.ft) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ft r0 = new ft
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            long r9 = r0.a
            defpackage.hre.r(r11)
            goto L69
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r11 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/delete"
            java.lang.String r11 = defpackage.nk2.t(r9, r11, r1)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r11)
            r1.b = r6
            hi5 r11 = new hi5
            r11.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r5) goto L69
            goto L96
        L69:
            oh5 r11 = (defpackage.oh5) r11
            te5 r8 = r11.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r11)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r11 = defpackage.cm9.e(r11, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r11 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r11)
            r0.a = r9
            r0.d = r2
            java.lang.Object r11 = r8.a(r3, r0)
            if (r11 != r5) goto L97
        L96:
            return r5
        L97:
            if (r11 == 0) goto L9c
            or9 r11 = (defpackage.or9) r11
            return r11
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.p(long, n42):java.lang.Object");
    }

    public fz4 p0() {
        ((AudioAttributes.Builder) this.a).setUsage(1);
        return this;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(long r9, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.gt
            if (r0 == 0) goto L13
            r0 = r11
            gt r0 = (defpackage.gt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gt r0 = new gt
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            long r9 = r0.a
            defpackage.hre.r(r11)
            goto L69
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r11 = "https://vbookapp.com/api/post/"
            java.lang.String r1 = "/delete"
            java.lang.String r11 = defpackage.nk2.t(r9, r11, r1)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r11)
            r1.b = r6
            hi5 r11 = new hi5
            r11.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r5) goto L69
            goto L96
        L69:
            oh5 r11 = (defpackage.oh5) r11
            te5 r8 = r11.y0()
            java.lang.Class<or9> r11 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r11)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r11 = defpackage.cm9.e(r11, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r11 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r11)
            r0.a = r9
            r0.d = r2
            java.lang.Object r11 = r8.a(r3, r0)
            if (r11 != r5) goto L97
        L96:
            return r5
        L97:
            if (r11 == 0) goto L9c
            or9 r11 = (defpackage.or9) r11
            return r11
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.q(long, n42):java.lang.Object");
    }

    public /* bridge */ fz4 q0() {
        return p0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(int r9, defpackage.n42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ht
            if (r0 == 0) goto L13
            r0 = r10
            ht r0 = (defpackage.ht) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ht r0 = new ht
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            int r9 = r0.a
            defpackage.hre.r(r10)
            goto L69
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r10 = "https://vbookapp.com/api/topic/"
            java.lang.String r1 = "/delete"
            java.lang.String r10 = defpackage.hl5.l(r10, r1, r9)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r10)
            r1.b = r6
            hi5 r10 = new hi5
            r10.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r5) goto L69
            goto L96
        L69:
            oh5 r10 = (defpackage.oh5) r10
            te5 r8 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r10 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r9
            r0.d = r2
            java.lang.Object r10 = r8.a(r3, r0)
            if (r10 != r5) goto L97
        L96:
            return r5
        L97:
            if (r10 == 0) goto L9c
            or9 r10 = (defpackage.or9) r10
            return r10
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.r(int, n42):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [r27, java.lang.Object] */
    public void r0(long j, long j2, int i) {
        s27 s27Var = (s27) this.a;
        s27Var.j0.getClass();
        if (i != 160) {
            if (i != 174) {
                if (i != 183) {
                    if (i != 187) {
                        if (i != 19899) {
                            if (i != 20533) {
                                if (i != 21968) {
                                    if (i != 408125543) {
                                        if (i != 475249515) {
                                            if (i == 524531317 && !s27Var.z) {
                                                if (s27Var.d && s27Var.K != -1) {
                                                    s27Var.J = true;
                                                    return;
                                                }
                                                s27Var.j0.v(new ge0(s27Var.v));
                                                s27Var.z = true;
                                                return;
                                            }
                                            return;
                                        } else if (!s27Var.z) {
                                            s27Var.D = true;
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    long j3 = s27Var.s;
                                    if (j3 != -1 && j3 != j) {
                                        throw xm8.a(null, "Multiple Segment elements not supported");
                                    }
                                    s27Var.s = j;
                                    s27Var.r = j2;
                                    return;
                                }
                                s27Var.h(i);
                                s27Var.y.z = true;
                                return;
                            }
                            s27Var.h(i);
                            s27Var.y.i = true;
                            return;
                        }
                        s27Var.A = -1;
                        s27Var.B = -1L;
                        return;
                    } else if (!s27Var.z) {
                        s27Var.g(i);
                        s27Var.E = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                } else if (!s27Var.z) {
                    s27Var.g(i);
                    s27Var.F = -1;
                    s27Var.G = -1L;
                    s27Var.H = -1L;
                    return;
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.n = -1;
            obj.o = -1;
            obj.p = -1;
            obj.q = -1;
            obj.r = -1;
            obj.s = 0;
            obj.t = -1;
            obj.u = nae.e;
            obj.v = nae.e;
            obj.w = nae.e;
            obj.x = null;
            obj.y = -1;
            obj.z = false;
            obj.A = -1;
            obj.B = -1;
            obj.C = -1;
            obj.D = 1000;
            obj.E = Context.VERSION_ES6;
            obj.F = -1.0f;
            obj.G = -1.0f;
            obj.H = -1.0f;
            obj.I = -1.0f;
            obj.J = -1.0f;
            obj.K = -1.0f;
            obj.L = -1.0f;
            obj.M = -1.0f;
            obj.N = -1.0f;
            obj.O = -1.0f;
            obj.Q = 1;
            obj.R = -1;
            obj.S = 8000;
            obj.T = 0L;
            obj.U = 0L;
            obj.W = false;
            obj.Y = true;
            obj.Z = "eng";
            s27Var.y = obj;
            obj.a = s27Var.w;
            return;
        }
        s27Var.Y = false;
        s27Var.Z = 0L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r9 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.jt
            if (r0 == 0) goto L13
            r0 = r9
            jt r0 = (defpackage.jt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jt r0 = new jt
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r9)
            goto L8b
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            defpackage.hre.r(r9)
            goto L5f
        L35:
            defpackage.hre.r(r9)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            gh5 r9 = new gh5
            r9.<init>()
            pg5 r1 = defpackage.pg5.f
            r9.d(r1)
            h40 r6 = defpackage.hh5.a
            xtc r6 = r9.a
            java.lang.String r7 = "https://vbookapp.com/api/user/account"
            defpackage.ytc.b(r6, r7)
            r9.b = r1
            hi5 r1 = new hi5
            r1.<init>(r9, r8)
            r0.c = r3
            java.lang.Object r9 = r1.c(r0)
            if (r9 != r5) goto L5f
            goto L8a
        L5f:
            oh5 r9 = (defpackage.oh5) r9
            te5 r8 = r9.y0()
            java.lang.Class<or9> r9 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r9)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L7c
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L7c
            nsc r9 = defpackage.cm9.e(r9, r3)     // Catch: java.lang.Throwable -> L7c
            goto L7d
        L7c:
            r9 = r4
        L7d:
            isc r3 = new isc
            r3.<init>(r1, r9)
            r0.c = r2
            java.lang.Object r9 = r8.a(r3, r0)
            if (r9 != r5) goto L8b
        L8a:
            return r5
        L8b:
            if (r9 == 0) goto L90
            or9 r9 = (defpackage.or9) r9
            return r9
        L90:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.s(n42):java.lang.Object");
    }

    public void s0(int i, String str) {
        s27 s27Var = (s27) this.a;
        if (i != 134) {
            if (i != 17026) {
                if (i != 21358) {
                    if (i != 2274716) {
                        return;
                    }
                    s27Var.h(i);
                    s27Var.y.Z = str;
                    return;
                }
                s27Var.h(i);
                s27Var.y.b = str;
                return;
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw xm8.a(null, "DocType " + str + " not supported");
            } else {
                s27Var.w = str.equals("webm");
                return;
            }
        }
        s27Var.h(i);
        s27Var.y.c = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(int r8, int r9, defpackage.n42 r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.kt
            if (r0 == 0) goto L13
            r0 = r10
            kt r0 = (defpackage.kt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kt r0 = new kt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r10)
            goto Lb5
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r9 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r10)
            goto L7b
        L3a:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r10 = new gh5
            r10.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r10.a
            java.lang.String r6 = "https://vbookapp.com/api/users"
            defpackage.ytc.b(r1, r6)
            java.lang.String r1 = "search"
            defpackage.kqe.v(r10, r1, r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r8)
            java.lang.String r1 = "page"
            defpackage.kqe.v(r10, r1, r11)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r9)
            java.lang.String r1 = "limit"
            defpackage.kqe.v(r10, r1, r11)
            pg5 r11 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r10, r11, r10, r7)
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L7b
            goto Lb4
        L7b:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r11 = defpackage.cm9.a(r10)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> La2
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<vzc> r3 = defpackage.vzc.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> La2
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> La2
            nsc r1 = defpackage.cm9.e(r1, r3)     // Catch: java.lang.Throwable -> La2
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> La2
            nsc r10 = defpackage.cm9.e(r10, r1)     // Catch: java.lang.Throwable -> La2
            goto La3
        La2:
            r10 = r4
        La3:
            isc r1 = new isc
            r1.<init>(r11, r10)
            r0.a = r8
            r0.b = r9
            r0.e = r2
            java.lang.Object r10 = r7.a(r1, r0)
            if (r10 != r5) goto Lb5
        Lb4:
            return r5
        Lb5:
            if (r10 == 0) goto Lba
            or9 r10 = (defpackage.or9) r10
            return r10
        Lba:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.UserDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.t(int, int, n42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r5.a > ((defpackage.uf2) r1).a) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t0(defpackage.xya r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r4 = r4.a
            cza r4 = (defpackage.cza) r4
        L7:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            xya r1 = (defpackage.xya) r1
            boolean r2 = r1 instanceof defpackage.mh9
            if (r2 != 0) goto L3c
            bvc r2 = defpackage.bvc.b
            boolean r2 = defpackage.c16.i(r1, r2)
            if (r2 == 0) goto L1b
            goto L3c
        L1b:
            boolean r2 = r1 instanceof defpackage.uf2
            if (r2 == 0) goto L29
            int r2 = r5.a
            r3 = r1
            uf2 r3 = (defpackage.uf2) r3
            int r3 = r3.a
            if (r2 <= r3) goto L3d
            goto L3c
        L29:
            boolean r2 = r1 instanceof defpackage.gf4
            if (r2 == 0) goto L2e
            goto L3d
        L2e:
            boolean r4 = r1 instanceof defpackage.x28
            if (r4 == 0) goto L38
            java.lang.String r4 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.vs.k(r4)
            return
        L38:
            defpackage.xk5.o()
            return
        L3c:
            r1 = r5
        L3d:
            boolean r0 = r4.l(r0, r1)
            if (r0 == 0) goto L7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.t0(xya):void");
    }

    public boolean u(String str) {
        String Q = Q(str);
        if (!"1".equals(Q) && !Boolean.parseBoolean(Q)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u0(int r9, defpackage.n42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.hu
            if (r0 == 0) goto L13
            r0 = r10
            hu r0 = (defpackage.hu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            hu r0 = new hu
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L97
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L31:
            int r9 = r0.a
            defpackage.hre.r(r10)
            goto L69
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r8 = r8.a
            re5 r8 = (defpackage.re5) r8
            java.lang.String r10 = "https://vbookapp.com/api/topic/"
            java.lang.String r1 = "/unlock"
            java.lang.String r10 = defpackage.hl5.l(r10, r1, r9)
            gh5 r1 = new gh5
            r1.<init>()
            pg5 r6 = defpackage.pg5.c
            r1.d(r6)
            h40 r7 = defpackage.hh5.a
            xtc r7 = r1.a
            defpackage.ytc.b(r7, r10)
            r1.b = r6
            hi5 r10 = new hi5
            r10.<init>(r1, r8)
            r0.a = r9
            r0.d = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r5) goto L69
            goto L96
        L69:
            oh5 r10 = (defpackage.oh5) r10
            te5 r8 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L86
            java.lang.Class<r28> r3 = defpackage.r28.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L86
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L86
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L86
            goto L87
        L86:
            r10 = r4
        L87:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r9
            r0.d = r2
            java.lang.Object r10 = r8.a(r3, r0)
            if (r10 != r5) goto L97
        L96:
            return r5
        L97:
            if (r10 == 0) goto L9c
            or9 r10 = (defpackage.or9) r10
            return r10
        L9c:
            java.lang.String r8 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.u0(int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(int r8, int r9, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.lt
            if (r0 == 0) goto L13
            r0 = r10
            lt r0 = (defpackage.lt) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            lt r0 = new lt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r10)
            goto Lb0
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r9 = r0.b
            int r8 = r0.a
            defpackage.hre.r(r10)
            goto L76
        L3a:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            gh5 r10 = new gh5
            r10.<init>()
            h40 r1 = defpackage.hh5.a
            xtc r1 = r10.a
            java.lang.String r6 = "https://vbookapp.com/api/chat"
            defpackage.ytc.b(r1, r6)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r8)
            java.lang.String r6 = "page"
            defpackage.kqe.v(r10, r6, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            java.lang.String r6 = "limit"
            defpackage.kqe.v(r10, r6, r1)
            pg5 r1 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r10, r1, r10, r7)
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L76
            goto Laf
        L76:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L9d
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<ia7> r6 = defpackage.ia7.class
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> L9d
            w76 r6 = defpackage.v9e.y(r6)     // Catch: java.lang.Throwable -> L9d
            nsc r3 = defpackage.cm9.e(r3, r6)     // Catch: java.lang.Throwable -> L9d
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L9d
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L9d
            goto L9e
        L9d:
            r10 = r4
        L9e:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r8
            r0.b = r9
            r0.e = r2
            java.lang.Object r10 = r7.a(r3, r0)
            if (r10 != r5) goto Lb0
        Laf:
            return r5
        Lb0:
            if (r10 == 0) goto Lb5
            or9 r10 = (defpackage.or9) r10
            return r10
        Lb5:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.MessageDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.v(int, int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Type inference failed for: r8v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v0(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.iu
            if (r0 == 0) goto L13
            r0 = r8
            iu r0 = (defpackage.iu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            iu r0 = new iu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)
            goto L85
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            defpackage.hre.r(r8)
            goto L59
        L35:
            defpackage.hre.r(r8)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r8 = defpackage.tl8.b
            vl8 r8 = new vl8
            r1 = 8
            r8.<init>(r1)
            java.lang.String r1 = "token"
            r8.h(r1, r7)
            tl8 r7 = r8.Y()
            r0.c = r3
            java.lang.String r8 = "https://vbookapp.com/api/user/fcm"
            java.lang.Object r8 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r8 != r5) goto L59
            goto L84
        L59:
            oh5 r8 = (defpackage.oh5) r8
            te5 r6 = r8.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L76
            java.lang.Class<r28> r1 = defpackage.r28.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L76
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L76
            nsc r7 = defpackage.cm9.e(r7, r1)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r7 = r4
        L77:
            isc r1 = new isc
            r1.<init>(r8, r7)
            r0.c = r2
            java.lang.Object r8 = r6.a(r1, r0)
            if (r8 != r5) goto L85
        L84:
            return r5
        L85:
            if (r8 == 0) goto L8a
            or9 r8 = (defpackage.or9) r8
            return r8
        L8a:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.v0(java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(long r8, defpackage.n42 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.mt
            if (r0 == 0) goto L13
            r0 = r10
            mt r0 = (defpackage.mt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mt r0 = new mt
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L8f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            long r8 = r0.a
            defpackage.hre.r(r10)
            goto L61
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r10 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r10 = defpackage.hl5.k(r8, r10)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r10)
            pg5 r10 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r10, r1, r7)
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = r7.c(r0)
            if (r10 != r5) goto L61
            goto L8e
        L61:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r10)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L7e
            java.lang.Class<m62> r3 = defpackage.m62.class
            nsc r3 = defpackage.cm9.d(r3)     // Catch: java.lang.Throwable -> L7e
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L7e
            nsc r10 = defpackage.cm9.e(r10, r3)     // Catch: java.lang.Throwable -> L7e
            goto L7f
        L7e:
            r10 = r4
        L7f:
            isc r3 = new isc
            r3.<init>(r1, r10)
            r0.a = r8
            r0.d = r2
            java.lang.Object r10 = r7.a(r3, r0)
            if (r10 != r5) goto L8f
        L8e:
            return r5
        L8f:
            if (r10 == 0) goto L94
            or9 r10 = (defpackage.or9) r10
            return r10
        L94:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.ConversationDto>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.w(long, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(3:28|(1:30)|31)|20|21|22|23))|33|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r10 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r1v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w0(long r8, defpackage.n42 r10, java.lang.String r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ju
            if (r0 == 0) goto L13
            r0 = r10
            ju r0 = (defpackage.ju) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ju r0 = new ju
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r10)
            goto L93
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            long r8 = r0.a
            defpackage.hre.r(r10)
            goto L65
        L37:
            defpackage.hre.r(r10)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r10 = "https://vbookapp.com/api/post/"
            java.lang.String r1 = "/update"
            java.lang.String r10 = defpackage.nk2.t(r8, r10, r1)
            sl8 r1 = defpackage.tl8.b
            vl8 r1 = new vl8
            r6 = 8
            r1.<init>(r6)
            if (r11 == 0) goto L56
            java.lang.String r6 = "content"
            r1.h(r6, r11)
        L56:
            tl8 r11 = r1.Y()
            r0.a = r8
            r0.d = r3
            java.lang.Object r10 = defpackage.cbe.u(r7, r10, r11, r0)
            if (r10 != r5) goto L65
            goto L92
        L65:
            oh5 r10 = (defpackage.oh5) r10
            te5 r7 = r10.y0()
            java.lang.Class<or9> r10 = defpackage.or9.class
            gi1 r11 = defpackage.cm9.a(r10)
            w76 r1 = defpackage.w76.c     // Catch: java.lang.Throwable -> L82
            java.lang.Class<r28> r1 = defpackage.r28.class
            nsc r1 = defpackage.cm9.d(r1)     // Catch: java.lang.Throwable -> L82
            w76 r1 = defpackage.v9e.y(r1)     // Catch: java.lang.Throwable -> L82
            nsc r10 = defpackage.cm9.e(r10, r1)     // Catch: java.lang.Throwable -> L82
            goto L83
        L82:
            r10 = r4
        L83:
            isc r1 = new isc
            r1.<init>(r11, r10)
            r0.a = r8
            r0.d = r2
            java.lang.Object r10 = r7.a(r1, r0)
            if (r10 != r5) goto L93
        L92:
            return r5
        L93:
            if (r10 == 0) goto L98
            or9 r10 = (defpackage.or9) r10
            return r10
        L98:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.w0(long, n42, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v6, types: [byte[], java.io.Serializable] */
    @Override // defpackage.un5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable x(defpackage.xq5 r5, defpackage.n42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.u91
            if (r0 == 0) goto L13
            r0 = r6
            u91 r0 = (defpackage.u91) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            u91 r0 = new u91
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.hre.r(r6)
            goto L4f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r3
        L2c:
            defpackage.hre.r(r6)
            r5.getClass()
            java.lang.String r5 = r5.b
            java.lang.String r6 = ":"
            java.lang.String r5 = defpackage.k4b.F0(r5, r6, r5)
            java.lang.Object r4 = r4.a
            w91 r4 = (defpackage.w91) r4
            cq5 r4 = r4.J
            if (r4 == 0) goto L54
            r0.c = r2
            ls3 r6 = defpackage.ls3.a
            java.lang.Object r6 = r4.s(r5, r6, r0)
            n82 r4 = defpackage.n82.a
            if (r6 != r4) goto L4f
            return r4
        L4f:
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L54
            return r6
        L54:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.x(xq5, n42):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(4:28|(1:30)|(1:32)|33)|20|21|22|23))|35|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r1v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x0(int r8, java.lang.String r9, java.lang.String r10, defpackage.n42 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.ku
            if (r0 == 0) goto L13
            r0 = r11
            ku r0 = (defpackage.ku) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ku r0 = new ku
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L9a
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L31:
            int r8 = r0.a
            defpackage.hre.r(r11)
            goto L6c
        L37:
            defpackage.hre.r(r11)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r11 = "https://vbookapp.com/api/topic/"
            java.lang.String r1 = "/update"
            java.lang.String r11 = defpackage.hl5.l(r11, r1, r8)
            sl8 r1 = defpackage.tl8.b
            vl8 r1 = new vl8
            r6 = 8
            r1.<init>(r6)
            if (r9 == 0) goto L56
            java.lang.String r6 = "title"
            r1.h(r6, r9)
        L56:
            if (r10 == 0) goto L5d
            java.lang.String r9 = "content"
            r1.h(r9, r10)
        L5d:
            tl8 r9 = r1.Y()
            r0.a = r8
            r0.d = r3
            java.lang.Object r11 = defpackage.cbe.u(r7, r11, r9, r0)
            if (r11 != r5) goto L6c
            goto L99
        L6c:
            oh5 r11 = (defpackage.oh5) r11
            te5 r7 = r11.y0()
            java.lang.Class<or9> r9 = defpackage.or9.class
            gi1 r10 = defpackage.cm9.a(r9)
            w76 r11 = defpackage.w76.c     // Catch: java.lang.Throwable -> L89
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L89
            nsc r11 = defpackage.cm9.d(r11)     // Catch: java.lang.Throwable -> L89
            w76 r11 = defpackage.v9e.y(r11)     // Catch: java.lang.Throwable -> L89
            nsc r9 = defpackage.cm9.e(r9, r11)     // Catch: java.lang.Throwable -> L89
            goto L8a
        L89:
            r9 = r4
        L8a:
            isc r11 = new isc
            r11.<init>(r10, r9)
            r0.a = r8
            r0.d = r2
            java.lang.Object r11 = r7.a(r11, r0)
            if (r11 != r5) goto L9a
        L99:
            return r5
        L9a:
            if (r11 == 0) goto L9f
            or9 r11 = (defpackage.or9) r11
            return r11
        L9f:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.Long>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.x0(int, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(long r8, int r10, int r11, defpackage.n42 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.nt
            if (r0 == 0) goto L13
            r0 = r12
            nt r0 = (defpackage.nt) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            nt r0 = new nt
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r12)
            goto Lbc
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            int r11 = r0.c
            int r10 = r0.b
            long r8 = r0.a
            defpackage.hre.r(r12)
            goto L80
        L3c:
            defpackage.hre.r(r12)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r12 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/messages"
            java.lang.String r12 = defpackage.nk2.t(r8, r12, r1)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r10)
            java.lang.String r6 = "page"
            defpackage.kqe.v(r1, r6, r12)
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            java.lang.String r6 = "limit"
            defpackage.kqe.v(r1, r6, r12)
            pg5 r12 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r12, r1, r7)
            r0.a = r8
            r0.b = r10
            r0.c = r11
            r0.f = r3
            java.lang.Object r12 = r7.c(r0)
            if (r12 != r5) goto L80
            goto Lbb
        L80:
            oh5 r12 = (defpackage.oh5) r12
            te5 r7 = r12.y0()
            java.lang.Class<or9> r12 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r12)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> La7
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<ia7> r6 = defpackage.ia7.class
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> La7
            w76 r6 = defpackage.v9e.y(r6)     // Catch: java.lang.Throwable -> La7
            nsc r3 = defpackage.cm9.e(r3, r6)     // Catch: java.lang.Throwable -> La7
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> La7
            nsc r12 = defpackage.cm9.e(r12, r3)     // Catch: java.lang.Throwable -> La7
            goto La8
        La7:
            r12 = r4
        La8:
            isc r3 = new isc
            r3.<init>(r1, r12)
            r0.a = r8
            r0.b = r10
            r0.c = r11
            r0.f = r2
            java.lang.Object r12 = r7.a(r3, r0)
            if (r12 != r5) goto Lbc
        Lbb:
            return r5
        Lbc:
            if (r12 == 0) goto Lc1
            or9 r12 = (defpackage.or9) r12
            return r12
        Lc1:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.MessageDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.y(long, int, int, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(4:28|(1:30)|(1:32)|33)|20|21|22|23))|35|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r11 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r11 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Type inference failed for: r11v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y0(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.n42 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.lu
            if (r0 == 0) goto L13
            r0 = r11
            lu r0 = (defpackage.lu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lu r0 = new lu
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r11)
            goto L98
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            defpackage.hre.r(r11)
            goto L6c
        L35:
            defpackage.hre.r(r11)
            java.lang.Object r6 = r6.a
            re5 r6 = (defpackage.re5) r6
            sl8 r11 = defpackage.tl8.b
            vl8 r11 = new vl8
            r1 = 8
            r11.<init>(r1)
            java.lang.String r1 = "name"
            r11.h(r1, r7)
            java.lang.String r7 = "email"
            r11.h(r7, r8)
            if (r9 == 0) goto L56
            java.lang.String r7 = "password"
            r11.h(r7, r9)
        L56:
            if (r10 == 0) goto L5d
            java.lang.String r7 = "avatar"
            r11.h(r7, r10)
        L5d:
            tl8 r7 = r11.Y()
            r0.c = r3
            java.lang.String r8 = "https://vbookapp.com/api/user/update"
            java.lang.Object r11 = defpackage.cbe.u(r6, r8, r7, r0)
            if (r11 != r5) goto L6c
            goto L97
        L6c:
            oh5 r11 = (defpackage.oh5) r11
            te5 r6 = r11.y0()
            java.lang.Class<or9> r7 = defpackage.or9.class
            gi1 r8 = defpackage.cm9.a(r7)
            w76 r9 = defpackage.w76.c     // Catch: java.lang.Throwable -> L89
            java.lang.Class<a0d> r9 = defpackage.a0d.class
            nsc r9 = defpackage.cm9.d(r9)     // Catch: java.lang.Throwable -> L89
            w76 r9 = defpackage.v9e.y(r9)     // Catch: java.lang.Throwable -> L89
            nsc r7 = defpackage.cm9.e(r7, r9)     // Catch: java.lang.Throwable -> L89
            goto L8a
        L89:
            r7 = r4
        L8a:
            isc r9 = new isc
            r9.<init>(r8, r7)
            r0.c = r2
            java.lang.Object r11 = r6.a(r9, r0)
            if (r11 != r5) goto L98
        L97:
            return r5
        L98:
            if (r11 == 0) goto L9d
            or9 r11 = (defpackage.or9) r11
            return r11
        L9d:
            java.lang.String r6 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.dto.UserInfoDto>"
            defpackage.xk5.k(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.y0(java.lang.String, java.lang.String, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r12 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
        if (r12 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(long r8, long r10, defpackage.n42 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.ot
            if (r0 == 0) goto L13
            r0 = r12
            ot r0 = (defpackage.ot) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ot r0 = new ot
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.hre.r(r12)
            goto Lac
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L32:
            long r10 = r0.b
            long r8 = r0.a
            defpackage.hre.r(r12)
            goto L72
        L3a:
            defpackage.hre.r(r12)
            java.lang.Object r7 = r7.a
            re5 r7 = (defpackage.re5) r7
            java.lang.String r12 = "https://vbookapp.com/api/chat/conversations/"
            java.lang.String r1 = "/messages/new"
            java.lang.String r12 = defpackage.nk2.t(r8, r12, r1)
            gh5 r1 = new gh5
            r1.<init>()
            h40 r6 = defpackage.hh5.a
            xtc r6 = r1.a
            defpackage.ytc.b(r6, r12)
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            java.lang.String r6 = "from"
            defpackage.kqe.v(r1, r6, r12)
            pg5 r12 = defpackage.pg5.b
            hi5 r7 = defpackage.rs8.c(r1, r12, r1, r7)
            r0.a = r8
            r0.b = r10
            r0.e = r3
            java.lang.Object r12 = r7.c(r0)
            if (r12 != r5) goto L72
            goto Lab
        L72:
            oh5 r12 = (defpackage.oh5) r12
            te5 r7 = r12.y0()
            java.lang.Class<or9> r12 = defpackage.or9.class
            gi1 r1 = defpackage.cm9.a(r12)
            w76 r3 = defpackage.w76.c     // Catch: java.lang.Throwable -> L99
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<ia7> r6 = defpackage.ia7.class
            nsc r6 = defpackage.cm9.d(r6)     // Catch: java.lang.Throwable -> L99
            w76 r6 = defpackage.v9e.y(r6)     // Catch: java.lang.Throwable -> L99
            nsc r3 = defpackage.cm9.e(r3, r6)     // Catch: java.lang.Throwable -> L99
            w76 r3 = defpackage.v9e.y(r3)     // Catch: java.lang.Throwable -> L99
            nsc r12 = defpackage.cm9.e(r12, r3)     // Catch: java.lang.Throwable -> L99
            goto L9a
        L99:
            r12 = r4
        L9a:
            isc r3 = new isc
            r3.<init>(r1, r12)
            r0.a = r8
            r0.b = r10
            r0.e = r2
            java.lang.Object r12 = r7.a(r3, r0)
            if (r12 != r5) goto Lac
        Lab:
            return r5
        Lac:
            if (r12 == 0) goto Lb1
            or9 r12 = (defpackage.or9) r12
            return r12
        Lb1:
            java.lang.String r7 = "null cannot be cast to non-null type com.reader.data.community.api.Response<kotlin.collections.List<com.reader.data.community.api.dto.MessageDto>>"
            defpackage.xk5.k(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.z(long, long, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|(2:12|13)(2:15|16))(2:17|18))(1:19))(1:28)|20|21|22|23))|30|6|(0)(0)|20|21|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r15 == r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r15 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Type inference failed for: r15v3, types: [vl8, c3e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z0(java.lang.String r13, java.util.List r14, defpackage.n42 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.mu
            if (r0 == 0) goto L13
            r0 = r15
            mu r0 = (defpackage.mu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            mu r0 = new mu
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r15)
            goto L96
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r12)
            return r4
        L31:
            defpackage.hre.r(r15)
            goto L6a
        L35:
            defpackage.hre.r(r15)
            java.lang.Object r12 = r12.a
            re5 r12 = (defpackage.re5) r12
            sl8 r15 = defpackage.tl8.b
            vl8 r15 = new vl8
            r1 = 8
            r15.<init>(r1)
            java.lang.String r1 = "id"
            r15.h(r1, r13)
            r10 = 0
            r11 = 62
            java.lang.String r7 = " "
            r8 = 0
            r9 = 0
            r6 = r14
            java.lang.String r13 = defpackage.sl1.i0(r6, r7, r8, r9, r10, r11)
            java.lang.String r14 = "color"
            r15.h(r14, r13)
            tl8 r13 = r15.Y()
            r0.c = r3
            java.lang.String r14 = "https://vbookapp.com/api/admin/color"
            java.lang.Object r15 = defpackage.cbe.u(r12, r14, r13, r0)
            if (r15 != r5) goto L6a
            goto L95
        L6a:
            oh5 r15 = (defpackage.oh5) r15
            te5 r12 = r15.y0()
            java.lang.Class<or9> r13 = defpackage.or9.class
            gi1 r14 = defpackage.cm9.a(r13)
            w76 r15 = defpackage.w76.c     // Catch: java.lang.Throwable -> L87
            java.lang.Class<r28> r15 = defpackage.r28.class
            nsc r15 = defpackage.cm9.d(r15)     // Catch: java.lang.Throwable -> L87
            w76 r15 = defpackage.v9e.y(r15)     // Catch: java.lang.Throwable -> L87
            nsc r13 = defpackage.cm9.e(r13, r15)     // Catch: java.lang.Throwable -> L87
            goto L88
        L87:
            r13 = r4
        L88:
            isc r15 = new isc
            r15.<init>(r14, r13)
            r0.c = r2
            java.lang.Object r15 = r12.a(r15, r0)
            if (r15 != r5) goto L96
        L95:
            return r5
        L96:
            if (r15 == 0) goto L9b
            or9 r15 = (defpackage.or9) r15
            return r15
        L9b:
            java.lang.String r12 = "null cannot be cast to non-null type com.reader.data.community.api.Response<com.reader.data.community.api.NoData>"
            defpackage.xk5.k(r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz4.z0(java.lang.String, java.util.List, n42):java.lang.Object");
    }

    public fz4(sk8 sk8Var) {
        android.content.Context context = (android.content.Context) sk8Var.a;
        String str = (String) sk8Var.b;
        String str2 = (String) sk8Var.c;
        if (str != null) {
            android.content.Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.a = (g99) sk8Var.h;
            return;
        }
        vs.m("keysetName cannot be null");
        throw null;
    }

    public /* synthetic */ fz4(Object obj) {
        this.a = obj;
    }

    public fz4(Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
        } else {
            xk5.k("data");
            throw null;
        }
    }
}
