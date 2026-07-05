package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs6  reason: default package */
/* loaded from: classes.dex */
public final class fs6 extends Handler implements Runnable {
    public Thread C;
    public boolean D;
    public volatile boolean E;
    public final /* synthetic */ ij1 F;
    public final int a;
    public final gs6 b;
    public final long c;
    public es6 d;
    public IOException e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs6(ij1 ij1Var, Looper looper, gs6 gs6Var, es6 es6Var, int i, long j) {
        super(looper);
        this.F = ij1Var;
        this.b = gs6Var;
        this.d = es6Var;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.E = z;
        this.e = null;
        if (hasMessages(1)) {
            this.D = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.D = true;
                    this.b.c();
                    Thread thread = this.C;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.F.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            es6 es6Var = this.d;
            es6Var.getClass();
            es6Var.f(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        es6 es6Var = this.d;
        es6Var.getClass();
        es6Var.o(this.b, elapsedRealtime, j, this.f);
        this.e = null;
        ij1 ij1Var = this.F;
        fs6 fs6Var = (fs6) ij1Var.c;
        fs6Var.getClass();
        ((dr7) ij1Var.b).execute(fs6Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        if (!this.E) {
            int i = message.what;
            if (i == 1) {
                b();
            } else if (i != 4) {
                this.F.c = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.c;
                es6 es6Var = this.d;
                es6Var.getClass();
                if (this.D) {
                    es6Var.f(this.b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 2) {
                    if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i3 = this.f + 1;
                        this.f = i3;
                        cy5 w = es6Var.w(this.b, elapsedRealtime, j, iOException, i3);
                        int i4 = w.a;
                        if (i4 == 3) {
                            this.F.d = this.e;
                            return;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.f = 1;
                            }
                            long j2 = w.b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.f - 1) * 1000, 5000);
                            }
                            ij1 ij1Var = this.F;
                            if (((fs6) ij1Var.c) == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            wq9.D(z);
                            ij1Var.c = this;
                            if (j2 > 0) {
                                sendEmptyMessageDelayed(1, j2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    es6Var.i(this.b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    st0.i("LoadTask", "Unexpected exception handling load completed", e);
                    this.F.d = new is6(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.D;
                this.C = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.C = null;
                Thread.interrupted();
            }
            if (!this.E) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.E) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.E) {
                st0.i("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new is6(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.E) {
                st0.i("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new is6(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.E) {
                st0.i("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
