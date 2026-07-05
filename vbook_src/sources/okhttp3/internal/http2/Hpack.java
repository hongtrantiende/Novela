package okhttp3.internal.http2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class Hpack {
    public static final Header[] a;
    public static final Map b;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Reader {
        public long c;
        public final mj9 d;
        public int g;
        public int h;
        public int a = 4096;
        public final ArrayList b = new ArrayList();
        public Header[] e = new Header[8];
        public int f = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.d = new mj9(continuationSource);
        }

        public final void a(Header header) {
            this.b.add(header);
            long e = this.c + header.b.e() + header.a.e();
            this.c = e;
            if (e <= 262144) {
                return;
            }
            fb4.k("header byte count limit of 262144 exceeded");
        }

        public final int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    header.getClass();
                    int i4 = header.c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                Header[] headerArr = this.e;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public final e31 c(int i) {
            if (i >= 0) {
                Header[] headerArr = Hpack.a;
                if (i <= headerArr.length - 1) {
                    return headerArr[i].a;
                }
            }
            int length = this.f + 1 + (i - Hpack.a.length);
            if (length >= 0) {
                Header[] headerArr2 = this.e;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    header.getClass();
                    return header.a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void d(Header header) {
            a(header);
            int i = header.c;
            int i2 = this.a;
            if (i > i2) {
                b00.g0(0, r7.length, null, this.e);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            b((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr = this.e;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f = this.e.length - 1;
                this.e = headerArr2;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = header;
            this.g++;
            this.h += i;
        }

        /* JADX WARN: Type inference failed for: r11v5, types: [my0, java.lang.Object] */
        public final e31 e() {
            boolean z;
            mj9 mj9Var = this.d;
            byte readByte = mj9Var.readByte();
            byte[] bArr = _UtilCommonKt.a;
            int i = readByte & 255;
            int i2 = 0;
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long f = f(i, Token.SWITCH);
            if (this.c + f <= 262144) {
                if (z) {
                    ?? obj = new Object();
                    int[] iArr = Huffman.a;
                    mj9Var.getClass();
                    Huffman.Node node = Huffman.c;
                    Huffman.Node node2 = node;
                    int i3 = 0;
                    for (long j = 0; j < f; j++) {
                        byte readByte2 = mj9Var.readByte();
                        byte[] bArr2 = _UtilCommonKt.a;
                        i2 = (i2 << 8) | (readByte2 & 255);
                        i3 += 8;
                        while (i3 >= 8) {
                            Huffman.Node[] nodeArr = node2.a;
                            nodeArr.getClass();
                            node2 = nodeArr[(i2 >>> (i3 - 8)) & 255];
                            node2.getClass();
                            if (node2.a == null) {
                                obj.k1(node2.b);
                                i3 -= node2.c;
                                node2 = node;
                            } else {
                                i3 -= 8;
                            }
                        }
                    }
                    while (i3 > 0) {
                        Huffman.Node[] nodeArr2 = node2.a;
                        nodeArr2.getClass();
                        Huffman.Node node3 = nodeArr2[(i2 << (8 - i3)) & 255];
                        node3.getClass();
                        int i4 = node3.c;
                        if (node3.a != null || i4 > i3) {
                            break;
                        }
                        obj.k1(node3.b);
                        i3 -= i4;
                        node2 = node;
                    }
                    return obj.B(obj.b);
                }
                return mj9Var.B(f);
            }
            fb4.k("header byte count limit of 262144 exceeded");
            return null;
        }

        public final int f(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            long j = i2;
            int i4 = 0;
            int i5 = 0;
            while (i4 != 5) {
                byte readByte = this.d.readByte();
                byte[] bArr = _UtilCommonKt.a;
                i4++;
                long j2 = (readByte & Byte.MAX_VALUE) << i5;
                if (j2 <= 2147483647L - j) {
                    j += j2;
                    if ((readByte & 128) != 0) {
                        i5 += 7;
                    } else {
                        return (int) j;
                    }
                } else {
                    fb4.k("HPACK integer overflow");
                    return 0;
                }
            }
            fb4.k("HPACK integer overflow");
            return 0;
        }
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static final class Writer {
        public final my0 a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public Header[] e = new Header[8];
        public int f = 7;

        public Writer(my0 my0Var) {
            this.a = my0Var;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    header.getClass();
                    i -= header.c;
                    int i4 = this.h;
                    Header header2 = this.e[length];
                    header2.getClass();
                    this.h = i4 - header2.c;
                    this.g--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.g);
                Header[] headerArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(Header header) {
            int i = header.c;
            int i2 = this.d;
            if (i > i2) {
                Header[] headerArr = this.e;
                b00.g0(0, headerArr.length, null, headerArr);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr2 = this.e;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f = this.e.length - 1;
                this.e = headerArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = header;
            this.g++;
            this.h += i;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [my0, java.lang.Object] */
        public final void c(e31 e31Var) {
            e31Var.getClass();
            int[] iArr = Huffman.a;
            int e = e31Var.e();
            long j = 0;
            int i = 0;
            long j2 = 0;
            for (int i2 = 0; i2 < e; i2++) {
                byte j3 = e31Var.j(i2);
                byte[] bArr = _UtilCommonKt.a;
                j2 += Huffman.b[j3 & 255];
            }
            int i3 = (int) ((j2 + 7) >> 3);
            int e2 = e31Var.e();
            my0 my0Var = this.a;
            if (i3 < e2) {
                ?? obj = new Object();
                int[] iArr2 = Huffman.a;
                int e3 = e31Var.e();
                byte b = 0;
                while (i < e3) {
                    byte j4 = e31Var.j(i);
                    byte[] bArr2 = _UtilCommonKt.a;
                    int i4 = j4 & 255;
                    int i5 = Huffman.a[i4];
                    byte b2 = Huffman.b[i4];
                    j = (j << b2) | i5;
                    int i6 = b + b2;
                    while (i6 >= 8) {
                        i6 = (i6 == 1 ? 1 : 0) - 8;
                        obj.k1((int) (j >> i6));
                    }
                    i++;
                    b = i6;
                }
                if (b > 0) {
                    obj.k1((int) ((j << (8 - b)) | (255 >>> b)));
                }
                e31 B = obj.B(obj.b);
                e(B.e(), Token.SWITCH, Token.CASE);
                my0Var.g1(B);
                return;
            }
            e(e31Var.e(), Token.SWITCH, 0);
            my0Var.g1(e31Var);
        }

        public final void d(ArrayList arrayList) {
            int i;
            int i2;
            if (this.c) {
                int i3 = this.b;
                if (i3 < this.d) {
                    e(i3, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                e(this.d, 31, 32);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header header = (Header) arrayList.get(i4);
                e31 r = header.a.r();
                e31 e31Var = header.b;
                Integer num = (Integer) Hpack.b.get(r);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        Header[] headerArr = Hpack.a;
                        if (c16.i(headerArr[intValue].b, e31Var)) {
                            i = i2;
                        } else if (c16.i(headerArr[i2].b, e31Var)) {
                            i2 = intValue + 2;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f + 1;
                    int length = this.e.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Header header2 = this.e[i5];
                        header2.getClass();
                        if (c16.i(header2.a, r)) {
                            Header header3 = this.e[i5];
                            header3.getClass();
                            if (c16.i(header3.b, e31Var)) {
                                i2 = Hpack.a.length + (i5 - this.f);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f) + Hpack.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    e(i2, Token.SWITCH, Token.CASE);
                } else if (i == -1) {
                    this.a.k1(64);
                    c(r);
                    c(e31Var);
                    b(header);
                } else {
                    e31 e31Var2 = Header.d;
                    r.getClass();
                    e31Var2.getClass();
                    if (r.m(0, e31Var2, e31Var2.e()) && !c16.i(Header.i, r)) {
                        e(i, 15, 0);
                        c(e31Var);
                    } else {
                        e(i, 63, 64);
                        c(e31Var);
                        b(header);
                    }
                }
            }
        }

        public final void e(int i, int i2, int i3) {
            my0 my0Var = this.a;
            if (i < i2) {
                my0Var.k1(i | i3);
                return;
            }
            my0Var.k1(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                my0Var.k1(128 | (i4 & Token.SWITCH));
                i4 >>>= 7;
            }
            my0Var.k1(i4);
        }
    }

    static {
        Header header = new Header(Header.i, "");
        e31 e31Var = Header.f;
        Header header2 = new Header(e31Var, "GET");
        Header header3 = new Header(e31Var, "POST");
        e31 e31Var2 = Header.g;
        Header header4 = new Header(e31Var2, "/");
        Header header5 = new Header(e31Var2, "/index.html");
        e31 e31Var3 = Header.h;
        Header header6 = new Header(e31Var3, "http");
        Header header7 = new Header(e31Var3, "https");
        e31 e31Var4 = Header.e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(e31Var4, "200"), new Header(e31Var4, "204"), new Header(e31Var4, "206"), new Header(e31Var4, "304"), new Header(e31Var4, "400"), new Header(e31Var4, "404"), new Header(e31Var4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].a)) {
                linkedHashMap.put(headerArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(e31 e31Var) {
        e31Var.getClass();
        int e = e31Var.e();
        for (int i = 0; i < e; i++) {
            byte j = e31Var.j(i);
            if (65 <= j && j < 91) {
                fb4.k("PROTOCOL_ERROR response malformed: mixed case name: ".concat(e31Var.t()));
                return;
            }
        }
    }
}
