package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Http2Reader implements Closeable {
    public static final Logger d;
    public final bz0 a;
    public final ContinuationSource b;
    public final Hpack.Reader c;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static int a(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            fb4.k(rs8.k("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
            return 0;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        logger.getClass();
        d = logger;
    }

    public Http2Reader(bz0 bz0Var) {
        bz0Var.getClass();
        this.a = bz0Var;
        ContinuationSource continuationSource = new ContinuationSource(bz0Var);
        this.b = continuationSource;
        this.c = new Hpack.Reader(continuationSource);
    }

    public final void C(Http2Connection.ReaderRunnable readerRunnable, int i) {
        bz0 bz0Var = this.a;
        bz0Var.readInt();
        bz0Var.readByte();
        byte[] bArr = _UtilCommonKt.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01f4, code lost:
        defpackage.fb4.k(defpackage.a82.j(r9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01fd, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(boolean r18, okhttp3.internal.http2.Http2Connection.ReaderRunnable r19) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.o(boolean, okhttp3.internal.http2.Http2Connection$ReaderRunnable):boolean");
    }

    public final List q(int i, int i2, int i3, int i4) {
        ContinuationSource continuationSource = this.b;
        continuationSource.d = i;
        continuationSource.e = i2;
        continuationSource.b = i3;
        continuationSource.c = i4;
        Hpack.Reader reader = this.c;
        mj9 mj9Var = reader.d;
        while (!mj9Var.k()) {
            byte readByte = mj9Var.readByte();
            byte[] bArr = _UtilCommonKt.a;
            int i5 = readByte & 255;
            if (i5 != 128) {
                if ((readByte & 128) == 128) {
                    int f = reader.f(i5, Token.SWITCH);
                    int i6 = f - 1;
                    if (i6 >= 0) {
                        Header[] headerArr = Hpack.a;
                        if (i6 <= headerArr.length - 1) {
                            reader.a(headerArr[i6]);
                        }
                    }
                    int length = reader.f + 1 + (i6 - Hpack.a.length);
                    if (length >= 0) {
                        Header[] headerArr2 = reader.e;
                        if (length < headerArr2.length) {
                            Header header = headerArr2[length];
                            header.getClass();
                            reader.a(header);
                        }
                    }
                    fb4.k(a82.j(f, "Header index too large "));
                    return null;
                } else if (i5 == 64) {
                    Header[] headerArr3 = Hpack.a;
                    e31 e = reader.e();
                    Hpack.a(e);
                    reader.d(new Header(e, reader.e()));
                } else if ((readByte & 64) == 64) {
                    reader.d(new Header(reader.c(reader.f(i5, 63) - 1), reader.e()));
                } else if ((readByte & 32) == 32) {
                    int f2 = reader.f(i5, 31);
                    reader.a = f2;
                    if (f2 >= 0 && f2 <= 4096) {
                        int i7 = reader.h;
                        if (f2 < i7) {
                            if (f2 == 0) {
                                b00.g0(0, r4.length, null, reader.e);
                                reader.f = reader.e.length - 1;
                                reader.g = 0;
                                reader.h = 0;
                            } else {
                                reader.b(i7 - f2);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + reader.a);
                    }
                } else if (i5 != 16 && i5 != 0) {
                    reader.a(new Header(reader.c(reader.f(i5, 15) - 1), reader.e()));
                } else {
                    Header[] headerArr4 = Hpack.a;
                    e31 e2 = reader.e();
                    Hpack.a(e2);
                    reader.a(new Header(e2, reader.e()));
                }
            } else {
                fb4.k("index == 0");
                return null;
            }
        }
        ArrayList arrayList = reader.b;
        List C0 = sl1.C0(arrayList);
        arrayList.clear();
        reader.c = 0L;
        return C0;
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class ContinuationSource implements osa {
        public final bz0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public ContinuationSource(bz0 bz0Var) {
            bz0Var.getClass();
            this.a = bz0Var;
        }

        @Override // defpackage.osa
        public final long read(my0 my0Var, long j) {
            int i;
            int readInt;
            my0Var.getClass();
            do {
                int i2 = this.d;
                bz0 bz0Var = this.a;
                if (i2 == 0) {
                    bz0Var.skip(this.e);
                    this.e = 0;
                    if ((this.b & 4) == 0) {
                        i = this.c;
                        int m = _UtilCommonKt.m(bz0Var);
                        this.d = m;
                        int readByte = bz0Var.readByte() & 255;
                        this.b = bz0Var.readByte() & 255;
                        Logger logger = Http2Reader.d;
                        if (logger.isLoggable(Level.FINE)) {
                            e31 e31Var = Http2.a;
                            logger.fine(Http2.b(true, this.c, m, readByte, this.b));
                        }
                        readInt = bz0Var.readInt() & Integer.MAX_VALUE;
                        this.c = readInt;
                        if (readByte != 9) {
                            throw new IOException(readByte + " != TYPE_CONTINUATION");
                        }
                    }
                } else {
                    long read = bz0Var.read(my0Var, Math.min(j, i2));
                    if (read != -1) {
                        this.d -= (int) read;
                        return read;
                    }
                }
                return -1L;
            } while (readInt == i);
            fb4.k("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        @Override // defpackage.osa
        public final dac timeout() {
            return this.a.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
