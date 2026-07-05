package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewParent;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.vbook.android.R;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kue  reason: default package */
/* loaded from: classes.dex */
public abstract class kue {
    public static final tu1 a = new tu1(new ev1(1), false, 1309066032);
    public static final tu1 b = new tu1(new ev1(2), false, 1073792494);
    public static final ftc c = ftc.b;
    public static final String[] d = {"input", "keygen", "object", "select", "textarea"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x88, java.lang.Object] */
    public static final re5 a(t88 t88Var, xt4 xt4Var) {
        t88Var.getClass();
        ye5 ye5Var = new ye5();
        xt4Var.invoke(ye5Var);
        xt4 xt4Var2 = ye5Var.d;
        xt4Var2.getClass();
        ?? obj = new Object();
        obj.a = new bo7(24);
        xt4Var2.invoke(obj);
        return new re5(new b98(obj), ye5Var);
    }

    public static final void b(String str, String str2, String str3, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        cz7 cz7Var2;
        boolean z2;
        boolean z3;
        pb2 pb2Var;
        str.getClass();
        str2.getClass();
        str3.getClass();
        cz7Var.getClass();
        rv4Var.g0(2085675782);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.f(cz7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        boolean z4 = true;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            String o = eub.o(str, "-", str3);
            if ((i9 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z3 | z2;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z5 || P == obj) {
                P = new m43(str, str3, 2);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(br6.class);
                br6 br6Var = (br6) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", o), pb2Var2, a3, vt4Var));
                aw7 z6 = jsc.z(br6Var.X, rv4Var);
                aw7 z7 = jsc.z(br6Var.d, rv4Var);
                Object[] objArr = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new v16(23);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
                cz7Var2 = cz7Var;
                fxe.h(str2, null, false, jce.E(-133414134, new h64(cz7Var, 12), rv4Var), jce.E(-1394147775, new i64(4, aw7Var, z7), rv4Var), null, jce.E(-310207397, new jb2(str, str3, cz7Var, z6, br6Var), rv4Var), rv4Var, ((i9 >> 3) & 14) | 1600512, 38);
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f = rv4Var.f(aw7Var);
                Object P3 = rv4Var.P();
                if (f || P3 == obj) {
                    P3 = new qp4(aw7Var, 26);
                    rv4Var.o0(P3);
                }
                xt4 xt4Var = (xt4) P3;
                boolean f2 = rv4Var.f(aw7Var);
                if ((i9 & 7168) != 2048) {
                    z4 = false;
                }
                boolean z8 = f2 | z4;
                Object P4 = rv4Var.P();
                if (z8 || P4 == obj) {
                    P4 = new rp0(cz7Var2, aw7Var, 19);
                    rv4Var.o0(P4);
                }
                cae.g(booleanValue, null, str, xt4Var, (vt4) P4, rv4Var, (i9 << 6) & 896);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wq6(str, str2, str3, cz7Var2, i, 0);
        }
    }

    public static final float c(lw8 lw8Var, boolean z, u95[] u95VarArr, float f) {
        boolean z2;
        float f2 = Float.NaN;
        for (u95 u95Var : u95VarArr) {
            float g = lw8Var.g(u95Var, Float.NaN);
            if (!Float.isNaN(f2)) {
                if (g > f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f2 = g;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return f2;
    }

    public static void d(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        xk5.k(rs8.i(obj2, "null key in entry: null="));
    }

    public static void e(int i, String str) {
        if (i >= 0) {
            return;
        }
        vs.m(a82.m(str, " cannot be negative but was: ", i));
    }

    public static final double f(double d2, am3 am3Var) {
        TimeUnit timeUnit = am3Var.a;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long convert = timeUnit.convert(1L, timeUnit2);
        if (convert > 0) {
            return d2 * convert;
        }
        return d2 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long g(long j, am3 am3Var) {
        long j2;
        int ordinal = am3Var.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            j2 = 86400000;
                        } else {
                            xk5.p(am3Var, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j2 = 3600000;
                    }
                } else {
                    j2 = 60000;
                }
            } else {
                j2 = 1000;
            }
        } else {
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 == 1) {
            if (j <= 4611686018427387903L) {
                return j;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static final sdd h(View view) {
        sdd sddVar;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof sdd) {
                sddVar = (sdd) tag;
            } else {
                sddVar = null;
            }
            if (sddVar != null) {
                return sddVar;
            }
            ViewParent q = gue.q(view);
            if (q instanceof View) {
                view = (View) q;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final Intent i(k5 k5Var, smc smcVar, int i, xt4 xt4Var) {
        int i2 = smcVar.b;
        if (k5Var instanceof lya) {
            lya lyaVar = (lya) k5Var;
            Intent k = k(lyaVar, (r5) xt4Var.invoke(lyaVar.b));
            if (k.getData() == null) {
                k.setData(ade.p(smcVar, i, 5, ""));
            }
            return k;
        } else if (k5Var instanceof pv9) {
            int i3 = ActionCallbackBroadcastReceiver.a;
            pv9 pv9Var = (pv9) k5Var;
            return ade.n(fce.u(smcVar.a, pv9Var.a, i2, (r5) xt4Var.invoke(pv9Var.b)), smcVar, i);
        } else if (k5Var instanceof hb6) {
            ComponentName componentName = smcVar.n;
            if (componentName != null) {
                return ade.n(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2), smcVar, i);
            }
            vs.m("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        } else {
            xk5.p(k5Var, "Cannot create fill-in Intent for action type: ");
            return null;
        }
    }

    public static final PendingIntent j(k5 k5Var, smc smcVar, int i, xt4 xt4Var) {
        int i2 = smcVar.b;
        Context context = smcVar.a;
        if (k5Var instanceof lya) {
            lya lyaVar = (lya) k5Var;
            Intent k = k(lyaVar, (r5) xt4Var.invoke(lyaVar.b));
            if (k.getData() == null) {
                k.setData(ade.p(smcVar, i, 5, ""));
            }
            return PendingIntent.getActivity(context, 0, k, 201326592, null);
        } else if (k5Var instanceof pv9) {
            int i3 = ActionCallbackBroadcastReceiver.a;
            pv9 pv9Var = (pv9) k5Var;
            Intent u = fce.u(context, pv9Var.a, i2, (r5) xt4Var.invoke(pv9Var.b));
            u.setData(ade.p(smcVar, i, 5, ""));
            return PendingIntent.getBroadcast(context, 0, u, 201326592);
        } else if (k5Var instanceof hb6) {
            ComponentName componentName = smcVar.n;
            if (componentName != null) {
                Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2);
                putExtra.setData(ade.p(smcVar, i, 5, null));
                return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
            }
            vs.m("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        } else {
            xk5.p(k5Var, "Cannot create PendingIntent for action type: ");
            return null;
        }
    }

    public static final Intent k(lya lyaVar, r5 r5Var) {
        if (lyaVar instanceof lya) {
            Intent intent = lyaVar.a;
            Map unmodifiableMap = Collections.unmodifiableMap(((pu7) r5Var).a);
            ArrayList arrayList = new ArrayList(unmodifiableMap.size());
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                arrayList.add(new yk8(((p5) entry.getKey()).a, entry.getValue()));
            }
            yk8[] yk8VarArr = (yk8[]) arrayList.toArray(new yk8[0]);
            intent.putExtras(jsc.v((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length)));
            return intent;
        }
        xk5.p(lyaVar, "Action type not defined in app widget package: ");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e0, code lost:
        r0 = defpackage.fca.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
        defpackage.dxe.r(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qjb l(defpackage.cw9 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kue.l(cw9, java.lang.String):qjb");
    }

    public static ArrayList m(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b2 = asReadOnlyBuffer.get();
                int i = (b2 >> 3) & 15;
                if (((b2 >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b2 >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b3 = asReadOnlyBuffer.get();
                        remaining |= (b3 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b3 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new w78(i, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }
}
