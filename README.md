# Wax Item Frames

Wax item frames to **lock** them: no rotate / swap / break while waxed.

Server-side logic. Clients do not need the mod for the behaviour to apply on a dedicated server.  
Works in singleplayer.

## Mechanics

- **Wax**: `sneak` + `use` honeycomb on an item frame :  
  item frame is waxed (honeycomb consumed, wax particles/sound).
- **Unwax**: `sneak` + `use` any axe :  
  removes wax (axe loses 1 durability).
- While waxed:
  - interactions are blocked;
  - damage is cancelled.
- Optional config: keep the frame "fixed" in place while waxed (makes the item frame unbreakable).

## Config

File: `config/waxitemframes.json`

```json
{
  "fix_item_frame_when_waxed": false
}
```

| Key                         | Default | Meaning                                   |
|-----------------------------|---------|-------------------------------------------|
| `fix_item_frame_when_waxed` | `false` | If `true`, a waxed frame always survives. |

## Credits

- Original mod: [Iamaprogrammer](https://github.com/lamaprogramer/WaxItemFrames) (MIT license)
- 26.3 update & Forge/NeoForge ports: [Jahus](https://github.com/DarthJahus)

## License

[MIT](LICENSE)
