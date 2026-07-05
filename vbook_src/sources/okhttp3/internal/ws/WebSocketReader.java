package okhttp3.internal.ws;

import java.io.Closeable;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class WebSocketReader implements Closeable {
    public int C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final my0 H;
    public final my0 I;
    public MessageInflater J;
    public final byte[] K;
    public final bz0 a;
    public final FrameCallback b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public boolean f;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void c(e31 e31Var);

        void d(e31 e31Var);

        void e(String str);

        void g(e31 e31Var);

        void h(int i, String str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [my0, java.lang.Object] */
    public WebSocketReader(bz0 bz0Var, FrameCallback frameCallback, boolean z, boolean z2) {
        bz0Var.getClass();
        this.a = bz0Var;
        this.b = frameCallback;
        this.c = z;
        this.d = z2;
        this.H = new Object();
        this.I = new Object();
        this.K = null;
    }

    public final void C() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (!this.f) {
            bz0 bz0Var = this.a;
            long h = bz0Var.timeout().h();
            bz0Var.timeout().b();
            try {
                byte readByte = bz0Var.readByte();
                byte[] bArr = _UtilCommonKt.a;
                bz0Var.timeout().g(h, timeUnit);
                int i = readByte & 15;
                this.C = i;
                boolean z5 = false;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.E = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.F = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.c) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.G = z4;
                }
                if ((readByte & 32) == 0) {
                    if ((readByte & 16) == 0) {
                        byte readByte2 = bz0Var.readByte();
                        if ((readByte2 & 128) != 0) {
                            z5 = true;
                        }
                        if (!z5) {
                            long j = readByte2 & Byte.MAX_VALUE;
                            this.D = j;
                            if (j == 126) {
                                this.D = bz0Var.readShort() & 65535;
                            } else if (j == 127) {
                                long readLong = bz0Var.readLong();
                                this.D = readLong;
                                if (readLong < 0) {
                                    long j2 = this.D;
                                    TimeZone timeZone = _UtilJvmKt.a;
                                    String hexString = Long.toHexString(j2);
                                    hexString.getClass();
                                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.F && this.D > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            }
                            if (z5) {
                                byte[] bArr2 = this.K;
                                bArr2.getClass();
                                bz0Var.readFully(bArr2);
                                return;
                            }
                            return;
                        }
                        throw new ProtocolException("Server-sent frames must not be masked.");
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th) {
                bz0Var.timeout().g(h, timeUnit);
                throw th;
            }
        }
        fb4.k("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        MessageInflater messageInflater = this.J;
        if (messageInflater != null) {
            _UtilCommonKt.b(messageInflater);
        }
        _UtilCommonKt.b(this.a);
    }

    public final void o() {
        if (!this.e) {
            C();
            if (this.F) {
                q();
                return;
            }
            int i = this.C;
            if (i != 1 && i != 2) {
                TimeZone timeZone = _UtilJvmKt.a;
                String hexString = Integer.toHexString(i);
                hexString.getClass();
                throw new ProtocolException("Unknown opcode: ".concat(hexString));
            }
            while (!this.f) {
                long j = this.D;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                my0 my0Var = this.I;
                if (i2 > 0) {
                    this.a.w0(my0Var, j);
                }
                if (!this.E) {
                    while (!this.f) {
                        C();
                        if (!this.F) {
                            break;
                        }
                        q();
                    }
                    if (this.C != 0) {
                        int i3 = this.C;
                        TimeZone timeZone2 = _UtilJvmKt.a;
                        String hexString2 = Integer.toHexString(i3);
                        hexString2.getClass();
                        throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
                    }
                } else {
                    if (this.G) {
                        MessageInflater messageInflater = this.J;
                        if (messageInflater == null) {
                            messageInflater = new MessageInflater(this.d);
                            this.J = messageInflater;
                        }
                        my0 my0Var2 = messageInflater.b;
                        if (my0Var2.b == 0) {
                            Inflater inflater = messageInflater.c;
                            if (inflater == null) {
                                inflater = new Inflater(true);
                                messageInflater.c = inflater;
                            }
                            bv5 bv5Var = messageInflater.d;
                            if (bv5Var == null) {
                                bv5Var = new bv5(new mj9(my0Var2), inflater);
                                messageInflater.d = bv5Var;
                            }
                            if (messageInflater.a) {
                                inflater.reset();
                            }
                            my0Var2.J(my0Var);
                            my0Var2.m9writeInt(65535);
                            long bytesRead = inflater.getBytesRead() + my0Var2.b;
                            do {
                                bv5Var.o(my0Var, Long.MAX_VALUE);
                                if (inflater.getBytesRead() >= bytesRead) {
                                    break;
                                }
                            } while (!inflater.finished());
                            if (inflater.getBytesRead() < bytesRead) {
                                my0Var2.o();
                                bv5Var.close();
                                messageInflater.d = null;
                                messageInflater.c = null;
                            }
                        } else {
                            vs.m("Failed requirement.");
                            return;
                        }
                    }
                    FrameCallback frameCallback = this.b;
                    if (i == 1) {
                        frameCallback.e(my0Var.N0());
                        return;
                    } else {
                        frameCallback.c(my0Var.B(my0Var.b));
                        return;
                    }
                }
            }
            fb4.k("closed");
            return;
        }
        vs.k("closed");
    }

    public final void q() {
        short s;
        String str;
        long j = this.D;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        my0 my0Var = this.H;
        if (i > 0) {
            this.a.w0(my0Var, j);
        }
        int i2 = this.C;
        FrameCallback frameCallback = this.b;
        switch (i2) {
            case 8:
                long j2 = my0Var.b;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = my0Var.readShort();
                        str = my0Var.N0();
                        String a = WebSocketProtocol.a(s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    frameCallback.h(s, str);
                    this.f = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                frameCallback.d(my0Var.B(my0Var.b));
                return;
            case 10:
                frameCallback.g(my0Var.B(my0Var.b));
                return;
            default:
                int i3 = this.C;
                TimeZone timeZone = _UtilJvmKt.a;
                String hexString = Integer.toHexString(i3);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }
}
