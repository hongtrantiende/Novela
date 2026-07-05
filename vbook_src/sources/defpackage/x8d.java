package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.w3c.dom.Node;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x8d  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x8d implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ x8d(int i) {
        this.a = i;
    }

    private final Object a(Object obj) {
        boolean z;
        String s0;
        int i;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        cw9 cw9Var = (cw9) obj;
        cw9Var.getClass();
        iw9 h1 = cw9Var.h1("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            h1.m(1, 200L);
            int t = que.t(h1, "id");
            int t2 = que.t(h1, "state");
            int t3 = que.t(h1, "worker_class_name");
            int t4 = que.t(h1, "input_merger_class_name");
            int t5 = que.t(h1, "input");
            int t6 = que.t(h1, "output");
            int t7 = que.t(h1, "initial_delay");
            int t8 = que.t(h1, "interval_duration");
            int t9 = que.t(h1, "flex_duration");
            int t10 = que.t(h1, "run_attempt_count");
            int t11 = que.t(h1, "backoff_policy");
            int t12 = que.t(h1, "backoff_delay_duration");
            int t13 = que.t(h1, "last_enqueue_time");
            int t14 = que.t(h1, "minimum_retention_duration");
            int t15 = que.t(h1, "schedule_requested_at");
            int t16 = que.t(h1, "run_in_foreground");
            int t17 = que.t(h1, "out_of_quota_policy");
            int t18 = que.t(h1, "period_count");
            int t19 = que.t(h1, "generation");
            int t20 = que.t(h1, "next_schedule_time_override");
            int t21 = que.t(h1, "next_schedule_time_override_generation");
            int t22 = que.t(h1, "stop_reason");
            int t23 = que.t(h1, "trace_tag");
            int t24 = que.t(h1, "backoff_on_system_interruptions");
            int t25 = que.t(h1, "required_network_type");
            int t26 = que.t(h1, "required_network_request");
            int t27 = que.t(h1, "requires_charging");
            int t28 = que.t(h1, "requires_device_idle");
            int t29 = que.t(h1, "requires_battery_not_low");
            int t30 = que.t(h1, "requires_storage_not_low");
            int t31 = que.t(h1, "trigger_content_update_delay");
            int t32 = que.t(h1, "trigger_max_content_delay");
            int t33 = que.t(h1, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (h1.Z0()) {
                String s02 = h1.s0(t);
                int i2 = t13;
                int i3 = t14;
                jmd t34 = fxe.t((int) h1.getLong(t2));
                String s03 = h1.s0(t3);
                String s04 = h1.s0(t4);
                byte[] blob = h1.getBlob(t5);
                tf2 tf2Var = tf2.b;
                tf2 f = rae.f(blob);
                tf2 f2 = rae.f(h1.getBlob(t6));
                long j = h1.getLong(t7);
                long j2 = h1.getLong(t8);
                long j3 = h1.getLong(t9);
                int i4 = (int) h1.getLong(t10);
                int i5 = t;
                int i6 = t2;
                ng0 q = fxe.q((int) h1.getLong(t11));
                long j4 = h1.getLong(t12);
                long j5 = h1.getLong(i2);
                long j6 = h1.getLong(i3);
                int i7 = t15;
                long j7 = h1.getLong(i7);
                t15 = i7;
                int i8 = t16;
                int i9 = t3;
                if (((int) h1.getLong(i8)) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i10 = t17;
                int i11 = t4;
                mf8 s = fxe.s((int) h1.getLong(i10));
                int i12 = t18;
                int i13 = (int) h1.getLong(i12);
                int i14 = t19;
                int i15 = (int) h1.getLong(i14);
                int i16 = t20;
                long j8 = h1.getLong(i16);
                int i17 = t21;
                int i18 = (int) h1.getLong(i17);
                t21 = i17;
                int i19 = t22;
                int i20 = (int) h1.getLong(i19);
                int i21 = t23;
                Boolean bool = null;
                if (h1.isNull(i21)) {
                    s0 = null;
                } else {
                    s0 = h1.s0(i21);
                }
                int i22 = t24;
                if (h1.isNull(i22)) {
                    i = i21;
                    t22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    t22 = i19;
                    valueOf = Integer.valueOf((int) h1.getLong(i22));
                }
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                }
                Boolean bool2 = bool;
                int i23 = t25;
                c28 r = fxe.r((int) h1.getLong(i23));
                int i24 = t26;
                w18 E = fxe.E(h1.getBlob(i24));
                int i25 = t27;
                if (((int) h1.getLong(i25)) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i26 = t28;
                if (((int) h1.getLong(i26)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i27 = t29;
                if (((int) h1.getLong(i27)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                t29 = i27;
                int i28 = t30;
                if (((int) h1.getLong(i28)) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int i29 = t31;
                int i30 = t32;
                t31 = i29;
                int i31 = t33;
                arrayList.add(new ymd(s02, t34, s03, s04, f, f2, j, j2, j3, new w02(E, r, z2, z3, z4, z5, h1.getLong(i29), h1.getLong(i30), fxe.l(h1.getBlob(i31))), i4, q, j4, j5, j6, j7, z, s, i13, i15, j8, i18, i20, s0, bool2));
                t28 = i26;
                t4 = i11;
                t17 = i10;
                t18 = i12;
                t19 = i14;
                t20 = i16;
                t23 = i;
                t24 = i22;
                t25 = i23;
                t26 = i24;
                t27 = i25;
                t33 = i31;
                t32 = i30;
                t30 = i28;
                t = i5;
                t3 = i9;
                t13 = i2;
                t14 = i3;
                t2 = i6;
                t16 = i8;
            }
            h1.close();
            return arrayList;
        } catch (Throwable th) {
            h1.close();
            throw th;
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        boolean containsKey;
        Object obj2;
        boolean z2;
        String s0;
        Integer valueOf;
        Boolean bool;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String s02;
        Integer valueOf2;
        Boolean bool2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String s03;
        Integer valueOf3;
        Boolean bool3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = 0;
        r4 = false;
        boolean z20 = false;
        switch (i) {
            case 0:
                ((ak3) obj).getClass();
                return pvcVar;
            case 1:
                j09 j09Var = (j09) obj;
                j09Var.getClass();
                j09Var.setControllerAutoShow(false);
                j09Var.setUseController(false);
                j09Var.setControllerHideOnTouch(false);
                SubtitleView subtitleView = j09Var.getSubtitleView();
                if (subtitleView != null) {
                    subtitleView.setStyle(new r61(-1, 255, 0, 1, -16777216, Typeface.DEFAULT));
                }
                j09Var.setControllerVisibilityListener(new d89(j09Var, 12));
                return pvcVar;
            case 2:
                String str = (String) obj;
                str.getClass();
                return k4b.N0(str).toString();
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() > 0) {
                    String lowerCase = k4b.N0(str2).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!r4b.Q(lowerCase, "blob:", false)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                if (!kad.f(str3)) {
                    containsKey = false;
                } else {
                    containsKey = kad.a.containsKey(kad.c(str3));
                }
                return Boolean.valueOf(containsKey);
            case 5:
                List list = (List) obj;
                list.getClass();
                lhd lhdVar = new lhd();
                Object obj3 = list.get(0);
                obj3.getClass();
                lhdVar.e.setValue((String) obj3);
                lhdVar.f.setValue((String) list.get(1));
                lhdVar.i = (Bundle) list.get(2);
                Object obj4 = list.get(3);
                obj4.getClass();
                int intValue = ((Integer) obj4).intValue();
                list.get(4).getClass();
                lhdVar.j = (intValue << 32) | (((Integer) obj2).intValue() & 4294967295L);
                return lhdVar;
            case 6:
                ((FrameLayout) obj).getClass();
                return pvcVar;
            case 7:
                return ((yjd) obj).g;
            case 8:
                lkd lkdVar = (lkd) obj;
                lkdVar.getClass();
                return lkdVar;
            case 9:
                l02 l02Var = (l02) obj;
                l02Var.getClass();
                return l02Var.getClass().getSimpleName();
            case 10:
                cw9 cw9Var = (cw9) obj;
                cw9Var.getClass();
                try {
                    cw9Var.h1("DELETE FROM WorkProgress").Z0();
                    return pvcVar;
                } finally {
                }
            case 11:
                cw9 cw9Var2 = (cw9) obj;
                cw9Var2.getClass();
                iw9 h1 = cw9Var2.h1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int t = que.t(h1, "id");
                    int t2 = que.t(h1, "state");
                    int t3 = que.t(h1, "worker_class_name");
                    int t4 = que.t(h1, "input_merger_class_name");
                    int t5 = que.t(h1, "input");
                    int t6 = que.t(h1, "output");
                    int t7 = que.t(h1, "initial_delay");
                    int t8 = que.t(h1, "interval_duration");
                    int t9 = que.t(h1, "flex_duration");
                    int t10 = que.t(h1, "run_attempt_count");
                    int t11 = que.t(h1, "backoff_policy");
                    int t12 = que.t(h1, "backoff_delay_duration");
                    int t13 = que.t(h1, "last_enqueue_time");
                    int t14 = que.t(h1, "minimum_retention_duration");
                    int t15 = que.t(h1, "schedule_requested_at");
                    int t16 = que.t(h1, "run_in_foreground");
                    int t17 = que.t(h1, "out_of_quota_policy");
                    int t18 = que.t(h1, "period_count");
                    int t19 = que.t(h1, "generation");
                    int t20 = que.t(h1, "next_schedule_time_override");
                    int t21 = que.t(h1, "next_schedule_time_override_generation");
                    int t22 = que.t(h1, "stop_reason");
                    int t23 = que.t(h1, "trace_tag");
                    int t24 = que.t(h1, "backoff_on_system_interruptions");
                    int t25 = que.t(h1, "required_network_type");
                    int t26 = que.t(h1, "required_network_request");
                    int t27 = que.t(h1, "requires_charging");
                    int t28 = que.t(h1, "requires_device_idle");
                    int t29 = que.t(h1, "requires_battery_not_low");
                    int t30 = que.t(h1, "requires_storage_not_low");
                    int t31 = que.t(h1, "trigger_content_update_delay");
                    int t32 = que.t(h1, "trigger_max_content_delay");
                    int t33 = que.t(h1, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (h1.Z0()) {
                        String s04 = h1.s0(t);
                        int i3 = t14;
                        int i4 = t13;
                        jmd t34 = fxe.t((int) h1.getLong(t2));
                        String s05 = h1.s0(t3);
                        String s06 = h1.s0(t4);
                        byte[] blob = h1.getBlob(t5);
                        tf2 tf2Var = tf2.b;
                        tf2 f = rae.f(blob);
                        tf2 f2 = rae.f(h1.getBlob(t6));
                        long j = h1.getLong(t7);
                        long j2 = h1.getLong(t8);
                        long j3 = h1.getLong(t9);
                        int i5 = (int) h1.getLong(t10);
                        int i6 = t4;
                        int i7 = t3;
                        ng0 q = fxe.q((int) h1.getLong(t11));
                        long j4 = h1.getLong(t12);
                        long j5 = h1.getLong(i4);
                        long j6 = h1.getLong(i3);
                        int i8 = t15;
                        long j7 = h1.getLong(i8);
                        t15 = i8;
                        int i9 = t16;
                        int i10 = t2;
                        if (((int) h1.getLong(i9)) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i11 = t17;
                        int i12 = t;
                        mf8 s = fxe.s((int) h1.getLong(i11));
                        int i13 = t18;
                        int i14 = (int) h1.getLong(i13);
                        int i15 = t19;
                        int i16 = (int) h1.getLong(i15);
                        int i17 = t20;
                        long j8 = h1.getLong(i17);
                        int i18 = t21;
                        int i19 = (int) h1.getLong(i18);
                        t21 = i18;
                        int i20 = t22;
                        int i21 = (int) h1.getLong(i20);
                        int i22 = t23;
                        if (h1.isNull(i22)) {
                            s0 = null;
                        } else {
                            s0 = h1.s0(i22);
                        }
                        int i23 = t24;
                        if (h1.isNull(i23)) {
                            t23 = i22;
                            t22 = i20;
                            valueOf = null;
                        } else {
                            t23 = i22;
                            t22 = i20;
                            valueOf = Integer.valueOf((int) h1.getLong(i23));
                        }
                        if (valueOf != null) {
                            if (valueOf.intValue() != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            bool = Boolean.valueOf(z7);
                        } else {
                            bool = null;
                        }
                        int i24 = t25;
                        c28 r = fxe.r((int) h1.getLong(i24));
                        int i25 = t26;
                        w18 E = fxe.E(h1.getBlob(i25));
                        int i26 = t27;
                        if (((int) h1.getLong(i26)) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i27 = t28;
                        if (((int) h1.getLong(i27)) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i28 = t29;
                        if (((int) h1.getLong(i28)) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        t29 = i28;
                        int i29 = t30;
                        if (((int) h1.getLong(i29)) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        int i30 = t31;
                        int i31 = t32;
                        t31 = i30;
                        int i32 = t33;
                        arrayList.add(new ymd(s04, t34, s05, s06, f, f2, j, j2, j3, new w02(E, r, z3, z4, z5, z6, h1.getLong(i30), h1.getLong(i31), fxe.l(h1.getBlob(i32))), i5, q, j4, j5, j6, j7, z2, s, i14, i16, j8, i19, i21, s0, bool));
                        t28 = i27;
                        t = i12;
                        t17 = i11;
                        t18 = i13;
                        t19 = i15;
                        t20 = i17;
                        t24 = i23;
                        t25 = i24;
                        t26 = i25;
                        t27 = i26;
                        t33 = i32;
                        t32 = i31;
                        t30 = i29;
                        t3 = i7;
                        t13 = i4;
                        t14 = i3;
                        t4 = i6;
                        t2 = i10;
                        t16 = i9;
                    }
                    return arrayList;
                } finally {
                }
            case 12:
                cw9 cw9Var3 = (cw9) obj;
                cw9Var3.getClass();
                iw9 h12 = cw9Var3.h1("SELECT * FROM workspec WHERE state=1");
                try {
                    int t35 = que.t(h12, "id");
                    int t36 = que.t(h12, "state");
                    int t37 = que.t(h12, "worker_class_name");
                    int t38 = que.t(h12, "input_merger_class_name");
                    int t39 = que.t(h12, "input");
                    int t40 = que.t(h12, "output");
                    int t41 = que.t(h12, "initial_delay");
                    int t42 = que.t(h12, "interval_duration");
                    int t43 = que.t(h12, "flex_duration");
                    int t44 = que.t(h12, "run_attempt_count");
                    int t45 = que.t(h12, "backoff_policy");
                    int t46 = que.t(h12, "backoff_delay_duration");
                    int t47 = que.t(h12, "last_enqueue_time");
                    int t48 = que.t(h12, "minimum_retention_duration");
                    int t49 = que.t(h12, "schedule_requested_at");
                    int t50 = que.t(h12, "run_in_foreground");
                    int t51 = que.t(h12, "out_of_quota_policy");
                    int t52 = que.t(h12, "period_count");
                    int t53 = que.t(h12, "generation");
                    int t54 = que.t(h12, "next_schedule_time_override");
                    int t55 = que.t(h12, "next_schedule_time_override_generation");
                    int t56 = que.t(h12, "stop_reason");
                    int t57 = que.t(h12, "trace_tag");
                    int t58 = que.t(h12, "backoff_on_system_interruptions");
                    int t59 = que.t(h12, "required_network_type");
                    int t60 = que.t(h12, "required_network_request");
                    int t61 = que.t(h12, "requires_charging");
                    int t62 = que.t(h12, "requires_device_idle");
                    int t63 = que.t(h12, "requires_battery_not_low");
                    int t64 = que.t(h12, "requires_storage_not_low");
                    int t65 = que.t(h12, "trigger_content_update_delay");
                    int t66 = que.t(h12, "trigger_max_content_delay");
                    int t67 = que.t(h12, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (h12.Z0()) {
                        String s07 = h12.s0(t35);
                        int i33 = t48;
                        int i34 = t47;
                        jmd t68 = fxe.t((int) h12.getLong(t36));
                        String s08 = h12.s0(t37);
                        String s09 = h12.s0(t38);
                        byte[] blob2 = h12.getBlob(t39);
                        tf2 tf2Var2 = tf2.b;
                        tf2 f3 = rae.f(blob2);
                        tf2 f4 = rae.f(h12.getBlob(t40));
                        long j9 = h12.getLong(t41);
                        long j10 = h12.getLong(t42);
                        long j11 = h12.getLong(t43);
                        int i35 = (int) h12.getLong(t44);
                        int i36 = t38;
                        int i37 = t37;
                        ng0 q2 = fxe.q((int) h12.getLong(t45));
                        long j12 = h12.getLong(t46);
                        long j13 = h12.getLong(i34);
                        long j14 = h12.getLong(i33);
                        int i38 = t49;
                        long j15 = h12.getLong(i38);
                        int i39 = t36;
                        int i40 = t50;
                        if (((int) h12.getLong(i40)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        int i41 = t35;
                        int i42 = t51;
                        mf8 s2 = fxe.s((int) h12.getLong(i42));
                        t51 = i42;
                        int i43 = t52;
                        int i44 = (int) h12.getLong(i43);
                        t52 = i43;
                        int i45 = t53;
                        int i46 = (int) h12.getLong(i45);
                        int i47 = t54;
                        long j16 = h12.getLong(i47);
                        int i48 = t55;
                        int i49 = (int) h12.getLong(i48);
                        t55 = i48;
                        int i50 = t56;
                        int i51 = (int) h12.getLong(i50);
                        int i52 = t57;
                        if (h12.isNull(i52)) {
                            s02 = null;
                        } else {
                            s02 = h12.s0(i52);
                        }
                        int i53 = t58;
                        if (h12.isNull(i53)) {
                            t57 = i52;
                            t56 = i50;
                            valueOf2 = null;
                        } else {
                            t57 = i52;
                            t56 = i50;
                            valueOf2 = Integer.valueOf((int) h12.getLong(i53));
                        }
                        if (valueOf2 != null) {
                            if (valueOf2.intValue() != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bool2 = Boolean.valueOf(z13);
                        } else {
                            bool2 = null;
                        }
                        int i54 = t59;
                        c28 r2 = fxe.r((int) h12.getLong(i54));
                        int i55 = t60;
                        w18 E2 = fxe.E(h12.getBlob(i55));
                        int i56 = t61;
                        if (((int) h12.getLong(i56)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i57 = t62;
                        if (((int) h12.getLong(i57)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i58 = t63;
                        if (((int) h12.getLong(i58)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        t63 = i58;
                        int i59 = t64;
                        if (((int) h12.getLong(i59)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        int i60 = t65;
                        int i61 = t66;
                        t65 = i60;
                        int i62 = t67;
                        arrayList2.add(new ymd(s07, t68, s08, s09, f3, f4, j9, j10, j11, new w02(E2, r2, z9, z10, z11, z12, h12.getLong(i60), h12.getLong(i61), fxe.l(h12.getBlob(i62))), i35, q2, j12, j13, j14, j15, z8, s2, i44, i46, j16, i49, i51, s02, bool2));
                        t35 = i41;
                        t50 = i40;
                        t53 = i45;
                        t54 = i47;
                        t58 = i53;
                        t59 = i54;
                        t60 = i55;
                        t61 = i56;
                        t62 = i57;
                        t67 = i62;
                        t66 = i61;
                        t64 = i59;
                        t48 = i33;
                        t37 = i37;
                        t38 = i36;
                        t36 = i39;
                        t49 = i38;
                        t47 = i34;
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                cw9 cw9Var4 = (cw9) obj;
                cw9Var4.getClass();
                iw9 h13 = cw9Var4.h1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int t69 = que.t(h13, "id");
                    int t70 = que.t(h13, "state");
                    int t71 = que.t(h13, "worker_class_name");
                    int t72 = que.t(h13, "input_merger_class_name");
                    int t73 = que.t(h13, "input");
                    int t74 = que.t(h13, "output");
                    int t75 = que.t(h13, "initial_delay");
                    int t76 = que.t(h13, "interval_duration");
                    int t77 = que.t(h13, "flex_duration");
                    int t78 = que.t(h13, "run_attempt_count");
                    int t79 = que.t(h13, "backoff_policy");
                    int t80 = que.t(h13, "backoff_delay_duration");
                    int t81 = que.t(h13, "last_enqueue_time");
                    int t82 = que.t(h13, "minimum_retention_duration");
                    int t83 = que.t(h13, "schedule_requested_at");
                    int t84 = que.t(h13, "run_in_foreground");
                    int t85 = que.t(h13, "out_of_quota_policy");
                    int t86 = que.t(h13, "period_count");
                    int t87 = que.t(h13, "generation");
                    int t88 = que.t(h13, "next_schedule_time_override");
                    int t89 = que.t(h13, "next_schedule_time_override_generation");
                    int t90 = que.t(h13, "stop_reason");
                    int t91 = que.t(h13, "trace_tag");
                    int t92 = que.t(h13, "backoff_on_system_interruptions");
                    int t93 = que.t(h13, "required_network_type");
                    int t94 = que.t(h13, "required_network_request");
                    int t95 = que.t(h13, "requires_charging");
                    int t96 = que.t(h13, "requires_device_idle");
                    int t97 = que.t(h13, "requires_battery_not_low");
                    int t98 = que.t(h13, "requires_storage_not_low");
                    int t99 = que.t(h13, "trigger_content_update_delay");
                    int t100 = que.t(h13, "trigger_max_content_delay");
                    int t101 = que.t(h13, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (h13.Z0()) {
                        String s010 = h13.s0(t69);
                        int i63 = t82;
                        int i64 = t81;
                        jmd t102 = fxe.t((int) h13.getLong(t70));
                        String s011 = h13.s0(t71);
                        String s012 = h13.s0(t72);
                        byte[] blob3 = h13.getBlob(t73);
                        tf2 tf2Var3 = tf2.b;
                        tf2 f5 = rae.f(blob3);
                        tf2 f6 = rae.f(h13.getBlob(t74));
                        long j17 = h13.getLong(t75);
                        long j18 = h13.getLong(t76);
                        long j19 = h13.getLong(t77);
                        int i65 = (int) h13.getLong(t78);
                        int i66 = t72;
                        int i67 = t71;
                        ng0 q3 = fxe.q((int) h13.getLong(t79));
                        long j20 = h13.getLong(t80);
                        long j21 = h13.getLong(i64);
                        long j22 = h13.getLong(i63);
                        int i68 = t83;
                        long j23 = h13.getLong(i68);
                        int i69 = t70;
                        int i70 = t84;
                        if (((int) h13.getLong(i70)) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        int i71 = t69;
                        int i72 = t85;
                        mf8 s3 = fxe.s((int) h13.getLong(i72));
                        t85 = i72;
                        int i73 = t86;
                        int i74 = (int) h13.getLong(i73);
                        t86 = i73;
                        int i75 = t87;
                        int i76 = (int) h13.getLong(i75);
                        int i77 = t88;
                        long j24 = h13.getLong(i77);
                        int i78 = t89;
                        int i79 = (int) h13.getLong(i78);
                        t89 = i78;
                        int i80 = t90;
                        int i81 = (int) h13.getLong(i80);
                        int i82 = t91;
                        if (h13.isNull(i82)) {
                            s03 = null;
                        } else {
                            s03 = h13.s0(i82);
                        }
                        int i83 = t92;
                        if (h13.isNull(i83)) {
                            t91 = i82;
                            t90 = i80;
                            valueOf3 = null;
                        } else {
                            t91 = i82;
                            t90 = i80;
                            valueOf3 = Integer.valueOf((int) h13.getLong(i83));
                        }
                        if (valueOf3 != null) {
                            if (valueOf3.intValue() != 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            bool3 = Boolean.valueOf(z19);
                        } else {
                            bool3 = null;
                        }
                        int i84 = t93;
                        c28 r3 = fxe.r((int) h13.getLong(i84));
                        int i85 = t94;
                        w18 E3 = fxe.E(h13.getBlob(i85));
                        int i86 = t95;
                        if (((int) h13.getLong(i86)) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        int i87 = t96;
                        if (((int) h13.getLong(i87)) != 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        int i88 = t97;
                        if (((int) h13.getLong(i88)) != 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        t97 = i88;
                        int i89 = t98;
                        if (((int) h13.getLong(i89)) != 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        int i90 = t99;
                        int i91 = t100;
                        t99 = i90;
                        int i92 = t101;
                        arrayList3.add(new ymd(s010, t102, s011, s012, f5, f6, j17, j18, j19, new w02(E3, r3, z15, z16, z17, z18, h13.getLong(i90), h13.getLong(i91), fxe.l(h13.getBlob(i92))), i65, q3, j20, j21, j22, j23, z14, s3, i74, i76, j24, i79, i81, s03, bool3));
                        t69 = i71;
                        t84 = i70;
                        t87 = i75;
                        t88 = i77;
                        t92 = i83;
                        t93 = i84;
                        t94 = i85;
                        t95 = i86;
                        t96 = i87;
                        t101 = i92;
                        t100 = i91;
                        t98 = i89;
                        t82 = i63;
                        t71 = i67;
                        t72 = i66;
                        t70 = i69;
                        t83 = i68;
                        t81 = i64;
                    }
                    return arrayList3;
                } finally {
                }
            case 14:
                cw9 cw9Var5 = (cw9) obj;
                cw9Var5.getClass();
                iw9 h14 = cw9Var5.h1("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    if (h14.Z0()) {
                        i2 = (int) h14.getLong(0);
                    }
                    h14.close();
                    return Integer.valueOf(i2);
                } finally {
                }
            case 15:
                cw9 cw9Var6 = (cw9) obj;
                cw9Var6.getClass();
                iw9 h15 = cw9Var6.h1("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (h15.Z0()) {
                        if (((int) h15.getLong(0)) != 0) {
                            z20 = true;
                        }
                    }
                    h15.close();
                    return Boolean.valueOf(z20);
                } finally {
                }
            case 16:
                return a(obj);
            case 17:
                cw9 cw9Var7 = (cw9) obj;
                cw9Var7.getClass();
                iw9 h16 = cw9Var7.h1("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    h16.Z0();
                    int y = tl1.y(cw9Var7);
                    h16.close();
                    return Integer.valueOf(y);
                } finally {
                }
            case 18:
                n66 n66Var = (n66) obj;
                n66Var.getClass();
                return n66Var.f();
            case 19:
                n66 n66Var2 = (n66) obj;
                n66Var2.getClass();
                return n66Var2.f();
            case 20:
                ood oodVar = (ood) obj;
                oodVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(oodVar.d);
                sb.append(" = ");
                return s21.p(sb, oodVar.b, ' ');
            case 21:
                dp3 dp3Var = (dp3) obj;
                dp3Var.getClass();
                String nodeName = ((Node) dp3Var.a).getNodeName();
                nodeName.getClass();
                return Boolean.valueOf(nodeName.equals("item"));
            default:
                ((vpd) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
