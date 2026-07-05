package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v7c  reason: default package */
/* loaded from: classes.dex */
public final class v7c implements AutoCloseable {
    public final wn5 C;
    public final qw6 a;
    public final jm9 b;
    public boolean c;
    public final ArrayList d;
    public final Object e;
    public int f;

    public v7c(qw6 qw6Var, jm9 jm9Var) {
        qw6Var.getClass();
        jm9Var.getClass();
        this.a = qw6Var;
        this.b = jm9Var;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = new Object();
        this.C = jm9Var.x0();
        arrayList.add(jm9Var);
        this.f++;
        mw6 mw6Var = mw6.b;
        if (qw6Var.a(mw6Var)) {
            pj pjVar = qw6Var.b;
            String str = qw6Var.a;
            pjVar.getClass();
            pj.a(mw6Var, str, "TileDecoder. useDecoder. regionDecoderCount=" + this.f + ". " + this.b);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean z;
        synchronized (this.e) {
            z = this.c;
        }
        if (!z) {
            this.c = true;
            qw6 qw6Var = this.a;
            qw6Var.getClass();
            mw6 mw6Var = mw6.b;
            if (qw6Var.a(mw6Var)) {
                pj pjVar = qw6Var.b;
                String str = qw6Var.a;
                pjVar.getClass();
                pj.a(mw6Var, str, "TileDecoder. close. " + this.b);
            }
            synchronized (this.e) {
                try {
                    ArrayList arrayList = this.d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        jm9 jm9Var = (jm9) obj;
                        jm9Var.getClass();
                        try {
                            eub.u(jm9Var);
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                        }
                    }
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Bitmap o(vy5 vy5Var, int i) {
        boolean z;
        synchronized (this.e) {
            z = this.c;
        }
        jm9 jm9Var = null;
        if (!z) {
            synchronized (this.e) {
                if (!this.d.isEmpty()) {
                    jm9Var = (jm9) this.d.remove(0);
                }
            }
            if (jm9Var == null) {
                this.f++;
                qw6 qw6Var = this.a;
                qw6Var.getClass();
                mw6 mw6Var = mw6.b;
                if (qw6Var.a(mw6Var)) {
                    pj pjVar = qw6Var.b;
                    String str = qw6Var.a;
                    pjVar.getClass();
                    pj.a(mw6Var, str, "TileDecoder. useDecoder. regionDecoderCount=" + this.f + ". " + this.b);
                }
                jm9Var = this.b.c();
            }
            Bitmap f0 = jm9Var.f0(vy5Var, i);
            synchronized (this.e) {
                if (!this.c) {
                    this.d.add(jm9Var);
                } else {
                    try {
                        eub.u(jm9Var);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
            }
            return f0;
        }
        cy7.c(this.b, "TileDecoder is closed. ");
        return null;
    }

    public final String toString() {
        return "TileDecoder(" + this.b + ')';
    }
}
