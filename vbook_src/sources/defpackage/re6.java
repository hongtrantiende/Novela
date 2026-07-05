package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: re6  reason: default package */
/* loaded from: classes.dex */
public abstract class re6 {
    public static final Map a = o17.s(new yk8(ve6.d, Integer.valueOf((int) R.layout.glance_text)), new yk8(ve6.e, Integer.valueOf((int) R.layout.glance_list)), new yk8(ve6.f, Integer.valueOf((int) R.layout.glance_check_box)), new yk8(ve6.C, Integer.valueOf((int) R.layout.glance_check_box_backport)), new yk8(ve6.D, Integer.valueOf((int) R.layout.glance_button)), new yk8(ve6.N, Integer.valueOf((int) R.layout.glance_swtch)), new yk8(ve6.O, Integer.valueOf((int) R.layout.glance_swtch_backport)), new yk8(ve6.E, Integer.valueOf((int) R.layout.glance_frame)), new yk8(ve6.P, Integer.valueOf((int) R.layout.glance_image_crop)), new yk8(ve6.S, Integer.valueOf((int) R.layout.glance_image_crop_decorative)), new yk8(ve6.Q, Integer.valueOf((int) R.layout.glance_image_fit)), new yk8(ve6.T, Integer.valueOf((int) R.layout.glance_image_fit_decorative)), new yk8(ve6.R, Integer.valueOf((int) R.layout.glance_image_fill_bounds)), new yk8(ve6.U, Integer.valueOf((int) R.layout.glance_image_fill_bounds_decorative)), new yk8(ve6.F, Integer.valueOf((int) R.layout.glance_linear_progress_indicator)), new yk8(ve6.G, Integer.valueOf((int) R.layout.glance_circular_progress_indicator)), new yk8(ve6.H, Integer.valueOf((int) R.layout.glance_vertical_grid_one_column)), new yk8(ve6.I, Integer.valueOf((int) R.layout.glance_vertical_grid_two_columns)), new yk8(ve6.J, Integer.valueOf((int) R.layout.glance_vertical_grid_three_columns)), new yk8(ve6.K, Integer.valueOf((int) R.layout.glance_vertical_grid_four_columns)), new yk8(ve6.L, Integer.valueOf((int) R.layout.glance_vertical_grid_five_columns)), new yk8(ve6.M, Integer.valueOf((int) R.layout.glance_vertical_grid_auto_fit)), new yk8(ve6.V, Integer.valueOf((int) R.layout.glance_radio_button)), new yk8(ve6.W, Integer.valueOf((int) R.layout.glance_radio_button_backport)));
    public static final int b;
    public static final int c;

    static {
        int i;
        int size = ew4.f.size();
        b = size;
        if (Build.VERSION.SDK_INT >= 31) {
            i = ew4.h;
        } else {
            i = ew4.h / size;
        }
        c = i;
    }

    public static final qn9 a(smc smcVar, xy4 xy4Var, int i) {
        a73 a73Var;
        int i2;
        int i3;
        Map singletonMap;
        Context context = smcVar.a;
        Integer valueOf = Integer.valueOf((int) R.id.rootStubId);
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 1;
        if (i4 >= 31) {
            int i6 = ew4.h;
            if (i < i6) {
                vna vnaVar = new vna(1, 1);
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), ew4.g + i);
                mid midVar = (mid) xy4Var.a(null, co5.C);
                if (midVar != null) {
                    mue.g(remoteViews, midVar, R.id.rootView);
                }
                u55 u55Var = (u55) xy4Var.a(null, co5.D);
                if (u55Var != null) {
                    mue.f(remoteViews, u55Var, R.id.rootView);
                }
                if (i4 >= 33) {
                    remoteViews.removeAllViews(R.id.rootView);
                }
                if (i4 >= 33) {
                    singletonMap = ls3.a;
                } else {
                    Map singletonMap2 = Collections.singletonMap(vnaVar, valueOf);
                    singletonMap2.getClass();
                    singletonMap = Collections.singletonMap(0, singletonMap2);
                    singletonMap.getClass();
                }
                return new qn9(remoteViews, new bx5(R.id.rootView, 0, singletonMap, 2));
            }
            p1a.k(rs8.k("Index of the root view cannot be more than ", i6, i, ", currently "));
            return null;
        }
        int i7 = b * i;
        int i8 = ew4.h;
        int i9 = 4;
        if (i7 < i8) {
            mid midVar2 = (mid) xy4Var.a(null, co5.e);
            a73 a73Var2 = y63.a;
            if (midVar2 != null) {
                a73Var = midVar2.a;
            } else {
                a73Var = a73Var2;
            }
            u55 u55Var2 = (u55) xy4Var.a(null, co5.f);
            if (u55Var2 != null) {
                a73Var2 = u55Var2.a;
            }
            v63 v63Var = v63.a;
            if (a73Var.equals(v63Var)) {
                i2 = 4;
            } else {
                i2 = 1;
            }
            if (!a73Var2.equals(v63Var)) {
                i9 = 1;
            }
            if (i2 == 2) {
                i3 = 1;
            } else {
                i3 = i2;
            }
            if (i9 != 2) {
                i5 = i9;
            }
            vna vnaVar2 = new vna(i3, i5);
            Integer num = (Integer) ew4.f.get(vnaVar2);
            if (num != null) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i7 + ew4.g + num.intValue());
                Map singletonMap3 = Collections.singletonMap(vnaVar2, valueOf);
                singletonMap3.getClass();
                Map singletonMap4 = Collections.singletonMap(0, singletonMap3);
                singletonMap4.getClass();
                return new qn9(remoteViews2, new bx5(0, 0, singletonMap4, 3));
            }
            throw new IllegalStateException("Cannot find root element for size [" + hl5.A(i2) + ", " + hl5.A(i9) + ']');
        }
        fb4.c(i8 / 4, "Index of the root view cannot be more than ", ", currently ", i);
        return null;
    }

    public static final bx5 b(RemoteViews remoteViews, smc smcVar, ve6 ve6Var, int i, xy4 xy4Var, ac acVar, bc bcVar) {
        Integer num;
        int intValue;
        int i2 = 10;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + ve6Var + " container from " + i + " to 10 elements", new IllegalArgumentException(ve6Var + " container cannot have more than 10 elements"));
        }
        if (i <= 10) {
            i2 = i;
        }
        Integer f = f(ve6Var, xy4Var);
        if (f != null) {
            intValue = f.intValue();
        } else {
            j12 j12Var = (j12) ew4.a.get(new l12(ve6Var, i2, acVar, bcVar));
            if (j12Var != null) {
                num = Integer.valueOf(j12Var.a);
            } else {
                num = null;
            }
            if (num != null) {
                intValue = num.intValue();
            } else {
                throw new IllegalArgumentException("Cannot find container " + ve6Var + " with " + i + " children");
            }
        }
        Map map = (Map) ew4.b.get(ve6Var);
        if (map != null) {
            bx5 d = d(remoteViews, smcVar, intValue, xy4Var);
            int i3 = d.a;
            bx5 bx5Var = new bx5(i3, d.b, map);
            if (Build.VERSION.SDK_INT >= 33) {
                remoteViews.removeAllViews(i3);
            }
            return bx5Var;
        }
        cp8.s(ve6Var, "Cannot find generated children for ");
        return null;
    }

    public static final bx5 c(RemoteViews remoteViews, smc smcVar, ve6 ve6Var, xy4 xy4Var) {
        Integer f = f(ve6Var, xy4Var);
        if (f != null || (f = (Integer) a.get(ve6Var)) != null) {
            return d(remoteViews, smcVar, f.intValue(), xy4Var);
        }
        cp8.s(ve6Var, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final bx5 d(RemoteViews remoteViews, smc smcVar, int i, xy4 xy4Var) {
        a73 a73Var;
        Integer num;
        int i2;
        int incrementAndGet;
        int i3 = smcVar.e;
        mid midVar = (mid) xy4Var.a(null, co5.E);
        a73 a73Var2 = y63.a;
        if (midVar != null) {
            a73Var = midVar.a;
        } else {
            a73Var = a73Var2;
        }
        u55 u55Var = (u55) xy4Var.a(null, co5.F);
        if (u55Var != null) {
            a73Var2 = u55Var.a;
        }
        int i4 = 1;
        if (xy4Var.c()) {
            num = null;
        } else if (!smcVar.i.getAndSet(true)) {
            num = 16908288;
        } else {
            vs.k("At most one view can be set as AppWidgetBackground.");
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = smcVar.g.incrementAndGet();
            }
            RemoteViews a2 = qe6.a.a(smcVar.a.getPackageName(), i, incrementAndGet);
            int i6 = smcVar.h.a;
            if (i5 >= 31) {
                sn9.a.a(remoteViews, i6, a2, i3);
            } else {
                remoteViews.addView(i6, a2);
            }
            return new bx5(incrementAndGet, 0, null, 6);
        } else if (i5 >= 31) {
            u63 u63Var = u63.a;
            if (a73Var.equals(u63Var)) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            if (a73Var2.equals(u63Var)) {
                i4 = 3;
            }
            return new bx5(nqe.x(remoteViews, smcVar, e(remoteViews, smcVar, i3, i2, i4), i, num), 0, null, 6);
        } else {
            int g = g(a73Var);
            int g2 = g(a73Var2);
            int e = e(remoteViews, smcVar, i3, g, g2);
            if (g != 2 && g2 != 2) {
                return new bx5(nqe.x(remoteViews, smcVar, e, i, num), 0, null, 6);
            }
            ad6 ad6Var = (ad6) ew4.e.get(new vna(g, g2));
            if (ad6Var != null) {
                return new bx5(nqe.x(remoteViews, smcVar, R.id.glanceViewStub, i, num), nqe.x(remoteViews, smcVar, e, ad6Var.a, null), null, 4);
            }
            throw new IllegalArgumentException("Could not find complex layout for width=" + hl5.A(g) + ", height=" + hl5.A(g2));
        }
    }

    public static final int e(RemoteViews remoteViews, smc smcVar, int i, int i2, int i3) {
        int i4;
        int i5 = 1;
        if (i2 == 2) {
            i4 = 1;
        } else {
            i4 = i2;
        }
        if (i3 != 2) {
            i5 = i3;
        }
        vna vnaVar = new vna(i4, i5);
        Map map = (Map) smcVar.h.c.get(Integer.valueOf(i));
        int i6 = 0;
        if (map != null) {
            Integer num = (Integer) map.get(vnaVar);
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : map.values()) {
                    if (((Number) obj).intValue() != intValue) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    nqe.x(remoteViews, smcVar, ((Number) obj2).intValue(), R.layout.glance_deleted_view, Integer.valueOf((int) R.id.deletedViewId));
                }
                return intValue;
            }
            StringBuilder s = hl5.s("No child for position ", " and size ", i);
            s.append(hl5.A(i2));
            s.append(" x ");
            s.append(hl5.A(i3));
            throw new IllegalStateException(s.toString());
        }
        vs.k(a82.j(i, "Parent doesn't have child position "));
        return 0;
    }

    public static final Integer f(ve6 ve6Var, xy4 xy4Var) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 33) {
            lc lcVar = (lc) xy4Var.a(null, co5.G);
            mid midVar = (mid) xy4Var.a(null, co5.H);
            boolean z2 = false;
            u63 u63Var = u63.a;
            if (midVar != null) {
                z = midVar.a.equals(u63Var);
            } else {
                z = false;
            }
            u55 u55Var = (u55) xy4Var.a(null, co5.I);
            if (u55Var != null) {
                z2 = u55Var.a.equals(u63Var);
            }
            if (lcVar != null) {
                cc ccVar = lcVar.a;
                ad6 ad6Var = (ad6) ew4.c.get(new cu0(ve6Var, ccVar.a, ccVar.b));
                if (ad6Var != null) {
                    return Integer.valueOf(ad6Var.a);
                }
                vm1.g("Cannot find ", ve6Var, " with alignment ", ccVar);
                return null;
            } else if (z || z2) {
                ad6 ad6Var2 = (ad6) ew4.d.get(new av9(ve6Var, z, z2));
                if (ad6Var2 != null) {
                    return Integer.valueOf(ad6Var2.a);
                }
                hfd.p(ve6Var, " with defaultWeight set", "Cannot find ");
                return null;
            }
        }
        return null;
    }

    public static final int g(a73 a73Var) {
        if (a73Var instanceof y63) {
            return 1;
        }
        if (a73Var instanceof u63) {
            return 3;
        }
        if (a73Var instanceof v63) {
            return 4;
        }
        if (a73Var instanceof t63) {
            return 2;
        }
        xk5.o();
        return 0;
    }
}
