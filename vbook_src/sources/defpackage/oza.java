package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oza  reason: default package */
/* loaded from: classes.dex */
public final class oza implements InputConnection {
    public final kn a;
    public final gw7 b = new gw7(new xt4[16], 0);
    public final InputConnectionWrapper c;

    /* JADX WARN: Type inference failed for: r4v2, types: [nza, android.view.inputmethod.InputConnectionWrapper] */
    public oza(kn knVar, EditorInfo editorInfo) {
        InputConnectionWrapper gw5Var;
        InputConnectionWrapper inputConnectionWrapper;
        this.a = knVar;
        ?? inputConnectionWrapper2 = new InputConnectionWrapper(this, false);
        v28 v28Var = new v28(this);
        if (editorInfo != null) {
            if (Build.VERSION.SDK_INT >= 25) {
                new fw5(inputConnectionWrapper2, v28Var);
            } else {
                inputConnectionWrapper = inputConnectionWrapper2;
                gw5Var = po3.b(editorInfo).length != 0 ? new gw5(inputConnectionWrapper2, v28Var) : gw5Var;
                this.c = inputConnectionWrapper;
                return;
            }
            inputConnectionWrapper = gw5Var;
            this.c = inputConnectionWrapper;
            return;
        }
        xk5.k("editorInfo must be non-null");
        throw null;
    }

    public final grb a() {
        return ((mkc) this.a.d).f();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((vdf) this.a.b).b++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        CharSequence charSequence;
        if (completionInfo != null) {
            charSequence = completionInfo.getText();
        } else {
            charSequence = null;
        }
        Objects.toString(charSequence);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return po3.a(this.c, inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.i(new bl(charSequence.toString(), i, 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        kn knVar = this.a;
        knVar.i(new zr5(i, i2, knVar, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.i(new pp5(i, i2, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((vdf) this.a.b).e();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.i(new oi5(15));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), fxb.g(a().e), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        grb a = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a.d.length();
        extractedText.partialStartOffset = -1;
        long j = a.e;
        extractedText.selectionStart = fxb.g(j);
        extractedText.selectionEnd = fxb.f(j);
        extractedText.flags = !k4b.W(a, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (fxb.d(a().e)) {
            return null;
        }
        grb a = a();
        return a.d.subSequence(fxb.g(a.e), fxb.f(a.e)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        grb a = a();
        long j = a.e;
        CharSequence charSequence = a.d;
        int f = fxb.f(j);
        int f2 = fxb.f(a.e);
        int i3 = f2 + i;
        if (((f2 ^ i3) & (i ^ i3)) < 0) {
            i3 = charSequence.length();
        }
        return charSequence.subSequence(f, Math.min(i3, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        grb a = a();
        int g = fxb.g(a.e);
        int i3 = g - i;
        if (((i ^ g) & (g ^ i3)) < 0) {
            i3 = 0;
        }
        return a.d.subSequence(Math.max(0, i3), fxb.g(a.e)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case 16908319:
                int length = a().d.length();
                kn knVar = this.a;
                knVar.i(new zr5(knVar, 0, length));
                return false;
            case 16908320:
                b(277);
                return false;
            case 16908321:
                b(278);
                return false;
            case 16908322:
                b(279);
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L6
            switch(r3) {
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                case 7: goto L8;
                default: goto L6;
            }
        L6:
            r3 = r0
            goto L13
        L8:
            r3 = 5
            goto L13
        La:
            r3 = 7
            goto L13
        Lc:
            r3 = 6
            goto L13
        Le:
            r3 = 4
            goto L13
        L10:
            r3 = 3
            goto L13
        L12:
            r3 = 2
        L13:
            kn r2 = r2.a
            java.lang.Object r2 = r2.f
            xt4 r2 = (defpackage.xt4) r2
            if (r2 == 0) goto L23
            xr5 r1 = new xr5
            r1.<init>(r3)
            r2.invoke(r1)
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oza.performEditorAction(int):boolean");
    }

    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            if (i2 >= 34) {
                kn knVar = this.a;
                i = k4.x((mkc) knVar.d, handwritingGesture, (hvb) knVar.E, (vt4) knVar.F, (ucd) knVar.G);
            } else {
                i = 2;
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new yu(intConsumer, i, 1));
            } else {
                intConsumer.accept(i);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && i >= 34) {
            kn knVar = this.a;
            return k4.z((mkc) knVar.d, previewableHandwritingGesture, (hvb) knVar.E, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            kn r9 = r9.a
            java.lang.Object r9 = r9.D
            ce2 r9 = (defpackage.ce2) r9
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            r3 = r10 & 2
            if (r3 == 0) goto L15
            r3 = r2
            goto L16
        L15:
            r3 = r1
        L16:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4f
            r5 = r10 & 16
            if (r5 == 0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 8
            if (r6 == 0) goto L29
            r6 = r2
            goto L2a
        L29:
            r6 = r1
        L2a:
            r7 = r10 & 4
            if (r7 == 0) goto L30
            r7 = r2
            goto L31
        L30:
            r7 = r1
        L31:
            r8 = 34
            if (r4 < r8) goto L3a
            r10 = r10 & 32
            if (r10 == 0) goto L3a
            r1 = r2
        L3a:
            if (r5 != 0) goto L4c
            if (r6 != 0) goto L4c
            if (r7 != 0) goto L4c
            if (r1 != 0) goto L4c
            if (r4 < r8) goto L49
            r10 = r2
            r1 = r10
        L46:
            r5 = r1
        L47:
            r6 = r5
            goto L52
        L49:
            r10 = r1
            r1 = r2
            goto L46
        L4c:
            r10 = r1
            r1 = r7
            goto L52
        L4f:
            r10 = r1
            r5 = r2
            goto L47
        L52:
            r9.f = r5
            r9.g = r6
            r9.h = r1
            r9.i = r10
            if (r0 == 0) goto L6f
            android.view.inputmethod.CursorAnchorInfo r10 = r9.a()
            if (r10 == 0) goto L6f
            kw5 r0 = r9.c
            android.view.inputmethod.InputMethodManager r1 = r0.C()
            java.lang.Object r0 = r0.b
            android.view.View r0 = (android.view.View) r0
            r1.updateCursorAnchorInfo(r0, r10)
        L6f:
            iya r10 = r9.e
            r0 = 0
            if (r3 == 0) goto L8f
            if (r10 == 0) goto L7d
            boolean r10 = r10.isActive()
            if (r10 != r2) goto L7d
            return r2
        L7d:
            m82 r10 = r9.d
            oi r1 = new oi
            r3 = 18
            r1.<init>(r9, r0, r3)
            p82 r3 = defpackage.p82.d
            iya r10 = defpackage.z87.v(r10, r0, r3, r1, r2)
            r9.e = r10
            return r2
        L8f:
            if (r10 == 0) goto L94
            r10.cancel(r0)
        L94:
            r9.e = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oza.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        kw5 kw5Var = (kw5) this.a.e;
        kw5Var.C().dispatchKeyEventFromInputMethod((View) kw5Var.b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        kn knVar = this.a;
        knVar.i(new zr5(i, i2, knVar, 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Spanned spanned;
        Object[] spans;
        uva uvaVar;
        eo4 eo4Var;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String obj = charSequence.toString();
        ArrayList arrayList = null;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj2 : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj2 instanceof BackgroundColorSpan) {
                    uvaVar = new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, sve.b(((BackgroundColorSpan) obj2).getBackgroundColor()), null, null, 63487);
                } else if (obj2 instanceof ForegroundColorSpan) {
                    uvaVar = new uva(sve.b(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                } else if (obj2 instanceof StrikethroughSpan) {
                    uvaVar = new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, gpb.d, null, 61439);
                } else if (obj2 instanceof StyleSpan) {
                    int style = ((StyleSpan) obj2).getStyle();
                    if (style != 1) {
                        if (style != 2) {
                            if (style == 3) {
                                uvaVar = new uva(0L, 0L, dq4.D, new wp4(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523);
                            }
                            uvaVar = null;
                        } else {
                            uvaVar = new uva(0L, 0L, null, new wp4(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                        }
                    } else {
                        uvaVar = new uva(0L, 0L, dq4.D, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                    }
                } else if (obj2 instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                    String family = typefaceSpan.getFamily();
                    if (c16.i(family, "cursive")) {
                        eo4Var = eo4.e;
                    } else if (c16.i(family, "monospace")) {
                        eo4Var = eo4.d;
                    } else if (c16.i(family, "sans-serif")) {
                        eo4Var = eo4.b;
                    } else if (c16.i(family, "serif")) {
                        eo4Var = eo4.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 != null && family2.length() != 0) {
                            Typeface create = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            create = (c16.i(create, typeface) || c16.i(create, Typeface.create(typeface, 0))) ? null : null;
                            if (create != null) {
                                eo4Var = new ds6(new mce(create));
                            }
                        }
                        eo4Var = null;
                    }
                    uvaVar = new uva(0L, 0L, null, null, null, eo4Var, null, 0L, null, null, null, 0L, null, null, 65503);
                } else {
                    if (obj2 instanceof UnderlineSpan) {
                        uvaVar = new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, gpb.c, null, 61439);
                    }
                    uvaVar = null;
                }
                if (uvaVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new os(uvaVar, spanned.getSpanStart(obj2), spanned.getSpanEnd(obj2)));
                }
            }
            arrayList = arrayList2;
        }
        this.a.i(new in2(i, obj, arrayList, 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        kn knVar = this.a;
        knVar.i(new zr5(knVar, i, i2));
        ((xt4) knVar.C).invoke(Boolean.FALSE);
        return true;
    }
}
