package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Exchange {
    public final RealCall a;
    public final ExchangeFinder b;
    public final ExchangeCodec c;
    public boolean d;
    public boolean e;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public final class RequestBodySink extends ir4 {
        public boolean C;
        public final /* synthetic */ Exchange D;
        public final long b;
        public final boolean c;
        public boolean d;
        public long e;
        public boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, yma ymaVar, long j, boolean z) {
            super(ymaVar);
            ymaVar.getClass();
            this.D = exchange;
            this.b = j;
            this.c = z;
            this.f = z;
        }

        @Override // defpackage.ir4, defpackage.yma, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.C) {
                return;
            }
            this.C = true;
            long j = this.b;
            if (j != -1 && this.e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                o(null);
            } catch (IOException e) {
                IOException o = o(e);
                o.getClass();
                throw o;
            }
        }

        @Override // defpackage.ir4, defpackage.yma, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                IOException o = o(e);
                o.getClass();
                throw o;
            }
        }

        public final IOException o(IOException iOException) {
            if (this.d) {
                return iOException;
            }
            this.d = true;
            return Exchange.a(this.D, this.e, this.c, iOException, 4);
        }

        @Override // defpackage.ir4, defpackage.yma
        public final void write(my0 my0Var, long j) {
            if (!this.C) {
                long j2 = this.b;
                if (j2 != -1 && this.e + j > j2) {
                    throw new ProtocolException("expected " + this.b + " bytes but received " + (this.e + j));
                }
                try {
                    if (this.f) {
                        this.f = false;
                        this.D.a.e.t(this.D.a);
                    }
                    this.a.write(my0Var, j);
                    this.e += j;
                    return;
                } catch (IOException e) {
                    IOException o = o(e);
                    o.getClass();
                    throw o;
                }
            }
            vs.k("closed");
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public final class ResponseBodySource extends jr4 {
        public boolean C;
        public final /* synthetic */ Exchange D;
        public final long b;
        public final boolean c;
        public long d;
        public boolean e;
        public boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, osa osaVar, long j, boolean z) {
            super(osaVar);
            osaVar.getClass();
            this.D = exchange;
            this.b = j;
            this.c = z;
            this.e = true;
            if (j == 0) {
                o(null);
            }
        }

        @Override // defpackage.jr4, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.C) {
                return;
            }
            this.C = true;
            try {
                super.close();
                o(null);
            } catch (IOException e) {
                IOException o = o(e);
                o.getClass();
                throw o;
            }
        }

        public final IOException o(IOException iOException) {
            if (this.f) {
                return iOException;
            }
            this.f = true;
            if (iOException == null && this.e) {
                this.e = false;
                this.D.a.e.y(this.D.a);
            }
            return Exchange.a(this.D, this.d, this.c, iOException, 8);
        }

        @Override // defpackage.jr4, defpackage.osa
        public final long read(my0 my0Var, long j) {
            my0Var.getClass();
            if (!this.C) {
                try {
                    long read = this.a.read(my0Var, j);
                    if (this.e) {
                        this.e = false;
                        this.D.a.e.y(this.D.a);
                    }
                    if (read == -1) {
                        o(null);
                        return -1L;
                    }
                    long j2 = this.d + read;
                    long j3 = this.b;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.b + " bytes but received " + j2);
                    }
                    this.d = j2;
                    if (this.D.c.c()) {
                        o(null);
                    }
                    return read;
                } catch (IOException e) {
                    IOException o = o(e);
                    o.getClass();
                    throw o;
                }
            }
            vs.k("closed");
            return 0L;
        }
    }

    public Exchange(RealCall realCall, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        exchangeFinder.getClass();
        this.a = realCall;
        this.b = exchangeFinder;
        this.c = exchangeCodec;
    }

    public static IOException a(Exchange exchange, long j, boolean z, IOException iOException, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iOException != null) {
            exchange.f(iOException);
        }
        if (z3) {
            EventListener eventListener = exchange.a.e;
            if (iOException != null) {
                eventListener.u(exchange.a, iOException);
            } else {
                eventListener.s(exchange.a);
            }
        }
        if (z2) {
            EventListener eventListener2 = exchange.a.e;
            if (iOException != null) {
                eventListener2.z(exchange.a, iOException);
            } else {
                eventListener2.x(exchange.a);
            }
        }
        RealCall realCall = exchange.a;
        if (z3 && !z) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && !z) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z3 && z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z2 && z) {
            z7 = true;
        } else {
            z7 = false;
        }
        return realCall.g(exchange, z4, z5, z7, z6, iOException);
    }

    public final yma b(Request request, boolean z) {
        request.getClass();
        this.d = z;
        RequestBody requestBody = request.d;
        requestBody.getClass();
        long a = requestBody.a();
        this.a.e.t(this.a);
        return new RequestBodySink(this, this.c.j(request, a), a, false);
    }

    public final RealConnection c() {
        RealConnection realConnection;
        ExchangeCodec.Carrier i = this.c.i();
        if (i instanceof RealConnection) {
            realConnection = (RealConnection) i;
        } else {
            realConnection = null;
        }
        if (realConnection != null) {
            return realConnection;
        }
        vs.k("no connection for CONNECT tunnels");
        return null;
    }

    public final RealResponseBody d(Response response) {
        Exchange exchange;
        try {
            String a = response.f.a("Content-Type");
            if (a == null) {
                a = null;
            }
            long h = this.c.h(response);
            exchange = this;
            try {
                return new RealResponseBody(a, h, new mj9(new ResponseBodySource(exchange, this.c.d(response), h, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                exchange.a.e.z(exchange.a, iOException);
                exchange.f(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            exchange = this;
        }
    }

    public final Response.Builder e(boolean z) {
        try {
            Response.Builder e = this.c.e(z);
            if (e != null) {
                e.n = this;
                return e;
            }
            return e;
        } catch (IOException e2) {
            this.a.e.z(this.a, e2);
            f(e2);
            throw e2;
        }
    }

    public final void f(IOException iOException) {
        this.e = true;
        this.c.i().c(this.a, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [okhttp3.internal.connection.Exchange$upgradeToSocket$1] */
    public final Exchange$upgradeToSocket$1 g() {
        RealCall realCall = this.a;
        if (!realCall.G) {
            realCall.G = true;
            realCall.f.j();
            synchronized (realCall) {
                if (realCall.O != null) {
                    if (!realCall.K && !realCall.L) {
                        if (!realCall.I) {
                            if (realCall.J) {
                                realCall.J = false;
                                realCall.K = true;
                                realCall.L = true;
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            ExchangeCodec.Carrier i = this.c.i();
            i.getClass();
            RealConnection realConnection = (RealConnection) i;
            realConnection.e.setSoTimeout(0);
            realConnection.f();
            return new wra() { // from class: okhttp3.internal.connection.Exchange$upgradeToSocket$1
                public final Exchange.RequestBodySink a;
                public final Exchange.ResponseBodySource b;

                {
                    ExchangeCodec exchangeCodec = Exchange.this.c;
                    this.a = new Exchange.RequestBodySink(Exchange.this, exchangeCodec.g().b(), -1L, true);
                    this.b = new Exchange.ResponseBodySource(Exchange.this, exchangeCodec.g().c(), -1L, true);
                }

                @Override // defpackage.wra
                public final yma b() {
                    return this.a;
                }

                @Override // defpackage.wra
                public final osa c() {
                    return this.b;
                }

                @Override // defpackage.wra
                public final void cancel() {
                    Exchange.this.c.cancel();
                }
            };
        }
        vs.k("Check failed.");
        return null;
    }

    public final void h(Request request) {
        request.getClass();
        try {
            this.a.e.w(this.a);
            this.c.b(request);
            this.a.e.v(this.a, request);
        } catch (IOException e) {
            this.a.e.u(this.a, e);
            f(e);
            throw e;
        }
    }
}
