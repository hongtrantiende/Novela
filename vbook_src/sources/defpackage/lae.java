package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lae  reason: default package */
/* loaded from: classes.dex */
public final class lae extends ovd {
    public final /* synthetic */ rh0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lae(rh0 rh0Var, Looper looper) {
        super(looper, 4);
        this.a = rh0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        exd exdVar;
        rh0 rh0Var = this.a;
        int i = rh0Var.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (exdVar = (exd) message.obj) != null) {
                synchronized (exdVar) {
                    exdVar.a = null;
                }
                rh0 rh0Var2 = exdVar.c;
                synchronized (rh0Var2.l) {
                    rh0Var2.l.remove(exdVar);
                }
            }
        } else if ((i3 != 1 && i3 != 7 && i3 != 4 && i3 != 5) || rh0Var.q()) {
            int i4 = message.what;
            if (i4 == 4) {
                rh0Var.u = new jz1(message.arg2, null, null);
                if (!rh0Var.v && !TextUtils.isEmpty(rh0Var.m()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(rh0Var.m());
                        if (!rh0Var.v) {
                            rh0Var.u(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                jz1 jz1Var = rh0Var.u;
                if (jz1Var == null) {
                    jz1Var = new jz1(8, null, null);
                }
                rh0Var.j.f(jz1Var);
                System.currentTimeMillis();
            } else if (i4 == 5) {
                jz1 jz1Var2 = rh0Var.u;
                if (jz1Var2 == null) {
                    jz1Var2 = new jz1(8, null, null);
                }
                rh0Var.j.f(jz1Var2);
                System.currentTimeMillis();
            } else if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                rh0Var.j.f(new jz1(message.arg2, pendingIntent2, null));
                System.currentTimeMillis();
            } else if (i4 == 6) {
                rh0Var.u(5, null);
                oh0 oh0Var = rh0Var.o;
                if (oh0Var != null) {
                    oh0Var.e(message.arg2);
                }
                System.currentTimeMillis();
                rh0Var.t(5, 1, null);
            } else if (i4 == 2 && !rh0Var.p()) {
                exd exdVar2 = (exd) message.obj;
                if (exdVar2 != null) {
                    synchronized (exdVar2) {
                        exdVar2.a = null;
                    }
                    rh0 rh0Var3 = exdVar2.c;
                    synchronized (rh0Var3.l) {
                        rh0Var3.l.remove(exdVar2);
                    }
                }
            } else {
                int i5 = message.what;
                if (i5 != 2 && i5 != 1 && i5 != 7) {
                    Log.wtf("GmsClient", nk2.s(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
                    return;
                }
                exd exdVar3 = (exd) message.obj;
                synchronized (exdVar3) {
                    try {
                        bool = exdVar3.a;
                        if (exdVar3.b) {
                            String obj2 = exdVar3.toString();
                            StringBuilder sb = new StringBuilder(obj2.length() + 47);
                            sb.append("Callback proxy ");
                            sb.append(obj2);
                            sb.append(" being reused. This is not safe.");
                            Log.w("GmsClient", sb.toString());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bool != null) {
                    rh0 rh0Var4 = exdVar3.f;
                    int i6 = exdVar3.d;
                    if (i6 == 0) {
                        if (!exdVar3.a()) {
                            rh0Var4.u(1, null);
                            exdVar3.b(new jz1(8, null, null));
                        }
                    } else {
                        rh0Var4.u(1, null);
                        Bundle bundle = exdVar3.e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                        } else {
                            pendingIntent = null;
                        }
                        exdVar3.b(new jz1(i6, pendingIntent, null));
                    }
                }
                synchronized (exdVar3) {
                    exdVar3.b = true;
                }
                synchronized (exdVar3) {
                    exdVar3.a = null;
                }
                rh0 rh0Var5 = exdVar3.c;
                synchronized (rh0Var5.l) {
                    rh0Var5.l.remove(exdVar3);
                }
            }
        } else {
            exd exdVar4 = (exd) message.obj;
            if (exdVar4 != null) {
                synchronized (exdVar4) {
                    exdVar4.a = null;
                }
                rh0 rh0Var6 = exdVar4.c;
                synchronized (rh0Var6.l) {
                    rh0Var6.l.remove(exdVar4);
                }
            }
        }
    }
}
