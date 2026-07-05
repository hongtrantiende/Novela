package defpackage;

import android.util.Log;
import java.io.Writer;
import java.util.Objects;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iw6  reason: default package */
/* loaded from: classes.dex */
public final class iw6 extends Writer {
    public final /* synthetic */ int a;
    public final StringBuilder b;
    public final CharSequence c;

    public iw6() {
        this.a = 0;
        this.b = new StringBuilder((int) Token.CASE);
        this.c = "FragmentManager";
    }

    public void C() {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            Log.d((String) this.c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                this.b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                C();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                C();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.a;
        StringBuilder sb = this.b;
        switch (i3) {
            case 0:
                for (int i4 = 0; i4 < i2; i4++) {
                    char c = cArr[i + i4];
                    if (c == '\n') {
                        C();
                    } else {
                        sb.append(c);
                    }
                }
                return;
            default:
                vif vifVar = (vif) this.c;
                vifVar.a = cArr;
                vifVar.b = null;
                sb.append((CharSequence) vifVar, i, i2 + i);
                return;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 1:
                this.b.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 1:
                append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public iw6(StringBuilder sb) {
        this.a = 1;
        this.c = new Object();
        this.b = sb;
    }

    private final void o() {
    }

    private final void q() {
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        switch (this.a) {
            case 1:
                Objects.requireNonNull(str);
                this.b.append((CharSequence) str, i, i2 + i);
                return;
            default:
                super.write(str, i, i2);
                return;
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.a) {
            case 1:
                this.b.append((char) i);
                return;
            default:
                super.write(i);
                return;
        }
    }
}
